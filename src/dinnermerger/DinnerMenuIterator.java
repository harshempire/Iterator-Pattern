package dinnermerger;

public class DinnerMenuIterator implements  Iterator{

    MenuItem[] menuItems;
    int position=0;
    public DinnerMenuIterator(MenuItem[] menuItems){
        this.menuItems=menuItems;
    }

    @Override
    public boolean hasNext() {
        return menuItems.length>position;
    }

    @Override
    public MenuItem next() {
        return menuItems[position++];
    }
}
