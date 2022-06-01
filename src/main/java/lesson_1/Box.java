package lesson_1;

import java.util.ArrayList;

public class Box <T extends Fruit>{
    private ArrayList<T> box = new ArrayList<>();

    public Box() {
    }

    public float getWeight() {
        float weight = 0.0f;
        for (T o : box) {
            weight += o.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<? extends Fruit> anotherBox) {
        return this.getWeight() - anotherBox.getWeight() < 0.0001;
    }

    public void pourTo(Box<T> anotherBox) {
        anotherBox.box.addAll(box);
        box.clear();
    }

    public void addFruit(T fruit) {
        box.add(fruit);
    }

    public void showBox(){
        System.out.println(getWeight());
    }
}
