package flowerShop.realization.entities.objects;

public class Flowers {

    private String name;
    private double price;

    public Flowers() {
    }

    public Flowers(double price) {
        this.price = price;

    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
