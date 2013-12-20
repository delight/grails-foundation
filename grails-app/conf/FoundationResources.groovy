def jqueryPlugin = org.codehaus.groovy.grails.commons.ApplicationHolder.application.mainContext.pluginManager.getGrailsPlugin('jquery')
def configDefaultBundle = 'bundle_foundation'
def dev = grails.util.GrailsUtil.isDevelopmentEnv()
def foundationCSSFile = "foundation${dev ? '' : '.min'}.css"

modules = {

	'foundation-css' {
        defaultBundle configDefaultBundle
        resource url:[plugin: 'foundation', dir: 'css', file: 'foundation.css'], disposition: 'head'
	}

	'foundation-abide-js' {
        defaultBundle configDefaultBundle
        dependsOn 'jquery'
        resource url:[plugin: 'foundation', dir: 'js', file: 'foundation.abide.js'], disposition: 'defer'
    }

	'foundation-accordion-js' {
        defaultBundle configDefaultBundle
        dependsOn 'jquery'
        resource url:[plugin: 'foundation', dir: 'js', file: 'foundation.accordion.js'], disposition: 'defer'
    }

	'foundation-alert-js' {
        defaultBundle configDefaultBundle
        dependsOn 'jquery'
        resource url:[plugin: 'foundation', dir: 'js', file: 'foundation.alert.js'], disposition: 'defer'
    }

	'foundation-clearing-js' {
        defaultBundle configDefaultBundle
        dependsOn 'jquery'
        resource url:[plugin: 'foundation', dir: 'js', file: 'foundation.clearing.js'], disposition: 'defer'
    }

	'foundation-dropdown-js' {
        defaultBundle configDefaultBundle
        dependsOn 'jquery'
        resource url:[plugin: 'foundation', dir: 'js', file: 'foundation.dropdown.js'], disposition: 'defer'
    }

	'foundation-interchange-js' {
        defaultBundle configDefaultBundle
        dependsOn 'jquery'
        resource url:[plugin: 'foundation', dir: 'js', file: 'foundation.interchange.js'], disposition: 'defer'
    }

	'foundation-joyride-js' {
        defaultBundle configDefaultBundle
        dependsOn 'jquery'
        resource url:[plugin: 'foundation', dir: 'js', file: 'foundation.joyride.js'], disposition: 'defer'
    }

	'foundation-magellan-js' {
        defaultBundle configDefaultBundle
        dependsOn 'jquery'
        resource url:[plugin: 'foundation', dir: 'js', file: 'foundation.magellan.js'], disposition: 'defer'
    }

	'foundation-offcanvas-js' {
        defaultBundle configDefaultBundle
        dependsOn 'jquery'
        resource url:[plugin: 'foundation', dir: 'js', file: 'foundation.offcanvas.js'], disposition: 'defer'
    }

    'foundation-orbit-js' {
        defaultBundle configDefaultBundle
        dependsOn 'jquery'
        resource url:[plugin: 'foundation', dir: 'js', file: 'foundation.orbit.js'], disposition: 'defer'
    }

	'foundation-reveal-js' {
        defaultBundle configDefaultBundle
        dependsOn 'jquery'
        resource url:[plugin: 'foundation', dir: 'js', file: 'foundation.reveal.js'], disposition: 'defer'
    }

	'foundation-tab-js' {
        defaultBundle configDefaultBundle
        dependsOn 'jquery'
        resource url:[plugin: 'foundation', dir: 'js', file: 'foundation.tab.js'], disposition: 'defer'
    }

	'foundation-tooltip-js' {
        defaultBundle configDefaultBundle
        dependsOn 'jquery'
        resource url:[plugin: 'foundation', dir: 'js', file: 'foundation.tooltip.js'], disposition: 'defer'
    }

	'foundation-topbar-js' {
        defaultBundle configDefaultBundle
        dependsOn 'jquery'
        resource url:[plugin: 'foundation', dir: 'js', file: 'foundation.topbar.js'], disposition: 'defer'
    }

	'foundation-js' {
        defaultBundle configDefaultBundle
        dependsOn 'jquery'
        if (dev) {
        	dependsOn 'foundation-abide-js,foundation-accordion-js,foundation-alert-js,foundation-clearing-js,foundation-dropdown-js,foundation-interchange-js,foundation-joyride-js,foundation-magellan-js,foundation-offcanvas-js,foundation-orbit-js,foundation-reveal-js,foundation-tab-js,foundation-tooltip-js,foundation-topbar-js'
        } else {
        	resource url:[plugin: 'foundation', dir: 'js', file: 'foundation.min.js'], disposition: 'defer'
        }
	}

	foundation {
		dependsOn 'foundation-css'
		if (jqueryPlugin) {
			dependsOn 'foundation-js'
		}
	}
}