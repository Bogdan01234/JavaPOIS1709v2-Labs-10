package flowerShop.realization.comparator;

import flowerShop.realization.entities.objects.Flowers;

import java.util.Comparator;

public class FlowersSortNyNameASC implements Comparator<Flowers> {

    @Override
    public int compare(Flowers o1, Flowers o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
