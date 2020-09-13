# Structural Design Patterns

> Structural Patterns are concerned about providing solutions and efficient standards regarding class compositions and object structures. Also, they rely on the concept of inheritance and interfaces to allow multiple objects or classes to work together and form a single working whole.

**This repository contains these structural design patterns:**

## [Adapter](DP_Adapter) 🔌
This pattern is easy to understand as the real world is full of adapters.   For example consider a USB to Ethernet adapter. We need this when we have an Ethernet interface on one end and USB on the other. Since they are incompatible with each other. we use an adapter that converts one to other. This example is pretty analogous to Object Oriented Adapters. In design, adapters are used when we have a class (Client) expecting some type of object and we have an object (Adaptee) offering the same features but exposing a different interface.

To use an adapter:

- The client makes a request to the adapter by calling a method on it using the target interface.
- The adapter translates that request on the adaptee using the adaptee interface.
- Client receive the results of the call and is unaware of adapter’s presence.

## [Composite](DP_Composite) 📜
Composite pattern is a partitioning design pattern and describes a group of objects that is treated the same way as a single instance of the same type of object. The intent of a composite is to *compose* objects into tree structures to represent part-whole hierarchies. It allows you to have a **tree structure** and ask each node in the tree structure to perform a task.

## [Decorator](DP_Decorator) 💐
A structural pattern that lets you attach additional functionalities to an object dynamically. In other words, the client has the freedom to create an object and then extend it by adding a variety of “features” to it. A good analogy to simplify this pattern is: *Wrapping a gift, putting it in a box, and wrapping the box*.

## [Facade](DP_Facade) 🧱
Facade is a part of Gang of Four design pattern and it is categorized under Structural design patterns. Before we dig into the details of it, let us discuss some examples which will be solved by this particular Pattern.

So, As the name suggests, it means the face of the building. The people walking past the road can only see this glass face of the building. They do not know anything about it, the wiring, the pipes and other complexities. It hides all the complexities of the building and displays a friendly face.

---
Source: geegsforgeeks.org, medium.com
