package dinnermerger;

public class MenuTestDrive {
    public static void main(String[] args) {
        // The goal of this code is to implement it's own custom iterator
        // You can use the own in-built Iterator as well
        Menu panCakeHouseMenu=new PancakeHouseMenu();
        Menu dinnerMenu=new DinnerMenu();
        Waitress waitress=new Waitress(panCakeHouseMenu,dinnerMenu);
        waitress.printMenu();
    }
}
