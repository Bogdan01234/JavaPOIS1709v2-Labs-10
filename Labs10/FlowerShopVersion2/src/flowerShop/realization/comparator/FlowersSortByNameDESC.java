package flowerShop.realization.comparator;

import flowerShop.realization.entities.objects.Flowers;

import java.util.Comparator;

public class FlowersSortByNameDESC implements Comparator<Flowers> {

    @Override
    public int compare(Flowers o1, Flowers o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
