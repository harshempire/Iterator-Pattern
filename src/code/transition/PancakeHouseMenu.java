package code.transition;

import code.transition.Menu;
import code.transition.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {

    // it stores in arraylist
    ArrayList<MenuItem> menuItems;

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public PancakeHouseMenu(){
        menuItems=new ArrayList<>();
        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs and toast",
                true,
                2.99);

        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);

        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries and blueberry syrup",
                true,
                3.49);

        addItem("Waffles",
                "Waffles with your choice of blueberries or strawberries",
                true,
                3.59);

    }

    public void addItem(String name,String description,boolean vegeterian,double price){
        MenuItem menuItem=new MenuItem(name,description,vegeterian,price);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }

}
