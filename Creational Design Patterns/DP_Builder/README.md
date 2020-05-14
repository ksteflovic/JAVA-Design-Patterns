# Design pattern - *Builder*

> **Builder pattern** builds a complex object using simple objects and using a step by step approach. This type of design pattern comes under *creational pattern* as this pattern provides one of the best ways to create an object.
> A Builder class builds the final object ***step by step***. This builder is *independent* of other objects.

<p align="center">
<img alt="Builder pattern schema" src="https://i.postimg.cc/Y0hDW9NY/1-w-Gvxn-Go2-Nk-8-Q-g3b-K7x-A.jpg">
</p>
<p align="right"><sub><strong>Image source:</strong> https://medium.com/</sub></p>

This repository contains **two** assignments done in *Builder design pattern*:
- House
- Form

## [House](https://github.com/pajka-js/DP_Builder/tree/master/src/dp_builder_house) 🏠
Consider a construction of a home 🧱

**House** is the final end product (object) that is to be returned as the output of the construction process.

It will have many steps like *basement* construction, *floor* construction, *wall* construction and so on *roof* construction. Finally the whole house object is returned.

> Here using the same process you can build houses with different properties. Like ***Lego house*** ;)

## [Form](https://github.com/pajka-js/DP_Builder/tree/master/src/dp_builder_form) 📇
Just a regular form made in Builder pattern.

It is mandatory to have ```firstName```, ```lastName```, ```userName```, and ```password``` in the form but all others are optional fields.
Output is the information about the person.
