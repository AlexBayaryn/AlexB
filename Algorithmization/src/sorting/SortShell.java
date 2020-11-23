package sorting;

import java.util.Arrays;

//  5. Реализуйте сортировку Шелла.
public class SortShell {
    public static void main(String[] args) {
        int[] array = new int[10];
        int number = 100;
        for (int i = 0; i < array.length; i++) {
            int mix = rnd(number);
            array[i] = mix;
        }
        System.out.println("Array random number: " + Arrays.toString(array));
        System.out.println();
        for (int part = array.length / 2; part > 0; part /= 2) {
            for (int i = part; i < array.length; i++) {
                for (int j = i - part; j >= 0; j -= part) {
                    if (array[j] > array[j + part]) {
                        int x = array[j];
                        array[j] = array[j + part];
                        array[j + part] = x;
                    }
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }

    public static int rnd(int number) {
        return (int) (Math.random() * number);
    }
}

