package sorting;
//      2. Реализуйте сортировку выбором.

import java.util.Arrays;

public class SortSelection {
    public static void main(String[] args) {
        int[] array = new int[10];
        int number = 100;
        int temp;
        for (int i = 0; i < array.length; i++) {
            int mix = rnd(number);
            array[i] = mix;
        }
        System.out.println("Array random number: " + Arrays.toString(array));
        System.out.println();
        for (int j = 0; j < array.length - 1; j++) {
            int index = j;
            for (int x = j + 1; x < array.length; x++) {
                if (array[x] < array[index]) {
                    index = x;
                }
            }
            temp = array[j];
            array[j] = array[index];
            array[index] = temp;
            System.out.println(Arrays.toString(array));
        }
    }

    public static int rnd(int number) {
        return (int) (Math.random() * number);
    }
}

