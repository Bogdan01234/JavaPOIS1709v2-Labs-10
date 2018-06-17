import flowerShop.realization.entities.container.Bouquet;
import flowerShop.realization.entities.objects.Asters;
import flowerShop.realization.entities.objects.Chrysanthemums;
import flowerShop.realization.entities.objects.Dahlias;
import flowerShop.realization.entities.objects.Rose;
import flowerShop.realization.logic.Calculation;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestCalculation {

    private static Bouquet bouquet;

    public TestCalculation() {
    }

    @BeforeClass
    public static void test() {
        Rose rose = new Rose(12,"Red");
        Rose rose2 = new Rose(12,"Black");
        Rose rose3 = new Rose(12,"Blue");
        Dahlias dahlias = new Dahlias(9, "Red");
        Dahlias dahlias2 = new Dahlias(9, "Yellow");
        Asters asters = new Asters(7,"Yellow");
        Chrysanthemums chrysanthemums = new Chrysanthemums(10, "Orange");

        bouquet = new Bouquet();

        bouquet.add(rose);
        bouquet.add(rose2);
        bouquet.add(rose3);
        bouquet.add(dahlias);
        bouquet.add(dahlias2);
        bouquet.add(asters);
        bouquet.add(chrysanthemums);

    }

    @Test
    public void testCalc() {
        double expResoult = 71;
        double resoutl = Calculation.priceCalculation(bouquet);

        Assert.assertEquals(expResoult, resoutl, 0.0);

    }
}



