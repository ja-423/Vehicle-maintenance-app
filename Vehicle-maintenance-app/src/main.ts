import './assets/main.css'
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue-3/dist/bootstrap-vue-3.css'

import { createApp } from 'vue'
import { createPinia } from 'pinia'
import { BootstrapVue3, BTable} from 'bootstrap-vue-3'

import App from './App.vue'
import router from './router'

const app = createApp(App)

app.use(createPinia())
app.use(router)
app.component('BTable', BTable)
app.use(BootstrapVue3)

app.mount('#app')
