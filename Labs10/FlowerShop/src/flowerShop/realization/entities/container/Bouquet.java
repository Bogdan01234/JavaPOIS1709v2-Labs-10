package flowerShop.realization.entities.container;

import flowerShop.realization.entities.objects.Flowers;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {

    private List<Flowers> bouqet;

    public Bouquet() {
        bouqet = new ArrayList<>();
    }

    public Bouquet(List<Flowers> bouqet) {
        this.bouqet = bouqet;
    }

    public List<Flowers> getBouqet() {
        return bouqet;
    }

    public void setBouqet(List<Flowers> bouqet) {
        this.bouqet = bouqet;
    }

    public void add(Flowers flowers){
        bouqet.add(flowers);
    }

    public void remove (int index){
        bouqet.remove(index);
    }

    public boolean removeAll() {
        bouqet = null;
        return true;
    }

    public int getSize(){
        return bouqet.size();
    }

    public Flowers get(int index){
        return bouqet.get(index);
    }

    public void set(int index, Flowers flowers){
        bouqet.set(index,flowers);
    }

    @Override
    public String toString() {
        return "Bouquet" + bouqet +
                ", size=" + bouqet.size() +
                '}';
    }
}
