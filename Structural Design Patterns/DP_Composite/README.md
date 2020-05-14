# Design pattern - *Composite*

> Composite is a ***structural design pattern*** that allows composing objects into a tree-like structure and work with the it as if it was a singular object.

<p align="center">
<img src="https://i.postimg.cc/020s6snH/composite.png" alt="Composite DP schema">
</p>  

The Composite Design Pattern was a pattern that made sense to do alongside the Iterator pattern, that’s because it’s the most useful when used alongside the Iterator pattern, so I have carried on and introduced it with the *restaurant example* that I previously implemented with the [**Iterator pattern**](https://github.com/pajka-js/DP_Iterator).

This repository contains **one** assignment made in *Composite* design pattern.

## 🍴 Restaurant
Just the same as the [Iterator example](https://github.com/pajka-js/DP_Iterator), but in **Composite**. And yes, I am too lazy to make another description.

<p>
<em>Not my problamma</em> ¯\_(ツ)_/¯
</p>

### Program output
```
ALL MENUS, All menus combined
---------------------

PANCAKE HOUSE MENU, Breakfast
---------------------
  Nutella pancakes(v), 2.99€
     -- Little pancake with nutella and banana slice on its top.
  Chocolate chop pancakes, 2.99€
     -- Five of our buttermilk pancakes topped with chocolate chips and powdered sugar.
  Raspberry delight(v), 3.49€
     -- Three rolled pancakes topped with delicious cooled raspberry compote on the inside and on top. Finished with powdered sugar and whipped cream.
  Strawberry shortcakes(v), 3.59€
     -- Three rolled pancakes loaded with cooled strawberry compote, topped with powdered sugar and real whipped cream.

DINNER MENU, Lunch
---------------------
  Broccoli Salad(v), 2.99€
     -- Red & Broccoli Florets / Onion / Dried Cranberry / Toasted Walnut / Bell Peppers / Bacon. Served in a housemade Creamy Dressing
  Lasagna, 2.99€
     -- This classic lasagna is made with an easy meat sauce as the base. Layer the sauce with noodles and cheese, then bake until bubbly!
  Ratatouille, 3.29€
     -- Ratatouille is a classic end-of-summer French stew that's fun to say (rat-tuh-TOO-ee) and fun to make. It's packed with fresh produce: tomatoes, eggplant, zucchini and yellow squash, and bell pepper.
  Beef Rouladen, 3.05€
     -- Thin Sliced Roast Beef with onion, dijon mustard and dill pickle.
  Fried Chicken(v), 3.99€
     -- Tender chicken pieces coated with a crispy crust and roasted.
  Baked Salmon(v), 3.89€
     -- Whole fresh salmon, stuffed and baked to perfection.

DESSERT MENU, Dessert of course!
---------------------
  Hot Apple Cobbler(v), 1.59€
     -- Fuji apples baked together with just the right amount of spice. Topped with our roasted pecan crumbed cobbler topping and crisped. Served with vanilla bean ice cream
  Tiramisu(v), 1.99€
     -- A classic no-bake Italian dessert combining espresso-dipped ladyfingers and a creamy lightly sweetened mascarpone cream.
  Tuxedo Truffle Mousse(v), 1.89€
     -- A layer each of creamy dark chocolate and white chocolate mousse between three layers of marbled white and dark chocolate cake. Topped off with dark chocolate ganache swirled with white chocolate.

CAFE MENU, Dinner
---------------------
  Espresso(v), 3.99€
     -- A single shot of espresso.
  Flat white, 3.69€
     -- A double shot of espresso with flat steamed milk.
  Hot chocolate(v), 4.29€
     -- Rich chocolate with steamed milk and a small layer of foam.

COFFEE MENU, Stuff to go with your afternoon coffee
---------------------
  Latte(v), 1.59€
     -- A double shot of espresso with steamed milk and a small layer of foam.
  Piccolo latte, 0.69€
     -- A single shot of espresso with a small layer of foam.
  Iced coffee(v), 0.89€
     -- Fresh espresso served with milk, vanilla ice-cream and fresh whipped cream.
```
