/*
 * Copyright 2012-2014 Konstantinos Kostarellis.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
class FoundationGrailsPlugin {
    def version = "5.0.3"
    def grailsVersion = "1.3 > *"
    def title = "Foundation CSS Framework for Grails"
    def description = '''\
Provides the Foundation CSS framework resources. Foundation is an easy to use, powerful, and flexible framework for building prototypes and production code on any kind of device.
It integrates nicely with the resources plugin.
'''

    def documentation = "http://grails.org/plugin/foundation"

    def license = "APACHE"
    def developers = [
        [name: "Konstantinos Kostarellis", email: "kosta.grails@gmail.com"]
    ]
    def issueManagement = [system: "GITHUB", url: "https://github.com/delight/grails-foundation/issues"]
    def scm = [url: "https://github.com/delight/grails-foundation"]
}
