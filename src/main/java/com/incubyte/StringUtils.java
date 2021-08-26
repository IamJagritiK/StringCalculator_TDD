package main.java.com.incubyte;

public class StringUtils {
    private StringUtils(){}

    public static boolean isEmpty(String num){
        if(num == null) {
            return  true;
        }
        return num.isEmpty();
    }

    public static int[] getNums(String num) {
        ParsedInput parsedInput = parseInputString(num);
        String[] nums = parsedInput.getNumbers().split(parsedInput.getDelimiter());
        int[] numbers = new int[nums.length];
        for (int i : numbers) {
            numbers[i] = parInt(nums[i]);
        }
        return numbers;
    }

    private static int parInt(String input) {
        try{
            return Integer.parseInt(input);
        } catch (NumberFormatException ex) {
            return 0;
        }
    }
    private static ParsedInput parseInputString(String input) {
        return null;
    }
}
