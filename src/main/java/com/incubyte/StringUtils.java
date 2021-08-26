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
        int[] numbers = new int[4];
        numbers[0] = parInt(num);
        return numbers;
    }

    private static int parInt(String input) {
        try{
            return Integer.parseInt(input);
        } catch (NumberFormatException ex) {
            return 0;
        }
    }
}
