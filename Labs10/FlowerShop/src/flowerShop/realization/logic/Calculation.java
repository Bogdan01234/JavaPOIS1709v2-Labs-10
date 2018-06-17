package flowerShop.realization.logic;

import flowerShop.realization.entities.container.Bouquet;

public class Calculation {

    public static double priceCalculation(Bouquet bouquet) {

        int counter = 0;

        for (int i = 0; i < bouquet.getSize(); i++){
            counter += bouquet.get(i).getPrice();
        }

        return counter;
    }
}
