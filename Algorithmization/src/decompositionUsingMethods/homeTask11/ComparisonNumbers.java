package decompositionUsingMethods.homeTask11;

//  11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
public class ComparisonNumbers {
    public static void main(String[] args) {
        ComparingStringsOfNumbers comparingStringsOfNumbers = new ComparingStringsOfNumbers("17894848", "681568468616");
        System.out.println(comparingStringsOfNumbers.numberLengthComparison());
    }
}
