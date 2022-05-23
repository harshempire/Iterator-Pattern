package dinnermergeri;

import dinnermerger.PancakeHouseMenu;

public class MenuTestDrive {
    public static void main(String[] args) {
        PanCakeHouseMenu pancakeHouseMenu=new PanCakeHouseMenu();
        DinnerMenu dinnerMenu=new DinnerMenu();
        Waitress waitress=new Waitress(pancakeHouseMenu,dinnerMenu);
        waitress.printMenu(1);

    }
}
