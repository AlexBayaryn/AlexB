package decompositionUsingMethods.homeTask7;

public class Factorial {
    private int number;
    private int summaFactorials;

    public Factorial(int number) {
        this.number = number;
    }

    public int calculatingFactorial() {
        if (number % 2 != 0) {
            for (int i = number; i > 0; i -= 2) {
                int factorialOddNumber = 1;
                for (int j = 2; j <= i; j++) {
                    factorialOddNumber *= j;
                }
                summaFactorials += factorialOddNumber;
            }
            return summaFactorials;
        } else {
            return -1;
        }
    }
}


