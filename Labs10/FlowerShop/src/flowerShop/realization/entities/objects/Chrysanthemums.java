package flowerShop.realization.entities.objects;

public class Chrysanthemums extends Flowers {

    private static final String name = "Chrysanthemum";
    private String colour;

    public Chrysanthemums() {
    }

    public Chrysanthemums(double price, String colour) {
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
