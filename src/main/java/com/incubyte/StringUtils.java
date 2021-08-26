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
        String[] numsSplit = num.split("[,\n]");
        int[] numbers = new int[numsSplit.length];
        for (int i : numbers) {
            numbers[i] = parInt(numsSplit[i]);
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
}
