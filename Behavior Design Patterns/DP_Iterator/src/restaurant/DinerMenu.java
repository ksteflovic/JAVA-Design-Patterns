package restaurant;

import java.util.Iterator;

// kazda "menu" trieda implementuje rozhranie Menu
public class DinerMenu implements Menu {

    public static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Broccoli Salad", "Red & Broccoli Florets / Onion / Dried Cranberry / Toasted Walnut / Bell Peppers / Bacon. Served in a housemade Creamy Dressing", true, 2.99);
        addItem("Lasagna", "This classic lasagna is made with an easy meat sauce as the base. Layer the sauce with noodles and cheese, then bake until bubbly!", false, 2.99);
        addItem("Ratatouille", "Ratatouille is a classic end-of-summer French stew that's fun to say (rat-tuh-TOO-ee) and fun to make. It's packed with fresh produce: tomatoes, eggplant, zucchini and yellow squash, and bell pepper.", false, 3.29);
        addItem("Beef Rouladen", "Thin Sliced Roast Beef with onion, dijon mustard and dill pickle.", false, 3.05);
        addItem("Fried Chicken", "Tender chicken pieces coated with a crispy crust and roasted.", true, 3.99);
        addItem("Baked Salmon", "Whole fresh salmon, stuffed and baked to perfection.", true, 3.89);
    }

    public final void addItem(String name, String description,
            boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!  Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    // kazda "Menu" trieda ma metodu, ktorej zavolanim moze klient
    // ziskat iterator (objekt, ktory mu sprostredkuje sekvencny pohyb po prvkoch
    // kolekcie)
    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
