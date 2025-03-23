package arrays;

import java.util.Arrays;

public class PrefixSums {

    public static int[] prefixSums(int[] inputArray) {
        int sum = 0;
        int[] prefixSumArray = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            sum += inputArray[i];
            prefixSumArray[i] = sum;
        }
        return prefixSumArray;
    }

    public static void main(String[] args) {
        int[] inputArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] result = prefixSums(inputArray);

        System.out.println("Ogiginal" + Arrays.toString(inputArray));
        System.out.println("Suma acumulada" + Arrays.toString(result));
    }
}
