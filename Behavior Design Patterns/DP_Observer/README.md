# Design Pattern - *Observer*

> **Note**: This repository contains tasks in slovak language.

> **Observer** pattern uses three actor classes. *Subject*, *Observer* and *Client*. Subject is an object having methods to attach and detach observers to a client object. This pattern is used when there is one-to-many relationship between objects such as if one object is modified, its depenedent objects are to be notified automatically. Observer pattern falls under ***behavioral pattern category***.

<p align="center">
  <img width="681" height="288" alt="Image of Observer Design Pattern" src="https://i.ibb.co/qWgpbvL/The-Observer-Pattern.png">
</p>

This repository contains two assignments done in *Observer design pattern*:
- Weather station - using *class* ```java.util.Observable``` and *interface* ```java.util.Observer```
- Listeners

## Weather station 🌡️
We have three variables at the input: *temperature*, *pressure* and *humidity*.

The *CurrentConditionsDisplay* display shows current values:
- temperature
- humidity
- pressure

The *StatisticsDisplay* display shows:
- **minimum** temperature
- **maximum** temperature
- **average** temperature

The *ForecastDisplay* display shows simple weather forecasting by rule:
* **If** the *pressure* **rises** => ```"The weather gets better"```
* **If** the *pressure* **drops** => ```"It will cool down, maybe it will rain."```
* **If** the *pressure* has **not changed** => ```"No change in future..."```

Solved using
- *class* ```java.util.Observable```
- *interface* ```java.util.Observer```

## Listeners 🖱️
Here it is necessary to complete the project and ensure that the "click" statement always appears in the text area after clicking on the canvas. Also, we have to get the coordinates of the point on the canvas. See on the picture below:

 ![Canvas](https://i.ibb.co/vqKCJxZ/Screenshot-5.png)
