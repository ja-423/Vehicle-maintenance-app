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
      <DocumentationIcon />
    </template>
    <template #heading>Logs</template>
    Click the icon or header to view your existing logs with Lil' Maintainer
  </WelcomeItem>

  <WelcomeItem>
    <template #icon>
      <ToolingIcon />
    </template>
    <template #heading>Uploaded Docs</template>
    Click the icon or header to view the media you have uploaded to Lil' Maintainer
  </WelcomeItem>

  <WelcomeItem>
    <template #icon>
      <EcosystemIcon />
    </template>
    <template #heading>Create New Log</template>
    Click the icon or header to create a new log to update your records 🕺🏾
  </WelcomeItem>

  <WelcomeItem>
    <template #icon>
      <CommunityIcon />
    </template>
    <template #heading>Our Story</template>
    Click to learn more about us and how Lil' Maintainer came to be!
  </WelcomeItem>

  <WelcomeItem>
    <template #icon>
      <SupportIcon />
    </template>
    <template #heading>Contact Us</template>
    Reach Product of August through
    <a href="https://www.instagram.com/product_of_august/" target="_blank" rel="noopener">Instagram</a>
    or
    <a href="https://www.youtube.com/@product_of_august" target="_blank" rel="noopener">YouTube</a>
  </WelcomeItem>
</template>
