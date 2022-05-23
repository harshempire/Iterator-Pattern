package dinnermerger;

import java.util.List;

public class PancakeHouseIterator implements  Iterator{
    List<MenuItem> menuItems;
    int position=0;
    public PancakeHouseIterator(List<MenuItem> menuItems){
        this.menuItems=menuItems;
    }

    @Override
    public boolean hasNext() {
        return menuItems.size()>position;
    }

    @Override
    public MenuItem next() {
        return menuItems.get(position++);
    }
}
