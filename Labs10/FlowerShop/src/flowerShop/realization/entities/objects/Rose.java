package flowerShop.realization.entities.objects;

public class Rose extends Flowers {

    private String colour;

    {
        setName("Rose");
    }

    public Rose() {
    }

    public Rose(double price, String colour) {
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
