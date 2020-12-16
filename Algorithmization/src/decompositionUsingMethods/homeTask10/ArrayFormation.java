package decompositionUsingMethods.homeTask10;

import java.util.Arrays;

public class ArrayFormation {
    int number;
    int arraySize;
    int[] array;

    public ArrayFormation(int number) {
        this.number = number;
        this.getSizeOfArray();
        this.fillArray();
    }

    private void getSizeOfArray() {
        for (int i = number; i > 0; i /= 10) {
            arraySize++;
        }
    }

    private void fillArray() {
        array = new int[arraySize];
        int arrayIndex = array.length - 1;
        for (int j = number; j > 0; j /= 10) {
            array[arrayIndex] = j % 10;
            arrayIndex--;
        }
    }

    @Override
    public String toString() {
        return "Массив " + Arrays.toString(array);
    }
}



