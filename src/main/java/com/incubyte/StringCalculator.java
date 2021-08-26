package main.java.com.incubyte;

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
        return 0;
    }

}

