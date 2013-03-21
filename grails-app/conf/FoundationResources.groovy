def jqueryPlugin = org.codehaus.groovy.grails.commons.ApplicationHolder.application.mainContext.pluginManager.getGrailsPlugin('jquery')
def configDefaultBundle = 'bundle_foundation'

modules = {

    'foundation-normalize' {
        defaultBundle configDefaultBundle
        resource url:[plugin: 'foundation', dir: 'css', file: 'normalize.css']
    }

    // -- End CSS -- Begin JS Resources

    'foundation-core-js' {
        defaultBundle configDefaultBundle
        dependsOn 'jquery'
        resource url:[plugin: 'foundation', dir: 'js/foundation', file: 'foundation.js']
    }

    'foundation-alerts-js' {
        defaultBundle configDefaultBundle
        dependsOn 'foundation-core-js'
        resource url:[plugin: 'foundation', dir: 'js/foundation', file: 'foundation.alerts.js']
    }

    'foundation-clearing-js' {
        defaultBundle configDefaultBundle
        dependsOn 'foundation-core-js'
        resource url:[plugin: 'foundation', dir: 'js/foundation', file: 'foundation.clearing.js']
    }

    'foundation-cookie-js' {
        defaultBundle configDefaultBundle
        dependsOn 'foundation-core-js'
        resource url:[plugin: 'foundation', dir: 'js/foundation', file: 'foundation.cookie.js']
    }

    'foundation-dropdown-js' {
        defaultBundle configDefaultBundle
        dependsOn 'foundation-core-js'
        resource url:[plugin: 'foundation', dir: 'js/foundation', file: 'foundation.dropdown.js']
    }

    'foundation-forms-js' {
        defaultBundle configDefaultBundle
        dependsOn 'foundation-core-js'
        resource url:[plugin: 'foundation', dir: 'js/foundation', file: 'foundation.forms.js']
    }

    'foundation-joyride-js' {
        defaultBundle configDefaultBundle
        dependsOn 'foundation-core-js'
        resource url:[plugin: 'foundation', dir: 'js/foundation', file: 'foundation.joyride.js']
    }

    'foundation-magellan-js' {
        defaultBundle configDefaultBundle
        dependsOn 'foundation-core-js'
        resource url:[plugin: 'foundation', dir: 'js/foundation', file: 'foundation.magellan.js']
    }

    'foundation-orbit-js' {
        defaultBundle configDefaultBundle
        dependsOn 'foundation-core-js'
        resource url:[plugin: 'foundation', dir: 'js/foundation', file: 'foundation.orbit.js']
    }

    'foundation-placeholder-js' {
        defaultBundle configDefaultBundle
        dependsOn 'foundation-core-js'
        resource url:[plugin: 'foundation', dir: 'js/foundation', file: 'foundation.placeholder.js']
    }

    'foundation-reveal-js' {
        defaultBundle configDefaultBundle
        dependsOn 'foundation-core-js'
        resource url:[plugin: 'foundation', dir: 'js/foundation', file: 'foundation.reveal.js']
    }

    'foundation-section-js' {
        defaultBundle configDefaultBundle
        dependsOn 'foundation-core-js'
        resource url:[plugin: 'foundation', dir: 'js/foundation', file: 'foundation.section.js']
    }

    'foundation-tooltips-js' {
        defaultBundle configDefaultBundle
        dependsOn 'foundation-core-js'
        resource url:[plugin: 'foundation', dir: 'js/foundation', file: 'foundation.tooltips.js']
    }

    'foundation-topbar-js' {
        defaultBundle configDefaultBundle
        dependsOn 'foundation-core-js'
        resource url:[plugin: 'foundation', dir: 'js/foundation', file: 'foundation.topbar.js']
    }

    'foundation-modernizr-js' {
        defaultBundle configDefaultBundle
        resource url:[plugin: 'foundation', dir: 'js/vendor', file: 'custom.modernizr.js']
    }

    'foundation-css' {
        defaultBundle configDefaultBundle
        dependsOn 'foundation-normalize'
        resource url:[plugin: 'foundation', dir: 'css', file: 'foundation.css']
    }

    'foundation-js' {
        defaultBundle configDefaultBundle
        dependsOn 'foundation-core-js,foundation-alerts-js,foundation-clearing-js,foundation-cookie-js,foundation-dropdown-js,foundation-forms-js,foundation-joyride-js,foundation-magellan-js,foundation-orbit-js,foundation-placeholder-js,foundation-reveal-js,foundation-section-js,foundation-tooltips-js,foundation-topbar-js,foundation-modernizr-js'
    }

    foundation {
        dependsOn 'foundation-css'
        if (jqueryPlugin) {
            dependsOn 'foundation-js'
        }
    }
       
}
