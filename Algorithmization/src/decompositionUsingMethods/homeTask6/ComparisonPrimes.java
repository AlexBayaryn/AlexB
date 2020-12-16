package decompositionUsingMethods.homeTask6;

public class ComparisonPrimes {
    private int number1;
    private int number2;
    private int number3;

    public ComparisonPrimes(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    private int largerNumber() {
        return Math.max(Math.max(number1, number2), (number3));
    }

    public void checkNumbers() {
        boolean check = false;
        for (int i = largerNumber() - 1; i > 1; i--) {
            if (number1 % i == 0 && number2 % i == 0 || number1 % i == 0 && number3 % i == 0 || number2 % i == 0 && number3 % i == 0) {
                System.out.println("Числа " + number1 + ", " + number2 + ", " + number3 + " не являются взаимно простыми числами.");
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("Числа " + number1 + ", " + number2 + ", " + number3 + " являются взаимно простыми числами.");
        }
    }
}

