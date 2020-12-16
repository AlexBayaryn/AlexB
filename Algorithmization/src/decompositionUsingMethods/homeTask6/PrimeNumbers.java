package decompositionUsingMethods.homeTask6;

//  6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
public class PrimeNumbers {
    public static void main(String[] args) {
        ComparisonPrimes comparisonPrimes = new ComparisonPrimes(81, 214, 11);
        comparisonPrimes.checkNumbers();
    }
}
