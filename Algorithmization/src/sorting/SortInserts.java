package sorting;

import java.util.Arrays;

//       4. Реализуйте сортировку вставками.
public class SortInserts {
    public static void main(String[] args) {
        int[] array = new int[7];
        int number = 100;
        for (int i = 0; i < array.length; i++) {
            int mix = rnd(number);
            array[i] = mix;
        }
        System.out.println("Array random number: " + Arrays.toString(array));
        System.out.println();
        for (int x = 1; x < array.length; x++) {
            int min = array[x];
            int j;
            for (j = x - 1; j >= 0; j--) {
                if (array[j] > min) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = min;
            System.out.println(Arrays.toString(array));
        }
    }

    public static int rnd(int number) {
        return (int) (Math.random() * number);
    }
}

