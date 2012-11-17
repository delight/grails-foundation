def jqueryPlugin = org.codehaus.groovy.grails.commons.ApplicationHolder.application.mainContext.pluginManager.getGrailsPlugin('jquery')
def configDefaultBundle = 'bundle_foundation'

modules = {

    'foundation-css' {
        defaultBundle configDefaultBundle
        resource url:[plugin: 'foundation', dir: 'css', file: 'foundation.css'], disposition: 'head'
        resource url:[plugin: 'foundation', dir: 'css', file: 'foundation.min.css'], disposition: 'head'
    }



    'foundation-app-js' {
        defaultBundle configDefaultBundle
        resource url:[plugin: 'foundation', dir: 'javascripts', file: 'modernizr.foundation.js'], disposition: 'head'
        resource url:[plugin: 'foundation', dir: 'javascripts', file: 'foundation.min.js'], disposition: 'head'
        resource url:[plugin: 'foundation', dir: 'javascripts', file: 'app.js'], disposition: 'head'
    }




    /* foundation jquery plugins */
//    'foundation-jquery-accordion' {
//        defaultBundle configDefaultBundle
//        dependsOn 'foundation-app-js'
//        resource url:[plugin: 'foundation', dir: 'javascripts', file: 'jquery.foundation.accordion.js'], disposition: 'head'
//    }
//    'foundation-jquery-alerts' {
//        defaultBundle configDefaultBundle
//        dependsOn 'foundation-app-js'
//        resource url:[plugin: 'foundation', dir: 'javascripts', file: 'jquery.foundation.alerts.js'], disposition: 'head'
//    }
//    'foundation-jquery-buttons' {
//        defaultBundle configDefaultBundle
//        dependsOn 'foundation-app-js'
//        resource url:[plugin: 'foundation', dir: 'javascripts', file: 'jquery.foundation.buttons.js'], disposition: 'head'
//    }
//    'foundation-jquery-clearing' {
//        defaultBundle configDefaultBundle
//        dependsOn 'foundation-app-js'
//        resource url:[plugin: 'foundation', dir: 'javascripts', file: 'jquery.foundation.clearing.js'], disposition: 'head'
//    }
//    'foundation-jquery-forms' {
//        defaultBundle configDefaultBundle
//        dependsOn 'foundation-app-js'
//        resource url:[plugin: 'foundation', dir: 'javascripts', file: 'jquery.foundation.forms.js'], disposition: 'head'
//    }
//    'foundation-jquery-joyride' {
//        defaultBundle configDefaultBundle
//        dependsOn 'foundation-app-js'
//        resource url:[plugin: 'foundation', dir: 'javascripts', file: 'jquery.foundation.joyride.js'], disposition: 'head'
//    }
//    'foundation-jquery-magellan' {
//        defaultBundle configDefaultBundle
//        dependsOn 'foundation-app-js'
//        resource url:[plugin: 'foundation', dir: 'javascripts', file: 'jquery.foundation.magellan.js'], disposition: 'head'
//    }
//    'foundation-jquery-media_query_toggle' {
//        defaultBundle configDefaultBundle
//        dependsOn 'foundation-app-js'
//        resource url:[plugin: 'foundation', dir: 'javascripts', file: 'jquery.foundation.mediaQueryToggle.js'], disposition: 'head'
//    }
//    'foundation-jquery-navigation' {
//        defaultBundle configDefaultBundle
//        dependsOn 'foundation-app-js'
//        resource url:[plugin: 'foundation', dir: 'javascripts', file: 'jquery.foundation.navigation.js'], disposition: 'head'
//    }
//    'foundation-jquery-orbit' {
//        defaultBundle configDefaultBundle
//        dependsOn 'foundation-app-js'
//        resource url:[plugin: 'foundation', dir: 'javascripts', file: 'jquery.foundation.orbit.js'], disposition: 'head'
//    }
//    'foundation-jquery-reveal' {
//        defaultBundle configDefaultBundle
//        dependsOn 'foundation-app-js'
//        resource url:[plugin: 'foundation', dir: 'javascripts', file: 'jquery.foundation.reveal.js'], disposition: 'head'
//    }
//    'foundation-jquery-tabs' {
//        defaultBundle configDefaultBundle
//        dependsOn 'foundation-app-js'
//        resource url:[plugin: 'foundation', dir: 'javascripts', file: 'jquery.foundation.tabs.js'], disposition: 'head'
//    }
//    'foundation-jquery-tooltips' {
//        defaultBundle configDefaultBundle
//        dependsOn 'foundation-app-js'
//        resource url:[plugin: 'foundation', dir: 'javascripts', file: 'jquery.foundation.tooltips.js'], disposition: 'head'
//    }
//    'foundation-jquery-topbar' {
//        defaultBundle configDefaultBundle
//        dependsOn 'foundation-app-js'
//        resource url:[plugin: 'foundation', dir: 'javascripts', file: 'jquery.foundation.topbar.js'], disposition: 'head'
//    }
//    'jquery-placeholder' {
//        defaultBundle configDefaultBundle
//        dependsOn 'foundation-app-js'
//        resource url:[plugin: 'foundation', dir: 'javascripts', file: 'jquery.placeholder.js'], disposition: 'head'
//    }
//
//
//
//
//    'foundation-jquery-orbit-images' {
//        defaultBundle configDefaultBundle
//        resource url: [ plugin: 'foundation', dir: 'images/foundation/orbit', file: 'bullets.jpg' ], disposition: 'body'
//        resource url: [ plugin: 'foundation', dir: 'images/foundation/orbit', file: 'left-arrow.png' ], disposition: 'body'
//        resource url: [ plugin: 'foundation', dir: 'images/foundation/orbit', file: 'left-arrow-small.png' ], disposition: 'body'
//        resource url: [ plugin: 'foundation', dir: 'images/foundation/orbit', file: 'pause-black.png' ], disposition: 'body'
//        resource url: [ plugin: 'foundation', dir: 'images/foundation/orbit', file: 'right-arrow.png' ], disposition: 'body'
//        resource url: [ plugin: 'foundation', dir: 'images/foundation/orbit', file: 'right-arrow-small.png' ], disposition: 'body'
//        resource url: [ plugin: 'foundation', dir: 'images/foundation/orbit', file: 'rotator-black.png' ], disposition: 'body'
//        resource url: [ plugin: 'foundation', dir: 'images/foundation/orbit', file: 'timer-black.png' ], disposition: 'body'
//
//    }
//
//
//    'foundation-js' {
//        defaultBundle configDefaultBundle
//        dependsOn 'foundation-app-js, foundation-jquery-accordion, foundation-jquery-alerts, foundation-jquery-buttons, foundation-jquery-clearing, foundation-jquery-forms, foundation-jquery-joyride, foundation-jquery-magellan, foundation-jquery-media_query_toggle, foundation-jquery-navigation, foundation-jquery-orbit, foundation-jquery-reveal, foundation-jquery-tabs, foundation-jquery-tooltips, foundation-jquery-topbar, jquery-placeholder'
//    }
//
    'foundation' {
        dependsOn 'foundation-css'
        if (jqueryPlugin) {
            dependsOn 'foundation-app-js'
        }
    }
       
}
