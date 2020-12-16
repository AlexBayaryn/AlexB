package decompositionUsingMethods.homeTask14;

public class SearchNumberAmstrong {
    long number;

    public SearchNumberAmstrong(long number) {
        this.number = number;
    }

    public void methodAmstrong() {
        long countElementNumber = 1;
        while (countElementNumber < number) {
            if (countElementNumber < 10) {
                System.out.println("Число " + countElementNumber + " является числом Амстронга");
            }
            if (countElementNumber >= 10) {
                int powNumber = 0;
                for (long i = countElementNumber; i > 0; i /= 10) {
                    powNumber++;
                }
                int sumElement = 0;
                long numericElement;
                for (long j = countElementNumber; j > 0; j /= 10) {
                    numericElement = j % 10;
                    sumElement += Math.pow(numericElement, powNumber);
                }
                if (countElementNumber == sumElement) {
                    System.out.println("Число " + countElementNumber + " является числом Амстронга");
                }
            }
            countElementNumber++;
        }
    }
}
