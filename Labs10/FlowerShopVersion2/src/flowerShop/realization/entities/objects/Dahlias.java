package flowerShop.realization.entities.objects;

public class Dahlias extends Flowers {

    private String colour;

    {
        setName("Dahlia");
    }

    public Dahlias() {
    }

    public Dahlias(double price, String colour) {
        super(price);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Flower- " + getName() +
                " colour- '" + colour + '\'' + " price- " + getPrice();
    }
}
