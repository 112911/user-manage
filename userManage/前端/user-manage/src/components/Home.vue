<template>
	<div>
		<Alert v-if="alert" v-bind:message="alert"></Alert>

		<input type="text" class="form-control" placeholder="搜索" v-model="filterInput">

		<table class="table table-striped">
			<thead>
				<tr>
					<th>姓名</th>
					<th>电话</th>
					<th>邮箱</th>
					<th>操作</th>
				</tr>
			</thead>

			<tbody>
				<tr v-for="customer in filterBy(customers,filterInput)">
					<td>{{customer.name}}</td>
					<td>{{customer.phone}}</td>
					<td>{{customer.email}}</td>
					<td>
						<router-link class="btn btn-default btn-sm" v-bind:to="'/Users/'+customer.id">详情</router-link>
						<span class="pull-right">
          					<router-link class="btn btn-primary btn-xs" v-bind:to="'/Edit/'+customer.id">编辑</router-link>
    						<button class="btn btn-danger btn-xs" v-on:click="deleteCustomer(customer.id)">删除</button>
  						</span>
					</td>
				</tr>
			</tbody>

		</table>
	</div>
</template>

<script>
	import Alert from './Alert'
	export default {
		name: 'customers',
		data() {
			return {
				customers: [],
				alert: '',
				filterInput: ''
			}
		},
		methods: {
			fetchCustomers() {
				this.$http.get('http://localhost:8080/Users')
					.then((response) => {
						this.customers = response.data
					})
			},
			filterBy(customers, value) {
				return customers.filter(function(customer) {
					return customer.name.match(value)
				})
			},
			deleteCustomer(id) {
				// console.log(id);
				if(confirm("确定要删除该用户吗？")) {
					this.$http.delete('http://localhost:8080/Delete/' + id)
						.then((response) => {
							this.$router.push({
								path: '/',
								query: {
									alert: '用户删除成功!'
								}
							})
						})
				}
			}

		},
		created() {
			if(this.$route.query.alert) {
				this.alert = this.$route.query.alert
			}
			this.fetchCustomers()
		},
		updated() {
			this.fetchCustomers()
		},

		components: {
			Alert
		}
	}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
	input {
		border: 2px solid skyblue !important;
		margin: 20px 0
	}
</style>