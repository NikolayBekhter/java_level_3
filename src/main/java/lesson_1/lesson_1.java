package lesson_1;

import java.util.ArrayList;
import java.util.Arrays;

public class lesson_1 {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5, 6, 7};
        String[] array2 = {"A", "B", "C"};
        regroupElement(0, 6, array1);
        regroupElement(2, 0, array2);

        toList(array1);
        toList(array2);

        Box<Orange> or = new Box<Orange>();
        Box<Orange> or1 = new Box<Orange>();
        Box<Apple> ap = new Box<Apple>();
        Box<Apple> ap1 = new Box<Apple>();
        Box<Apple> ap2 = new Box<Apple>();

        or.addFruit(new Orange());
        or1.addFruit(new Orange());
        ap.addFruit(new Apple());
        ap1.addFruit(new Apple());
        ap2.addFruit(new Apple());

        or.showBox();
        or1.showBox();
        or.pourTo(or1);
        or.showBox();
        or1.showBox();

        ap.showBox();
        ap1.showBox();
        ap.pourTo(ap1);
        ap.showBox();
        ap1.showBox();

        System.out.println(or1.compare(ap1));

        ap2.pourTo(ap1);

        System.out.println(or1.compare(ap1));
    }

    public static <T> void regroupElement(int index_1, int index_2, T... array){
        T tempValue = array[index_1];
        array[index_1] = array[index_2];
        array[index_2] = tempValue;

        System.out.println(Arrays.toString(array));

    }

    public static <T> void toList(T[] array){
        ArrayList<T> arrayList = new ArrayList<>(Arrays.asList(array));

        System.out.println(arrayList);
    }
}
