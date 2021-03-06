package main.java.com.incubyte;

import java.util.Arrays;

public class StringUtils {
    private StringUtils() {
    }

    public static boolean isEmpty(String num) {
        if (num == null) {
            return true;
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
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException ex) {
            return 0;
        }
    }

    private static ParsedInput parseInputString(String inp) {
        if (!inp.startsWith("//")) {
            return ParsedInput.of("[,\n]", inp);
        }
        String[] parts = inp.split("\n");
        String delimiters = getDelimiters(parts[0].substring(2));
        return ParsedInput.of(delimiters, parts[1]);
    }

    private static String getDelimiters(String input) {
        String[] delimiters = input.split("]");
        return Arrays.stream(delimiters).map(str -> str.substring(1))
                .map(StringUtils::sanitize)
                .reduce("", (s1, s2) -> s1 + "|" + s2);
    }

    private static String sanitize(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c == '*') {
                sb.append("\\");
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
