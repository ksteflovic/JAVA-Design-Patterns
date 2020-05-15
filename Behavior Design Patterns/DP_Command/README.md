# Design Pattern - Command
> **Command pattern** is a *behavioral design pattern* and is part of the GoF‘s formal list of design patterns. Simply put, the pattern intends to encapsulate in an object all the data required for performing a given action (command), including what method to call, the method's arguments, and the object to which the method belongs.

> This model allows us to decouple objects that produce the commands from their consumers, so that's why the pattern is commonly known as the producer-consumer pattern.

<p align='center'>
  <img src='https://i.postimg.cc/vZS2jV0T/xEaYStJ.png' alt='Command pattern schema'/>
</p>

This repository contains **two** assignments, one is done in *Command design patern*:
- House
- Sort

## [House](https://github.com/pajka-js/DP_Command/tree/master/src/dp_command) 🏠
We have a remote control. This remote is the center of home automation and can control everything in our house.

*Example:* We'll just use a light that we can switch on or off with remote control.

## [Sort](https://github.com/pajka-js/DP_Command/tree/master/src/project) 〽️
We have a **Project** folder, where we define company employees, their count and their salary.

Comparator interface is used to order the objects of user-defined class. This interface is present in ```java.util``` package and contains 2 methods:
<ul>
  <li><code><strong>compare</strong>(Object <em>obj1</em>, Object <em>obj2</em>)</code><br></li>
  <li><code><strong>equals</strong>(Object <em>element</em>)</code></li>
</ul>

Using comparator, we can **sort** the elements based on data members. For instance, int this prohect it will be on sorting by the *names*, *count* and *salary*.
