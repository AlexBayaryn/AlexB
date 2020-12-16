package decompositionUsingMethods.homeTask12;

import java.util.Arrays;

public class ArrayCreation {
    private int sumElement_K;
    private int sizeNumber_N;
    private int[] array;

    public ArrayCreation(int sumElement_K, int sizeNumber_N) {
        this.sumElement_K = sumElement_K;
        this.sizeNumber_N = sizeNumber_N;
        resultArray();
    }

    private int sizeArray() {
        int count = 0;
        for (int i = sizeNumber_N; i > 0; i--) {
            int temp = 0;
            for (int j = i; j > 0; j /= 10) {
                temp += j % 10;
            }
            if (temp == sumElement_K) {
                count++;
            }
        }
        return count;
    }

    private void resultArray() {
        int indexArray = sizeArray();
        array = new int[indexArray];
        for (int i = sizeNumber_N; i > 0; i--) {
            int temp = 0;
            for (int j = i; j > 0; j /= 10) {
                temp += j % 10;
            }
            if (temp == sumElement_K) {
                array[indexArray - 1] = i;
                indexArray--;
            }
        }
    }

    @Override
    public String toString() {
        return "Массив элементов которыми являются числа, сумма цифр которых равна К " + Arrays.toString(array);
    }
}
