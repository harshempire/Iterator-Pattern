package dinnermerger;

import java.util.Iterator;

public class DinnerMenu implements Menu{

    static final int MAX_ITEM=6;
    int numberOfItem=0;
    MenuItem[] menuItems;
    public DinnerMenu(){
        menuItems=new MenuItem[MAX_ITEM];
        addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hotdog",
                "A hot dog, with sauerkraut, relish, onions, topped with cheese",
                false, 3.05);
        addItem("Steamed Veggies and Brown Rice",
                "A medly of steamed vegetables over brown rice", true, 3.99);
        addItem("Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true, 3.89);
    }
    public void addItem(String name,String description,boolean vegeterian,double price){
        MenuItem menuItem=new MenuItem(name,description,vegeterian,price);
        if (numberOfItem >= MAX_ITEM) {
            System.err.println("Sorry, menu is full!  Can't add item to menu");
        } else {
            menuItems[numberOfItem] = menuItem;
            numberOfItem = numberOfItem + 1;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    @Override
    public dinnermerger.Iterator createIterator() {
        return  new DinnerMenuIterator(menuItems);
    }
}
