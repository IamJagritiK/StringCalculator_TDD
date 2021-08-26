package main.java.com.incubyte;

import java.util.Arrays;

/**
 * String Calculator class for basic operations
 */
public class StringCalculator{
    public int add(String numbers) {

        if(StringUtils.isEmpty(numbers)) {
            return 0;
        }
        return sum(StringUtils.getNums(numbers));
    }

    private int sum(int[] numbs) {
        getValidInput(numbs);
        return Arrays.stream(numbs).sum();
    }

    private void getValidInput(int[] nums) {
        int[] ngt = Arrays.stream(nums).filter(x -> x < 0).toArray();
        if(ngt.length != 0) {
            String message = String.format("Negative no. %s are not supported", Arrays.toString(ngt));
            throw new UnsupportedOperationException(message);
        }
    }
}

