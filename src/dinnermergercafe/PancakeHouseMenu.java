package dinnermergercafe;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements  Menu{
    ArrayList<MenuItem> menuItemArrayList;
    public PancakeHouseMenu(){
        menuItemArrayList=new ArrayList<MenuItem>();
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
    public void addItem(String name,String description,boolean vegeteraian,double price){
        MenuItem menuItem=new MenuItem(name,description,vegeteraian,price);
        menuItemArrayList.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItemArrayList() {
        return menuItemArrayList;
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItemArrayList.iterator();
    }
}
