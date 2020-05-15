# Design Pattern - *Strategy*

> **Strategy** is a *behavioral design pattern* that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable. This pattern suggests that you take a class that does something specific in a lot of different ways and extract all of these algorithms into separate classes called *strategies*.

<p align="center">
  <img width="501" height="230" alt="Image of Strategy Design Pattern" src="https://i.postimg.cc/NGzFTFmk/Strategy-Pattern.png">
</p>

This repository contains **two** assignments done in *Strategy* pattern:
- ***Numbers***
- ***Operations***

## [Numbers](https://github.com/pajka-js/DP_Strategy/tree/master/src/main/java/Numbers) 🔢
The task was to create classes, which will encapsulate different ways of displaying an *int* number in output:
- decimal,
- binary,
- hexadecimal.

## [Operations](https://github.com/pajka-js/DP_Strategy/tree/master/src/main/java/Operations) ➕➖✖️➗
The task was to create classes,  which will encapsulate different math operations with two *int* numbers:
- addition,
- substracton,
- multiplication,
- division.


### Folder structure
<pre><code>📁src
 └── 📁main
      └── 📁java
            ├── 📁<a href="https://github.com/pajka-js/DP_Strategy/blob/master/src/main/java/Numbers">Numbers</a>
            │    ├── 📃<a href="https://github.com/pajka-js/DP_Strategy/blob/master/src/main/java/Numbers/BinaryFormatter.java">BinaryFormatter.java</a>
            │    ├── 📃<a href="https://github.com/pajka-js/DP_Strategy/blob/master/src/main/java/Numbers/DecimalFormatter.java">DecimalFormatter.java</a>
            │    ├── 📃<a href="https://github.com/pajka-js/DP_Strategy/blob/master/src/main/java/Numbers/Formatter.java">Formatter.java</a> - <strong>interface</strong>
            │    ├── 📃<a href="https://github.com/pajka-js/DP_Strategy/blob/master/src/main/java/Numbers/HexadecimalFormatter.java">HexadecimalFormatter.java</a>
            │    ├── 📃<a href="https://github.com/pajka-js/DP_Strategy/blob/master/src/main/java/Numbers/IntegerNumber.java">IntegerNumber.java</a>
            │    └── 📃<a href="https://github.com/pajka-js/DP_Strategy/blob/master/src/main/java/Numbers/Octalformatter.java">OctalFormatter.java</a>
            ├── 📁<a href="https://github.com/pajka-js/NV_Strategy/blob/master/src/main/java/Operations">Operations</a>
            │    ├── 📃<a href="https://github.com/pajka-js/NV_Strategy/blob/master/src/main/java/Operations/Add.java">Add.java</a>
            │    ├── 📃<a href="https://github.com/pajka-js/DP_Strategy/blob/master/src/main/java/Operations/Divide.java">Divide.java</a>
            │    ├── 📃<a href="https://github.com/pajka-js/DP_Strategy/blob/master/src/main/java/Operations/Multiply.java">Multiply.java</a>
            │    ├── 📃<a href="https://github.com/pajka-js/DP_Strategy/blob/master/src/main/java/Operations/NumberOperate.java">NumberOperate.java</a>
            │    ├── 📃<a href="https://github.com/pajka-js/DP_Strategy/blob/master/src/main/java/Operations/Operator.java">Operator.java</a> - <strong>interface</strong>
            │    └── 📃<a href="https://github.com/pajka-js/DP_Strategy/blob/master/src/main/java/Operations/Substract.java">Substract.java</a>
            │
            └── 📁<a href="https://github.com/pajka-js/DP_Strategy/blob/master/src/main/java/Strategy_Main">StrategyMain</a>
                 └── <a href="https://github.com/pajka-js/DP_Strategy/blob/master/src/main/java/Strategy_Main/Main.java">📃Main.java</a>- <strong>main class</strong>
</code></pre>
