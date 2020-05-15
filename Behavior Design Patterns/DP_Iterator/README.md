# Design Pattern - *Iterator*

> The main idea of the **Iterator** pattern is to *extract* the traversal behavior of a collection into a separate object called an iterator.

<p align="center">
<img src="https://i.postimg.cc/N0vczjdD/Screenshot-3.png" alt="Iterator schema">
</p>	

This repository contains **one** assignment done in *Iterator design pattern*.

## 🍴 Restaurant
There is one restaurant with different menus:
- Pancake menu
- Dinner menu

In the restaurant, there is a waitress. This [```Waitress.java```](https://github.com/pajka-js/DP_Iterator/blob/master/src/restaurant/Waitress.java) have to remember all menu objects in one list. After calling the waitress void ```printMenu()``` we get the output of the menu. See final output below.

### Output
```
NUTELLA PANCAKES
	-- Little pancake with nutella and banana slice on its top.
	-- 2.99€
CHOCOLATE CHOP PANCAKES
	-- Five of our buttermilk pancakes topped with chocolate chips and powdered sugar.
	-- 2.99€
 RASPBERRY DELIGHT
	-- Three rolled pancakes topped with delicious cooled raspberry compote on the inside and on top. Finished with powdered sugar and whipped cream.
	-- 3.49€
STRAWBERRY SHORTCAKES
	-- Three rolled pancakes loaded with cooled strawberry compote, topped with powdered sugar and real whipped cream.
	-- 3.59€

BROCCOLI SALAD
	-- Red & Broccoli Florets / Onion / Dried Cranberry / Toasted Walnut / Bell Peppers / Bacon. Served in a housemade Creamy Dressing
	-- 2.99€
LASAGNA
	-- This classic lasagna is made with an easy meat sauce as the base. Layer the sauce with noodles and cheese, then bake until bubbly!
	-- 2.99€
RATATOUILLE
	-- Ratatouille is a classic end-of-summer French stew that's fun to say (rat-tuh-TOO-ee) and fun to make. It's packed with fresh produce: tomatoes, eggplant, zucchini and yellow squash, and bell pepper.
	-- 3.29€
BEEF ROULADEN
	-- Thin Sliced Roast Beef with onion, dijon mustard and dill pickle.
	-- 3.05€
FRIED CHICKEN
	-- Tender chicken pieces coated with a crispy crust and roasted.
	-- 3.99€
BAKED SALMON
	-- Whole fresh salmon, stuffed and baked to perfection.
	-- 3.89€
```
