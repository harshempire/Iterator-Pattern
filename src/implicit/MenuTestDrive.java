package implicit;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu=new PancakeHouseMenu();
        DinnerMenu dinnerMenu=new DinnerMenu();
        // we have to use two different iterators to traverse
        Waitress waitress=new Waitress(pancakeHouseMenu,dinnerMenu);
        waitress.printMenu();

    }
}
