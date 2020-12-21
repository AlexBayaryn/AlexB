package decompositionUsingMethods.homeTask13;

import java.util.ArrayList;
import java.util.List;

public class FindTwinNumbers {
    int startNumber;

    public FindTwinNumbers(int startNumber) {
        this.startNumber = startNumber;
    }

    public List<String> twinsList() {
        List<String> listTwins = new ArrayList<>();
        int endNumber = startNumber * 2;
        for (int i = startNumber; i <= endNumber - 2; i++) {
            if (isTwinPrimes(i)) {
                listTwins.add("(" + String.valueOf(i) + ", " + String.valueOf(i + 2) + ")");
            }
        }
        return listTwins;
    }

    private boolean isTwinPrimes(int i) {
        boolean check = false;
        for (int j = i - 1; j > 1; j--) {
            if (i % j != 0 && (i + 2) % j != 0) {
                check = true;
            } else {
                check = false;
                break;
            }
        }
        return check;
    }
}