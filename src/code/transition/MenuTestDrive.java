package code.transition;

import java.util.ArrayList;

public class MenuTestDrive {
    public static void main(String[] args) {
        //  the goal of this code is to provide a common way to iterate both Array and ArrayList
        PancakeHouseMenu pancakeHouseMenu=new PancakeHouseMenu();
        DinnerMenu dinnerMenu=new DinnerMenu();
        ArrayList<Menu> menus=new ArrayList<>();
        menus.add(pancakeHouseMenu);
        menus.add(dinnerMenu);
        Waitress waitress=new Waitress(menus);
        waitress.printMenu();
    }
}
