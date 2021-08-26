package main.java.com.incubyte;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Setter(AccessLevel.PRIVATE)
public class ParsedInput {

    private String delimiter;
    private String numbers;

    public static ParsedInput of(String delimiter, String numbers) {
        ParsedInput parsedInput = new ParsedInput();
        parsedInput.setDelimiter(delimiter);
        parsedInput.setNumbers(numbers);
        return parsedInput;
    }

}
