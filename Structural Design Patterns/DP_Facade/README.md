# Design Pattern - *Facade*

> **Facade** is a *structural design pattern* that provides a simplified interface to a library, a framework, or any other complex set of classes.

<p align="center">
  <img src="https://i.postimg.cc/MT1528wD/Example-of-Facade-design-pattern.png" width="577px" height="384px">
 </p>
<p align="right">
  <sup><strong>Image source:</strong> Wikipedia.</sup>
</p>
  
This repository contains one assignment done in *Facade design pattern*:
- Home Cinema

## Home Cinema 📽️
***Facade class*** treats the home theater components as a *subsystem*, and calls the subsystem to implement it's watch movie method.
### Folder structure
<pre><code>📁src
 └── 📁homecinema
      ├── 📃<a href="https://github.com/pajka-js/DP_Facade/blob/master/src/homecinema/Amplifier.java">Amplifier.java</a>
      ├── 📃<a href="https://github.com/pajka-js/DP_Facade/blob/master/src/homecinema/CdPlayer.java">CdPlayer.java</a>
      ├── 📃<a href="https://github.com/pajka-js/DP_Facade/blob/master/src/homecinema/DvdPlayer.java">DvdPlayer.java</a>
      ├── 📃<a href="https://github.com/pajka-js/DP_Facade/blob/master/src/homecinema/HomeCinemaDemo.java">HomeCinemaDemo.java</a> - <strong>main class</strong>
      ├── 📃<a href="https://github.com/pajka-js/DP_Facade/blob/master/src/homecinema/HomeCinemaFacade.java">HomeCinemaFacade.java</a> 
      ├── 📃<a href="https://github.com/pajka-js/DP_Facade/blob/master/src/homecinema/PopcornPopper.java">PopcornPopper.java</a>
      ├── 📃<a href="https://github.com/pajka-js/DP_Facade/blob/master/src/homecinema/Projector.java">Projector.java</a>
      ├── 📃<a href="https://github.com/pajka-js/DP_Facade/blob/master/src/homecinema/Screen.java">Screen.java</a>
      └── 📃<a href="https://github.com/pajka-js/DP_Facade/blob/master/src/homecinema/Tuner.java">Tuner.java</a>
</code></pre>
