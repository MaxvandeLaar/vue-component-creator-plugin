import {{ componentNamePascalCase }} from './{{componentName}}.vue';
import { Story } from '@storybook/vue3'
import { constructArgType } from '../../../storybook/utils/utils'

{{# createMarkdown = "1" }}
import markdown from './{{componentName}}.md';
{{/ createMarkdown = "1"}}

export default {
    title: '{{ componentNamePascalCase }}',
    component: {{ componentNamePascalCase }},
    argTypes: {
    },
    {{# createMarkdown = "1" }}
    parameters: {
        notes: { markdown }
    },
    {{/ createMarkdown = "1" }}
};
     
type Args = {
}
     
const Template: Story<Args> = args => ({
    components: { {{ componentNamePascalCase }} },
    setup () {
        return {
            args,
        }
    }
    template: '<{{ componentName }} v-bind="$props" />',
})

export const Default = Template.bind({})
Default.args = {}

 
 
