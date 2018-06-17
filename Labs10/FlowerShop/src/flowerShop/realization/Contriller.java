/*  10.06.2018
    v1.0
    group POIS1709V2
    Bogdan Lapatnew
    Labs10
    TASK 19. Цветочница (Flower Shop). Определить иерархию цветов. Создать
    несколько объектов-цветов. Собрать букет с определением его стоимости.
*/
package flowerShop.realization;

import flowerShop.realization.entities.container.Bouquet;
import flowerShop.realization.entities.objects.Asters;
import flowerShop.realization.entities.objects.Chrysanthemums;
import flowerShop.realization.entities.objects.Dahlias;
import flowerShop.realization.entities.objects.Rose;
import flowerShop.realization.logic.Calculation;
import flowerShop.realization.logic.FlowersSortType;
import flowerShop.realization.logic.Sorter;
import flowerShop.realization.view.View;

public class Contriller {

    public static void main(String[] args) {
        Rose rose = new Rose(12,"Red");
        Rose rose2 = new Rose(12,"Black");
        Rose rose3 = new Rose(12,"Blue");
        Dahlias dahlias = new Dahlias(9, "Red");
        Dahlias dahlias2 = new Dahlias(9, "Yellow");
        Asters asters = new Asters(7,"Yellow");
        Chrysanthemums chrysanthemums = new Chrysanthemums(8, "Orange");

        Bouquet bouquet = new Bouquet();

        bouquet.add(rose);
        bouquet.add(rose2);
        bouquet.add(rose3);
        bouquet.add(dahlias);
        bouquet.add(dahlias2);
        bouquet.add(asters);
        bouquet.add(chrysanthemums);

        View.print(bouquet.toString());
        View.print("Bouqet prise: " + Calculation.priceCalculation(bouquet) + "$");

        Sorter.sort(bouquet, FlowersSortType.NAME_ASC);

        View.print(bouquet.toString());
        View.print("Bouqet prise: " + Calculation.priceCalculation(bouquet) + "$");

        Sorter.sort(bouquet, FlowersSortType.Prise_DESC);

        View.print(bouquet.toString());
        View.print("Bouqet prise: " + Calculation.priceCalculation(bouquet) + "$");
    }
}
