<template>
	<div id="app" class="container">
		<div>
			<app-header></app-header>
		</div>
		<div>
			<router-view></router-view>
		</div>
	</div>
</template>

<script>
	import Header from './components/Header';

	export default {
		components: {
			appHeader: Header
		}
	}
</script>

<style>
	body {
		position: absolute;
		background: url(../static/img/1.jpg) center;
		width: 100%;
		height: 100%;
		background-color: white;
	}
	
	body{
		position: relative;
		background-color: rgba(0,0,0,0.05);
	}
	input{
		border:1px solid skyblue !important;
	}
</style>