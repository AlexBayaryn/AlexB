package sorting;

import java.util.Arrays;

//  3. Реализуйте сортировку обменами.
public class SortBubble {
    public static void main(String[] args) {
        int[] array = new int[6];
        int number = 100;
        int temp;
        boolean sortDone;
        for (int i = 0; i < array.length; i++) {
            int mix = rnd(number);
            array[i] = mix;
        }
        System.out.println("Array random number: " + Arrays.toString(array));
        System.out.println();
        do {
            int index = 0;
            sortDone = false;
            for (int x = index + 1; x < array.length; x++) {
                if (array[index] > array[x]) {
                    temp = array[x];
                    array[x] = array[index];
                    array[index] = temp;
                    System.out.println(Arrays.toString(array));
                    sortDone = true;
                }
                index++;
            }
        } while (sortDone);
    }

    public static int rnd(int number) {
        return (int) (Math.random() * number);
    }
}
