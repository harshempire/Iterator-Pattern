package dinnermergercafe;

import java.util.HashMap;
import java.util.Iterator;

public class CafeMenu implements Menu{

    HashMap<String ,MenuItem> menuItemHashMap=new HashMap<>();
    public CafeMenu(){
        addItem("Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true, 3.99);
        addItem("Soup of the day",
                "A cup of the soup of the day, with a side salad",
                false, 3.69);
        addItem("Burrito",
                "A large burrito, with whole pinto beans, salsa, guacamole",
                true, 4.29);
    }

    public void addItem(String name,String description,boolean vegeterian,double price){
        MenuItem menuItem=new MenuItem(name,description,vegeterian,price);
        menuItemHashMap.put(name,menuItem);
    }

    public HashMap<String, MenuItem> getMenuItemHashMap() {
        return menuItemHashMap;
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return getMenuItemHashMap().values().iterator();
    }
}
