Foundation for Grails - easy to use, powerful, and flexible framework for building prototypes and production code on any kind of device.
===

The Plugin provides the Foundation framework. It integrates nicely with the resources plugin. For production use you can use a resources-minifier plugin.

What's in Foundation?
---

Foundation is built to help you quickly get a site off the ground and to a state where you can easily adapt and modify it into a release. Here's the highlights:

Global

Foundation's global styles include Eric Meyer's rock-solid reset, tested styles for typography, links, lists, tables and more.

The Grid

Within global.css you'll find The Grid, a layout framework that works on mobile devices, small screens and full-on modern desktops. It's a twelve column, semi-liquid, mobile-scaling grid that supports arbitrary nesting.

Buttons

Foundation includes two base styles, three sizes, and several colors that are preconfigured and easy to modify.

Forms

Foundation provides two base styles for forms that are tested, include validation styles and have proper spacing. It provides custom radio buttons, checkboxes and select lists so you can style up every form element. They're easy to modify.

Orbit

A way to put image or content sliders on your page, is packaged in with Foundation. It even works on mobile.

Reveal

Finally, a whole new plugin for modal dialogs in Foundation. Reveal is easy to call, supports several intro animations right out of the box, and is completely stylable. It also works on mobile.

To get started -- check out http://foundation.zurb.com

Installation:
---
grails install-plugin foundation

Usage:
---
You probably wan't to use this plugin in conjunction with the resources plugin http://grails.org/plugin/resources

Use the resources TagLib to include the foundation module in your gsp.

	<r:require module="foundation" />

Versioning
---
Plugin version convention is 

	<foundationframework-version>.<plugin-minor-for-fixes> => <3.2.2>.<1>

Copyright and License
---

foundation plugin:

Copyright © 2012 Konstantinos Kostarellis

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

Foundation framework:

MIT Open Source License

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
