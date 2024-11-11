<template> 

  <div>
    <b-table striped hover :items="items" :fields="fields"></b-table>
  </div>

</template>
  
  
  <script>
  export default {
    data() {
      return {
        // Note `isActive` is left out and will not appear in the rendered table
        fields: ['Title', 'Description', 'Date'],
        items: [
          { isActive: true, Date: 40, Title: 'Working Hard', Description: 'This does something' },
          { isActive: false, Date: 21, Title: 'Hardly Working', Description: 'THis does not' },
          { isActive: false, Date: 89, Title: 'Biding Time', Description: 'This may work' },
          { isActive: true, Date: 38, Title: 'New Wrist', Description: 'This might now' }
        ]
      }
    }
  }
</script>