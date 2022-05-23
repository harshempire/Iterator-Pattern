package implicit;

import java.util.List;

public class Waitress {
     Menu pancakeHouseMenu;
     Menu dinnerMenu;
     public Waitress(Menu pancakeHouseMenu,Menu dinnerMenu){
          this.dinnerMenu=dinnerMenu;
          this.pancakeHouseMenu=pancakeHouseMenu;
     }
     public void printMenu() {
          List<MenuItem> breakfastItems = ((PancakeHouseMenu) pancakeHouseMenu).getMenuItems();
          for (MenuItem m : breakfastItems) {
               printMenuItem(m);
          }

          MenuItem[] lunchItems = ((DinnerMenu) dinnerMenu).getMenuItems();
          for (MenuItem m : lunchItems) {
               printMenuItem(m);
          }
     }

     public void printMenuItem(MenuItem menuItem) {
          System.out.print(menuItem.getName() + ", ");
          System.out.print(menuItem.getPrice() + " -- ");
          System.out.println(menuItem.getDescription());
     }
}
