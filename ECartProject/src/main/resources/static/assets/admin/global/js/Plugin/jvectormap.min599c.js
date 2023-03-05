/*!
 * Remark (http://getbootstrapadmin.com/remark)
 * Copyright 2017 amazingsurge
 * Licensed under the Themeforest Standard Licenses
 */

!function(global,factory){if("function"==typeof define&&define.amd)define("/Plugin/jvectormap",["exports","Plugin","Config"],factory);else if("undefined"!=typeof exports)factory(exports,require("Plugin"),require("Config"));else{var mod={exports:{}};factory(mod.exports,global.Plugin,global.Config),global.PluginJvectormap=mod.exports}}(this,function(exports,_Plugin2,_Config){"use strict";Object.defineProperty(exports,"__esModule",{value:!0});var _Plugin3=babelHelpers.interopRequireDefault(_Plugin2),Config=babelHelpers.interopRequireWildcard(_Config),VectorMap=function(_Plugin){function VectorMap(){return babelHelpers.classCallCheck(this,VectorMap),babelHelpers.possibleConstructorReturn(this,(VectorMap.__proto__||Object.getPrototypeOf(VectorMap)).apply(this,arguments))}return babelHelpers.inherits(VectorMap,_Plugin),babelHelpers.createClass(VectorMap,[{key:"getName",value:function(){return"vectorMap"}}],[{key:"getDefaults",value:function(){return{map:"world_mill",backgroundColor:"#fff",zoomAnimate:!0,regionStyle:{initial:{fill:Config.colors("primary",600)},hover:{fill:Config.colors("primary",500)},selected:{fill:Config.colors("primary",800)},selectedHover:{fill:Config.colors("primary",500)}},markerStyle:{initial:{r:8,fill:Config.colors("red",600),"stroke-width":0},hover:{r:12,stroke:Config.colors("red",600),"stroke-width":0}}}}}]),VectorMap}(_Plugin3.default);_Plugin3.default.register("vectorMap",VectorMap),exports.default=VectorMap});