package implicit;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator<MenuItem> {

    MenuItem[] menuItems;
    int position=0;
    public DinnerMenuIterator(MenuItem[] menuItems){
        this.menuItems=menuItems;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems[position];
        position = position + 1;
        return menuItem;
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
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException
                    ("You can't remove an item until you've done at least one next()");
        }
        if (menuItems[position-1] != null) {
            for (int i = position-1; i < (menuItems.length-1); i++) {
                menuItems[i] = menuItems[i+1];
            }
            menuItems[menuItems.length-1] = null;
        }
    }
}
