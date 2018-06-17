package flowerShop.realization.entities.objects;

public class Asters extends Flowers{

    private static final String name = "Aster";
    private String colour;

    public Asters(String colour) {
    }

    public Asters(double price, String colour) {
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
                " colour- '" + colour + '\'' +  " price- " + getPrice();
    }
}
