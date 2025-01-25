<template>
    <transition name="fade" @before-enter="handleBeforeEnter">
        <div v-if="showContent" style="display:flex; flex-direction: column;">

            <div style="display:flex; flex-direction: column;">
                <h1 style="color: white;">Our Story</h1>
                <p>Here lies some text on how this application is just a ledger. Of course anyone can use Notion,
                    OneNote or
                    any other application to write things down.
                </p>
                <p>
                    However, I wanted to build an app that was focused on personal projects and the personal timeline of
                    that project.
                    It mainly came from a conversation my dad and I had and how he would lose receipts when working on
                    our
                    cars or we would have to spend time remembering
                    where we put these records.
                </p>
                <p> I spent a few months working on this project to work more with Java and
                    VueJs as I'm mostly familiar with C++, C# and Angular.
                    It's been an enjoyable process, and I've learned a lot.
                    Thanks for stopping by and feel free to leave some feedback.
                </p>
            </div>

        </div>
    </transition>

</template>

<script setup>
import { ref, onMounted } from 'vue'
import { ourStoryClicked } from '@/router'

const showContent = ref(false)

const handleBeforeEnter = () => {
  // Reset the reactive property after the transition starts
  ourStoryClicked.value = false
}

onMounted(() => {
  if (ourStoryClicked.value) {
    showContent.value = true
  }
})
</script>


<style>
.fade-enter-active,
.fade-leave-active {
  transition: opacity 2.5s;
}

.fade-enter-from,
.fade-leave-to {
  opacity: 0;
}
</style>