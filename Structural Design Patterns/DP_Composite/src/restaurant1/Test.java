package restaurant1;

public class Test {

    public static void main(String args[]) {
        MenuComponent pancakeHouseMenu =
                new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinnerMenu =
                new Menu("DINNER MENU", "Lunch");
        MenuComponent cafeMenu =
                new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu =
                new Menu("DESSERT MENU", "Dessert of course!");
        MenuComponent coffeeMenu = new Menu("COFFEE MENU", "Stuff to go with your afternoon coffee");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        // ponuka nasej restauracie ma 3 menu
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);

        // naplnime ich polozkami
        pancakeHouseMenu.add(new MenuItem("Nutella pancakes", "Little pancake with nutella and banana slice on its top.", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Chocolate chop pancakes", "Five of our buttermilk pancakes topped with chocolate chips and powdered sugar.", false, 2.99));
        pancakeHouseMenu.add(new MenuItem("Raspberry delight", "Three rolled pancakes topped with delicious cooled raspberry compote on the inside and on top. Finished with powdered sugar and whipped cream.", true, 3.49));
        pancakeHouseMenu.add(new MenuItem("Strawberry shortcakes", "Three rolled pancakes loaded with cooled strawberry compote, topped with powdered sugar and real whipped cream.", true, 3.59));
        dinnerMenu.add(new MenuItem("Broccoli Salad", "Red & Broccoli Florets / Onion / Dried Cranberry / Toasted Walnut / Bell Peppers / Bacon. Served in a housemade Creamy Dressing", true, 2.99));
        dinnerMenu.add(new MenuItem("Lasagna", "This classic lasagna is made with an easy meat sauce as the base. Layer the sauce with noodles and cheese, then bake until bubbly!", false, 2.99));
        dinnerMenu.add(new MenuItem("Ratatouille", "Ratatouille is a classic end-of-summer French stew that's fun to say (rat-tuh-TOO-ee) and fun to make. It's packed with fresh produce: tomatoes, eggplant, zucchini and yellow squash, and bell pepper.", false, 3.29));
        dinnerMenu.add(new MenuItem("Beef Rouladen", "Thin Sliced Roast Beef with onion, dijon mustard and dill pickle.", false, 3.05));
        dinnerMenu.add(new MenuItem("Fried Chicken", "Tender chicken pieces coated with a crispy crust and roasted.", true, 3.99));
        dinnerMenu.add(new MenuItem("Baked Salmon", "Whole fresh salmon, stuffed and baked to perfection.", true, 3.89));

        // dinnerMenu bude okrem predoslych poloziek obsahovat aj dalsie vnorene menu s ponukou dezertov
        dinnerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Hot Apple Cobbler", "Fuji apples baked together with just the right amount of spice. Topped with our roasted pecan crumbed cobbler topping and crisped. Served with vanilla bean ice cream", true, 1.59));
        dessertMenu.add(new MenuItem("Tiramisu", "A classic no-bake Italian dessert combining espresso-dipped ladyfingers and a creamy lightly sweetened mascarpone cream.", true, 1.99));
        dessertMenu.add(new MenuItem("Tuxedo Truffle Mousse", "A layer each of creamy dark chocolate and white chocolate mousse between three layers of marbled white and dark chocolate cake. Topped off with dark chocolate ganache swirled with white chocolate.", true, 1.89));

        cafeMenu.add(new MenuItem("Espresso", "A single shot of espresso.", true, 3.99));
        cafeMenu.add(new MenuItem("Flat white", "A double shot of espresso with flat steamed milk.", false, 3.69));
        cafeMenu.add(new MenuItem("Hot chocolate", "Rich chocolate with steamed milk and a small layer of foam.", true, 4.29));

        cafeMenu.add(coffeeMenu);

        coffeeMenu.add(new MenuItem("Latte", "A double shot of espresso with steamed milk and a small layer of foam.", true, 1.59));
        coffeeMenu.add(new MenuItem("Piccolo latte", "A single shot of espresso with a small layer of foam.", false, 0.69));
        coffeeMenu.add(new MenuItem("Iced coffee", "Fresh espresso served with milk, vanilla ice-cream and fresh whipped cream.", true, 0.89));

        // vytvorime casnicku, ktorej odovzdame referenciu na hlavny MenuComponent
        // obsahujuci Menu, ktore obsahuju MenuItem-s pripadne dalsie Menu
        Waitress waitress = new Waitress(allMenus);

        // vypiseme vsetko, co restauracia ponuka
        waitress.printMenu();
    }
}
