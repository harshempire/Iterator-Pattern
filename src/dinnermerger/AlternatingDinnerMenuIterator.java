package dinnermerger;

import java.util.Arrays;
import java.util.Calendar;

public class AlternatingDinnerMenuIterator implements  Iterator{

    MenuItem[] menuItems;
    int position=0;
    public  AlternatingDinnerMenuIterator(MenuItem[] menuItems){
        this.menuItems=menuItems;
        position= Calendar.DAY_OF_WEEK%2;
    }

    @Override
    public String toString() {
        return "AlternatingDinnerMenuIterator{" +
                "menuItems=" + Arrays.toString(menuItems) +
                ", position=" + position +
                '}';
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem=menuItems[position];
        position++;
        return  menuItem;
    }
}
