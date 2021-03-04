package playground.junit.firsttest;

import java.util.Arrays;
import java.util.List;

public class NumberSelector {

    // [1,2,4,5,6,7,8]
    public int[] selectEvenNumbers(int[] numbers) {

        if (numbers == null) {
            return new int[]{0};
        }

        int[] evenNumbers = new int[numbers.length];
        int count = 0;
        for (int k = 0; k < numbers.length; k++) {
            if (numbers[k]%2 == 0) {
                evenNumbers[count] = numbers[k];
                count++;
            }
        }
        return Arrays.copyOf(evenNumbers, count);
    }

    // [2,6,8]

    //Tworzymy klasę NumberSelectorTest (Ctrl+Shift+T)
}
