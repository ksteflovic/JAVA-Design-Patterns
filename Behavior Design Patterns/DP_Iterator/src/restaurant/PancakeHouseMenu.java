package restaurant;

import java.util.Iterator;
import java.util.ArrayList;

// kazda "menu" trieda implementuje rozhranie Menu
public class PancakeHouseMenu implements Menu {

    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();

        addItem("Nutella pancakes","Little pancake with nutella and banana slice on its top.",true, 2.99);
        addItem("Chocolate chop pancakes","Five of our buttermilk pancakes topped with chocolate chips and powdered sugar.",false, 2.99);
        addItem(" Raspberry delight","Three rolled pancakes topped with delicious cooled raspberry compote on the inside and on top. Finished with powdered sugar and whipped cream.", true, 3.49);
        addItem("Strawberry shortcakes", "Three rolled pancakes loaded with cooled strawberry compote, topped with powdered sugar and real whipped cream.", true, 3.59);
    }

    public final void addItem(String name, String description,
            boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    // tu nastala zmena, vyuzijeme, ze ArrayList ma metodu iterator()
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
