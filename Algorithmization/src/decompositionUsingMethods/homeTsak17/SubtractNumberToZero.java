package decompositionUsingMethods.homeTsak17;

public class SubtractNumberToZero {
    private int number;

    public SubtractNumberToZero(int number) {
        this.number = number;
    }

    public int subtractingSumOfElements() {
        int counter = 0;
        while (number > 0) {
            int sumElements = 0;
            for (int i = number; i > 0; i /= 10) {
                sumElements += i % 10;
            }
            counter++;
            number -= sumElements;
        }
        return counter;
    }
}
