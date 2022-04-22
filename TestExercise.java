package pa2022.tutorato.esercizi.es2;

import java.util.ArrayList;
import java.util.Arrays;

public class TestExercise {
    public static void main(String[] args) {
        ArrayList<Integer> arrayInteger = new ArrayList<>();
        arrayInteger.add(1);
        arrayInteger.add(2);
        arrayInteger.add(3);
        arrayInteger.add(4);
        arrayInteger.add(5);

        UsefulAlgorithm ua = new UsefulAlgorithm();

        int oddNumberQuantity = ua.countIf(arrayInteger, new OddProperty());
        System.out.println(oddNumberQuantity);

        String[] names = {"Marco", "Giovanni", "Silvia", "Matteo"};
        ua.swapArrayElements(names, 1, 2);

        System.out.println(Arrays.toString(names));
    }

}
