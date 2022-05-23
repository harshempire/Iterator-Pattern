package dinnermerger;


import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu implements Menu{

    List<MenuItem> menuItems;
    public PancakeHouseMenu(){
        menuItems=new ArrayList<MenuItem>();
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

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public String toString() {
        return "PancakeHouseMenu{" +
                "menuItems=" + menuItems +
                '}';
    }

    @Override
    public Iterator createIterator() {
        Iterator iterator= new PancakeHouseIterator(menuItems);
        return iterator;
    }
}
