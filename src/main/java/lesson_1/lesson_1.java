package lesson_1;

import java.util.ArrayList;
import java.util.Arrays;

public class lesson_1<T> {
    public static void main(String[] args) {
        Integer array1[] = {1, 2, 3, 4, 5, 6, 7};
        String array2[] = {"A", "B", "C"};
        regroupElement(0, 6, array1);
        regroupElement(2, 0, array2);

        toList(array1);
        toList(array2);
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
