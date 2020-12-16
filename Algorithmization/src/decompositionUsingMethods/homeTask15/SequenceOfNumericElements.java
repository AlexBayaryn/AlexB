package decompositionUsingMethods.homeTask15;

public class SequenceOfNumericElements {
    private int startNumber;
    private int finishNumber;

    public SequenceOfNumericElements(int startNumber, int finishNumber) {
        this.startNumber = startNumber;
        this.finishNumber = finishNumber;
    }

    public void computationOfConsecutiveElements() {
        boolean check = false;
        for (int i = startNumber; i <= finishNumber; i++) {
            int temp = finishNumber;
            for (int j = i; j > 0; j /= 10) {
                if (temp > j % 10) {
                    temp = j % 10;
                    check = true;
                } else {
                    check = false;
                    break;
                }
            }
            if (check == true) {
                System.out.println(i);
            }
        }
    }
}