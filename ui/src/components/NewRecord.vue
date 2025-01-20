<template>

    <div style="display:flex; flex-direction: column;">

        <div style="display:flex; flex-direction: column;">
            <span>Title:</span>
            <p style="white-space: pre-line;">{{ title }}</p>
            <input v-model="title" placeholder="Title of your cool log" />
        </div>

        <div style="display:flex; flex-direction: column">
            <span>Description:</span>
            <p style="white-space: pre-line;">{{ Description }}</p>
            <textarea v-model="Description" placeholder="Very Cool Description"
                style="margin-bottom: 10px; margin-top: 10px; background-color: transparent; color: white; border: none; outline: none;">
            </textarea>
        </div>

        <div style="display:flex; justify-content: space-between; flex-direction: row">
            <b-button RouterLink to="/">Back</b-button>
            <b-button>Save</b-button>
        </div>

    </div>

</template>

<script>
</script>