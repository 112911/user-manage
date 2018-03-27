<template>
	<header>
		<nav class="navbar navbar-default">
			<a class="py-2 pull-left a-svg" href="Home">
				<svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="d-block mx-auto">
					<circle cx="12" cy="12" r="10"></circle>
					<line x1="14.31" y1="8" x2="20.05" y2="17.94"></line>
					<line x1="9.69" y1="8" x2="21.17" y2="8"></line>
					<line x1="7.38" y1="12" x2="13.12" y2="2.06"></line>
					<line x1="9.69" y1="16" x2="3.95" y2="6.06"></line>
					<line x1="14.31" y1="16" x2="2.83" y2="16"></line>
					<line x1="16.62" y1="12" x2="10.88" y2="21.94"></line>
				</svg>
			</a>
			<router-link to="/Home" class="navbar-brand">用户管理系统</router-link>
			<ul class="nav navbar-nav">
				<li>
					<router-link to="/Home" class="nav-link">主页</router-link>
				</li>
				<li>
					<router-link to="/About" class="nav-link">关于我们</router-link>
				</li>
			</ul>
			<ul class="nav navbar-nav pull-right">
				<li>
					<router-link to="/Add" class="nav-link">添加用户</router-link>
				</li>
			</ul>
		</nav>
	</header>

</template>

<style scoped>
	.a-svg {
		margin: 11px 5px 0px 30px;
	}
	
	.navbar-default {
		box-shadow: 0 0 15px 3px;
		background: #e6e6e6;
	}
</style>