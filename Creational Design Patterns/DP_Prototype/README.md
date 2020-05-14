# Design Pattern - *Prototype*

> **Prototype** is a *creational design pattern* that lets you copy existing objects without making your code dependent on their classes.

<p align="center">
<img alt="Prototype schema" src="https://i.postimg.cc/VLFzcqVZ/download-1.png">
</p>

This repository contains **two** assignments done in *Prototype design pattern*:
-   wallet
-   monsters

## Wallet 👛
Making a class [```Banknote.java```](https://github.com/pajka-js/DP_Prototype/blob/master/src/wallet/Banknote.java) we define a single banknote and its value, currency and state. This banknote is inserted to [```Wallet```](https://github.com/pajka-js/DP_Prototype/blob/master/src/wallet/Wallet.java).
💱
In the [```Test.java```](https://github.com/pajka-js/DP_Prototype/blob/master/src/wallet/Test.java) class, I've added the euros 💶 and some pound 💷 banknote to my wallet ```w1```. This wallet is cloned to ```w2``` wallet.
Their contents are the same.
>   **Note**: after changing the state of any banknote in ```w1``` wallet, there will be no *change* in ```w2``` wallet. 


## Monsters 👾
Just a funny ***Prototype*** *design pattern* interpretation.

Three text files, each contains an unicode char image of animal like *corocodile*, *monkey* and *alien*.
Each monster is shown in ```jFrame``` form  with its message.

[![Monster output example](https://i.postimg.cc/wTSTqPSr/Screenshot-22.png)](https://postimg.cc/nCGtTdVK)
