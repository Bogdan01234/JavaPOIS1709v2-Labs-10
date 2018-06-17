package flowerShop.realization.logic;

import flowerShop.realization.entities.container.Bouquet;
import flowerShop.realization.entities.objects.Flowers;

public class Sorter {

    public static void sort (Bouquet array) {

        boolean flag = true;
        System.out.println("Start");
        for(int j = 0; j < array.getSize() - 1; j++){
            System.out.println("Start23");
            flag = true;
            for (int i = 0; i < array.getSize() - 1 - j; i++){
                System.out.println("Start2323445");

                    Flowers t = array.get(i);
                    array.set(i,array.get(i + i));
                    array.set(i + i, t);
                    flag = false;
                    System.out.println(array.get(i));
                    System.out.println("Start23445");

                if(flag){
                    break;
                }
            }
        }

    }

}
