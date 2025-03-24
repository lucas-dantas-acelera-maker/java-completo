package s09streamapi.challenge.utils;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class StringOps {

    private StringOps() {
    }

    public static final Function<Integer, String> convertIntToBinaryStr = Integer::toBinaryString;
    public static final UnaryOperator<String> reverseString = s -> new StringBuffer(s).reverse().toString();
    public static final Function<String, Integer> convertBinaryStrToInt = s -> Integer.parseInt(s, 2);

    public static final UnaryOperator<String> uppercase = String::toUpperCase;
}
