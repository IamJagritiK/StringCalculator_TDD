package main.java.com.incubyte;

import java.util.Arrays;

/**
 * String Calculator class for basic operations
 */
public class StringCalculator{
    private int count = 0;
    private static final int CALCULATOR_LIMIT = 1000;

    public int add(String numbers) {

        if(StringUtils.isEmpty(numbers)) {
            return 0;
        }
        incrementCount();

        return sum(StringUtils.getNums(numbers));
    }
    private void incrementCount() {
        count += 1;
    }

    private int sum(int[] numbs) {
        getValidInput(numbs);
        return Arrays.stream(getValidInput(numbs)).sum();
    }

    private int[] getValidInput(int[] nums) {
        int[] negatives = Arrays.stream(nums).filter(x -> x < 0).toArray();
        if(negatives.length != 0) {
            String message = String.format("Negative number(s) %s are not supported", Arrays.toString(negatives));
            throw new UnsupportedOperationException(message);
        }
        return Arrays.stream(nums).filter(x -> x <= CALCULATOR_LIMIT).toArray();
    }


}

