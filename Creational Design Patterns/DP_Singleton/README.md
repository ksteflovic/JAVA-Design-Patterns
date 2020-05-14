# Design Pattern - *Singleton*

> **Note**: This repository contains tasks in slovak language.

> **Singleton** is a *creational design pattern* that lets you ensure that a class has only one instance, while providing a global access point to this instance. The default constructor is private, to prevent other objects from using the new operator with the Singleton class.

In this repository, I have to made two assignments in Singleton design pattern:
- ***Cabinet manager*** 
- ***Magic ball***

### [Cabinet manager](https://github.com/pajka-js/DP_Singleton/tree/master/nv_singleton/src/nv_singleton/nv_singleton_skrinky) 🗄️
The task was to make functions for:
1.  occupy the locker
2.  free the locker
3.  count all lockers
4.  count free lockers
5.  find index of first free locker

### [Magic ball](https://github.com/pajka-js/DP_Singleton/tree/master/nv_singleton/src/nv_singleton/nv_singleton_gula) 🔮
Prints random prophecy.
There are three files with prophecies (optimist, pesimist and funny), as the instance is created, it picks random class by ```java.util.Random``` and prints one random prophecy from the file.
