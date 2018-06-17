package flowerShop.realization.comparator;

import flowerShop.realization.entities.objects.Flowers;

import java.util.Comparator;

public class FlowersSortByPriseASC implements Comparator <Flowers> {

    @Override
    public int compare(Flowers o1, Flowers o2) {

        if(o1.getPrice() < o2.getPrice()){
            return -1;
        } else if (o1.getPrice() > o2.getPrice()){
            return 1;
        }
        return 0;
    }
}
