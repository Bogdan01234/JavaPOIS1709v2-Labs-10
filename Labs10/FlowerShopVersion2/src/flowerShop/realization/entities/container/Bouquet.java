package flowerShop.realization.entities.container;

import flowerShop.realization.entities.objects.Flowers;

import java.util.Arrays;

public class Bouquet {

    public static final int DEFAULT_SIZE = 0;
    private Flowers[] bouqet;
    private int size = 0;

    public Bouquet() {
        bouqet = new Flowers[DEFAULT_SIZE];
    }

    public Bouquet(Flowers[] bouqet) {
        this.bouqet = bouqet;
        size = bouqet.length;
    }

    public Flowers[] getBouqet() {
        return bouqet;
    }

    public void setBouqet(Flowers[] bouqet) {
        this.bouqet = bouqet;
    }

    public void add(Flowers flowers){
        Flowers[] bouquet2 = new Flowers[size];
        for (int i = 0; i < size; i++){
            bouquet2[i] = bouqet[i];
        }

        bouqet = new Flowers[++size];
        bouqet[size - 1] = flowers;

        for (int i = 0; i < size - 1; i++){
            bouqet[i] = bouquet2[i];
        }
    }

    public boolean remove (int index){
        boolean flag = false;
        if (bouqet[index] != null) {
            bouqet[index] = null;
            flag = true;
            size--;
        }
        return flag;
    }

    public boolean removeAll() {
        bouqet = null;
        size = 0;
        return true;
    }

    public int getSize(){
        return size;
    }

    public Flowers get(int index){
        return bouqet[index];
    }

    public void set(int index, Flowers flowers){
        bouqet[index] = flowers;
    }

    @Override
    public String toString() {
        return "Bouquet" + Arrays.toString(bouqet) +
                ", size=" + size +
                '}';
    }
}
