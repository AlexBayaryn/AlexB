package decompositionUsingMethods.homeTask11;

public class ComparingStringsOfNumbers {
    String stringOfNumbers1;
    String stringOfNumbers2;

    public ComparingStringsOfNumbers(String stringOfNumbers1, String stringOfNumbers2) {
        this.stringOfNumbers1 = stringOfNumbers1;
        this.stringOfNumbers2 = stringOfNumbers2;
    }

    public String numberLengthComparison() {
        if (stringOfNumbers1.length() > stringOfNumbers2.length()) {
            return "Число " + stringOfNumbers1 + " Больше чем число " + stringOfNumbers2;
        }
        return "Число " + stringOfNumbers2 + " Больше чем число " + stringOfNumbers1;
    }
}
