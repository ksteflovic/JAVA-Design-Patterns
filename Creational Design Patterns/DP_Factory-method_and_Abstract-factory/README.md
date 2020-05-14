# Design Patterns - *Factory Method*, *Simple* and *Abstract Factory*
> **Factory Method** is a *creational design pattern* that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

> **Simple Factory** pattern is the *simplest class* which has methods for creation other class instances. For example if you need to create a tons of instances for some specific class, it’s much easier to use method which returns instances for you. That’s the ***main idea***.

> **Abstract Factory** is a *creational design pattern* that lets you produce families of related objects without specifying their concrete classes.

> *Factory design pattern* helps us to keep all objects creation in one place and avoid of spreading new key value across codebase.

<p align="center">
  <strong>Factory Method schema</strong>
  <img alt="Factory Method schema" src="https://i.postimg.cc/8PYTY2fK/factorymethod.png">
</p>

<p align="center">
  <strong>Abstract Factory Schema</strong>
  <img alt="Abstract Factory Schema" src="https://i.postimg.cc/NjP1Px68/Screenshot-21.png">
</p>

In this repository, I have done same assignment in ***Factory method***, ***Simple factory*** and ***Abstract factory*** design patterns:
-   Pizzeria.
## [Pizzeria](https://github.com/pajka-js/DP_Factory/tree/master/src) 🍕
***Let's bake some pizza.***

In this Java project, we develop a system, that accept orders for pizza. There are **three types** of pizzas, namely: 
- *cheese* 🧀,
- *hawai* 🍍,
- *salami* 🥓 <sub>(I know it is bacon emoji, I did not find salami emoji :pensive:).</sub> 

The pizzas differ  according to the dough used, the sauce used and the toppings.

But also, we want to support multiple pizzas styles, like *American* or *Italian* style. So, we create a framework to extend the ```Pizzeria```. Then we get a ```Factory``` waiting for subclasses for each region. Each subclass decides what makes up each pizza.

---

Creating a **Simple Factory** to encapsulate the code that changes will make the code more flexible.

---

***Let's bake another pizza.***

Changes in *Abstract Factory* pattern:
- [```Pizza```](https://github.com/pajka-js/DP_Factory/blob/master/src/dp_abstractfactory/Pizza.java) is *abstract* class so that it held a reference to a [```PizzaIngredientFactory```](https://github.com/pajka-js/DP_Factory/blob/master/src/dp_abstractfactory/PizzaIngredientFactory.java) (the Abstract Factory parent class).
- Now, there was no need for any of the *subclasses* of Pizza.
- All the (changable) details of creating a pizza has now been encapsulated in a [```PizzaIngredientFactory```](https://github.com/pajka-js/DP_Factory/blob/master/src/dp_abstractfactory/PizzaIngredientFactory.java).
- All of the Pizzas created by a [```AmericanStylePizzeria```](https://github.com/pajka-js/DP_Factory/blob/master/src/dp_factorymethod/AmericanStylePizzeria.java) is a [```AmericanPizzaIngredientFactory```](https://github.com/pajka-js/DP_Factory/blob/master/src/dp_abstractfactory/AmericanPizzaIngredientFactory.java) and all of the pizzas created by a [```ItalianStylePizzeria```]() is now a [```ItalianPizzaIngredientFactory```](https://github.com/pajka-js/DP_Factory/blob/master/src/dp_abstractfactory/ItalianPizzaIngredientFactory.java).

The **Abstract Factory Design Pattern** is very powerful and is used a lot in simulations where objects in a simulation may change frequently. All the change is isolated in the Factory so that the actual simulation does *not need to change*.

