<script setup lang="ts">
import WelcomeItem from './WelcomeItem.vue'
import DocumentationIcon from './icons/IconDocumentation.vue'
import ToolingIcon from './icons/IconTooling.vue'
import EcosystemIcon from './icons/IconEcosystem.vue'
import CommunityIcon from './icons/IconCommunity.vue'
import SupportIcon from './icons/IconSupport.vue'
</script>

<template>
  <WelcomeItem>
    <template #icon>
      <router-link to="/logs"> <button type="button" > <DocumentationIcon /> </button> </router-link>
    </template>
    <template #heading>Logs</template>
    Click the icon or header to view your existing logs with Lil' Maintainer
  </WelcomeItem>

  <WelcomeItem>
    <template #icon>
      <button type="button"> <ToolingIcon /> </button>
    </template>
    <template #heading>Uploaded Docs</template>
    Click the icon or header to view the media you have uploaded to Lil' Maintainer
  </WelcomeItem>

  <WelcomeItem>
    <template #icon>
      <router-link to="/NewRecord"> <button type="button" > <EcosystemIcon /> </button> </router-link>
    </template>
    <template #heading>Create New Log</template>
    Click the icon or header to create a new log to update your records 🕺🏾
  </WelcomeItem>

  <WelcomeItem>
    <template #icon>
      <button type="button"> <CommunityIcon /> </button>
    </template>
    <template #heading>Our Story</template>
    Click to learn more about us and how Lil' Maintainer came to be!
  </WelcomeItem>

  <WelcomeItem>
    <template #icon>
      <button type="button"> <SupportIcon /> </button>
    </template>
    <template #heading>Contact Us</template>
    Reach Product of August through
    <a href="https://www.instagram.com/product_of_august/" target="_blank" rel="noopener">Instagram</a>
    or
    <a href="https://www.youtube.com/@product_of_august" target="_blank" rel="noopener">YouTube</a>
  </WelcomeItem>
</template>
