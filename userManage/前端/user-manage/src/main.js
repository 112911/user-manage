import Vue from 'vue'
import App from './App'
import Router from 'vue-router'
//import Resource from 'vue-resource'
import axios from 'axios'
import Alert from './components/Alert'
import Home from './components/Home'
import UserInfo from './components/UserInfo'
import Edit from './components/Edit'
import About from './components/About'
import Add from './components/Add'


Vue.config.productionTip = false

Vue.use(Router)
//Vue.use(Resource)
Vue.prototype.$http = axios

const routes = [
	{path:'/Home',component:Home},
	{path:'/Users/:id',component:UserInfo},
	{path:'/About',component:About},
	{path:'/Add',component:Add},
	{path:'/Edit/:id',component:Edit},
	{path:'/Alert',component:Alert},
	{path:'/',component:Home},
	{path:'*',component:Home}
]

const router = new Router({
	routes,
	mode:'history'
})


new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})

