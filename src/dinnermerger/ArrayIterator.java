package dinnermerger;

public class ArrayIterator implements Iterator{

    MenuItem[] menuItems;
    int position=0;
    public ArrayIterator(MenuItem[] menuItems){
        this.menuItems=menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position>=menuItems.length||menuItems[position]==null){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem=menuItems[position];
        position++;
        return menuItem;
    }
}
