<template>
  <div class="details">
  	<router-link to="/" class="btn btn-default">返回</router-link>
    <h1 class="page-header">
    	{{customer.name}}

    	<span class="pull-right col-md-5">
    		<router-link class="btn btn-primary" v-bind:to="'/Edit/'+customer.id">
    			编辑
    		</router-link>
    		<button class="btn btn-danger" v-on:click="deleteCustomer(customer.id)">删除</button>
    	</span>
    </h1>
    <ul class="list-group">
    	<li class="list-group-item">
    		<span class="glyphicon glyphicon-asterisk">
    			<span>&nbsp;电话：</span>
    			{{customer.phone}}
    		</span>
    	</li>
    	<li class="list-group-item">
    		<span class="glyphicon glyphicon-plus">
    			<span>&nbsp;邮箱：</span>
    			{{customer.email}}
    		</span>
    	</li>
    </ul>

    <ul class="list-group">
    	<li class="list-group-item">
    		<span class="glyphicon glyphicon-asterisk">
    			<span>&nbsp;学历：</span>
    			{{customer.education}}
    		</span>
    	</li>
    	<li class="list-group-item">
    		<span class="glyphicon glyphicon-plus">
    			<span>&nbsp;毕业学校：</span>
    			{{customer.graduationschool}}
    		</span>
    	</li>

		<li class="list-group-item">
			<span class="glyphicon glyphicon-asterisk">
				<span>&nbsp;职业：</span>
				{{customer.profession}}
			</span>
		</li>
		<li class="list-group-item">
			<span class="glyphicon glyphicon-plus">
				<span>&nbsp;个人简介：</span>
				{{customer.profile}}
			</span>
		</li>
    </ul>
  </div>
</template>

<script>
export default {
  name: 'cumstomerdetails',
  data () {
    return {
      customer: ''
    }
  },
  methods: {
  
  	fetchCustomers (id) {
      this.$http.get('http://localhost:8080/Users/' + id)
        .then((response)=> {
          //console.log(response)
          this.customer = response.data
        })
    },
    deleteCustomer (id) {
    	// console.log(id);
    	this.$http.delete('http://localhost:8080/Delete/' + id)
    		.then((response)=> {
    			this.$router.push({path: '/', query: {alert: '用户删除成功!'}})
    		})
    }
  },
  created () {
  	this.fetchCustomers(this.$route.params.id)
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
