def jqueryPlugin = org.codehaus.groovy.grails.commons.ApplicationHolder.application.mainContext.pluginManager.getGrailsPlugin('jquery')
def configDefaultBundle = 'bundle_foundation'

modules = {

    'foundation-global' {
        defaultBundle configDefaultBundle

        resource url:[plugin: 'foundation', dir: 'css', file: 'globals.css'], disposition: 'head'
    }

    'foundation-typography' {
        defaultBundle configDefaultBundle

        resource url:[plugin: 'foundation', dir: 'css', file: 'typography.css'], disposition: 'head'
    }

    'foundation-grid' {
        defaultBundle configDefaultBundle

        resource url:[plugin: 'foundation', dir: 'css', file: 'grid.css'], disposition: 'head'
    }

    'foundation-ui' {
        defaultBundle configDefaultBundle

        resource url:[plugin: 'foundation', dir: 'css', file: 'ui.css'], disposition: 'head'
    }

    'foundation-forms' {
        defaultBundle configDefaultBundle

        resource url:[plugin: 'foundation', dir: 'css', file: 'forms.css'], disposition: 'head'
    }

    'foundation-orbit' {
        defaultBundle configDefaultBundle

        resource url:[plugin: 'foundation', dir: 'css', file: 'orbit.css'], disposition: 'head'
    }

    'foundation-reveal' {
        defaultBundle configDefaultBundle

        resource url:[plugin: 'foundation', dir: 'css', file: 'reveal.css'], disposition: 'head'
    }


    'foundation-mobile' {
        defaultBundle configDefaultBundle

        resource url:[plugin: 'foundation', dir: 'css', file: 'mobile.css'], disposition: 'head'
    }

    'foundation-ie' {
        defaultBundle configDefaultBundle

        resource url:[plugin: 'foundation', dir: 'css', file: 'ie.css'], disposition: 'head'
    }

    // -- End CSS -- Begin JS Resources

    'foundation-reveal-js' {
        defaultBundle configDefaultBundle
        dependsOn 'jquery'
        resource url:[plugin: 'foundation', dir: 'js', file: 'jquery.reveal.js'], disposition: 'head'
    }

    'foundation-orbit-js' {
        defaultBundle configDefaultBundle
        dependsOn 'jquery'
        resource url:[plugin: 'foundation', dir: 'js', file: 'jquery.orbit-1.3.0.js'], disposition: 'head'
    }

    'foundation-forms-js' {
        defaultBundle configDefaultBundle
        dependsOn 'jquery'
        resource url:[plugin: 'foundation', dir: 'js', file: 'forms.jquery.js'], disposition: 'head'
    }

    'foundation-customforms-js' {
        defaultBundle configDefaultBundle
        dependsOn 'jquery'
        resource url:[plugin: 'foundation', dir: 'js', file: 'jquery.customforms.js'], disposition: 'head'
    }

    'foundation-placeholder-js' {
        defaultBundle configDefaultBundle
        dependsOn 'jquery'
        resource url:[plugin: 'foundation', dir: 'js', file: 'jquery.placeholder.js'], disposition: 'head'
    }

    'foundation-css' {
        defaultBundle configDefaultBundle
        
        dependsOn 'foundation-global, foundation-typography, foundation-grid, foundation-ui, foundation-forms, foundation-orbit, foundation-reveal, foundation-mobile'
        dependsOn 'foundation-ie'
    }

    'foundation-js' {
        defaultBundle configDefaultBundle
        dependsOn 'jquery'
        dependsOn 'foundation-reveal-js,foundation-orbit-js,foundation-forms-js,foundation-customforms-js,foundation-placeholder-js,'
    }

    foundation {
        dependsOn 'foundation-css'
        if (jqueryPlugin) {
            dependsOn 'foundation-js'
        }
    }
       
}
