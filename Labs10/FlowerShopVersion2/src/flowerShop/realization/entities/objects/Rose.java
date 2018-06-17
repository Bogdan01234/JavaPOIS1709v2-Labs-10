package flowerShop.realization.entities.objects;

public class Rose extends Flowers {

    private static final String name = "Rose";
    private String colour;

    public Rose() {
    }

    public Rose(double price, String colour) {
        super(price);
        this.colour = colour;
    }

    public static String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Flower- " + name +
                " colour- '" + colour + '\'' + " price- " + getPrice();
    }
}
