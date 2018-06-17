package flowerShop.realization.logic;

import flowerShop.realization.comparator.FlowersSortByNameDESC;
import flowerShop.realization.comparator.FlowersSortByPriseASC;
import flowerShop.realization.comparator.FlowersSortByPriseDESC;
import flowerShop.realization.comparator.FlowersSortNyNameASC;
import flowerShop.realization.entities.container.Bouquet;
import flowerShop.realization.entities.objects.Flowers;

import java.util.*;


public class Sorter {

    private static Map<FlowersSortType, Comparator<Flowers>> map;

    static {
        map = new HashMap<>();
        map.put(FlowersSortType.NAME_ASC, new FlowersSortNyNameASC());
        map.put(FlowersSortType.NAME_DESC, new FlowersSortByNameDESC());
        map.put(FlowersSortType.PRISE_ASC, new FlowersSortByPriseASC());
        map.put(FlowersSortType.Prise_DESC, new FlowersSortByPriseDESC());
    }

    public static void sort(Bouquet bouquet, FlowersSortType type) {
        Collections.sort(bouquet.getBouqet(), map.get(type));
    }
}
