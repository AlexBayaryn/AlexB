package decompositionUsingMethods.homeTask16;

import java.util.Arrays;

public class SearchOddNumber {
    private int quantitySign;
    private int[] array;


    public SearchOddNumber(int quantitySign) {
        this.quantitySign = quantitySign;
        fillingArray();
    }

    private void fillingArray() {
        array = new int[quantitySign];
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumber();
        }
    }

    @Override
    public String toString() {
        return "Массив случайных чисел " + Arrays.toString(array);
    }

    private int randomNumber() {
        return (int) (Math.random() * (900 - 100) + 100);

    }

    public int sumOddNumber() {
        boolean check = false;
        int sum = 0;
        for (int j = 0; j < array.length; j++) {
            int temp;
            for (int x = array[j]; x > 0; x /= 10) {
                temp = x % 10;
                if (temp % 2 != 0 || temp == 0) {
                    check = true;
                } else {
                    check = false;
                    break;
                }
            }
            if (check == true) {
                sum = sum + array[j];
            }
        }
        return sum;
    }

    public int quantityEvenElements() {
        int counter = 0;
        for (int g = sumOddNumber(); g > 0; g /= 10) {
            int temp2 = g % 10;
            if (temp2 % 2 == 0 && temp2 != 0) {
                counter++;
            }
        }
        return counter;
    }
}
