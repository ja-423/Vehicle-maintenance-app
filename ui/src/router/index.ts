import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import LogsView from '@/components/LogsView.vue'
import newRecordView from '../components/NewRecord.vue'
import OurStoryView from '../components/OurStoryView.vue'
import { ref } from 'vue'
export const ourStoryClicked = ref(false)

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/about',
      name: 'about',
      component: () => import('../views/AboutView.vue')
    },
    {
      path: '/logs',
      name: 'logs',
      component: LogsView
    },
    {
      path: '/NewRecord',
      name: 'NewRecord',
      component: newRecordView
    },
    {
      path: '/OurStory',
      name: 'OurStory',
      component: OurStoryView,
      beforeEnter: (to, from, next) => {
        ourStoryClicked.value = true
        next()
      }
    }
  ]
})

export default router
