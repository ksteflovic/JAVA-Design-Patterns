# Behavior Design Patterns
> Provides solution for the better interaction between objects and how to provide lose *coupling* and *flexibility* to extend ***easily***.

**This repository contains these behavior design patterns:**

## [Command](DP_Command) 📣
Command Pattern is used to implement lose coupling in a request-response model. In command pattern, the request is send to the ***invoker*** and invoker pass it to the encapsulated ***command*** object. Command object passes the request to the appropriate method of **Receiver** to perform the specific action.

## [Iterator](DP_Iterator) 🗃️
Iterator pattern in one of the behavioral pattern and it’s used to provide a standard way to traverse through a group of Objects. Iterator pattern is widely used in [Java Collection Framework](https://www.tutorialspoint.com/java/java_collections.htm) where Iterator interface provides methods for traversing through a collection.

It is not only about traversing through a collection, but we can also provide different kind of iterators based on our requirements. Iterator pattern hides the actual implementation of traversal through the collection and client programs just use iterator methods.

## [Observer](DP_Observer) 🔭
Observer design pattern is useful when you are interested in the state of an object and want to get notified whenever there is any *change*. In observer pattern, the object that watch on the state of another object are called ***Observer*** and the object that is being watched is called ***Subject***.

Java provides an inbuilt platform for implementing Observer pattern through ```java.util.Observable``` **class** and ```java.util.Observer``` **interface**. However, it’s not widely used because the implementation is really simple and most of the times we don’t want to end up extending a class just for implementing Observer pattern as java doesn’t provide multiple inheritances in classes.

## [Strategy](DP_Strategy) 📊
Strategy pattern is used when we have multiple algorithm for a specific task and client decides the actual implementation to be used at ***runtime***.

Strategy pattern is also known as Policy Pattern. We define multiple algorithms and let client application pass the algorithm to be used as a parameter. One of the best examples of this pattern is the ```Collections.sort()``` method that takes the Comparator parameter. Based on the different implementations of Comparator interfaces, the Objects are getting sorted in different ways.

## [Template method](DP_Template_method) 📅
Template Method is a behavioral design pattern and it’s used to create a method stub and deferring some of the steps of implementation to the subclasses. Template method defines the **steps** to execute an algorithm and it can provide a default implementation that might be common for all or some of the subclasses.
