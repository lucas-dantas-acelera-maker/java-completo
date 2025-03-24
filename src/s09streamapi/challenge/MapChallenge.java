package s09streamapi.challenge;

import s09streamapi.challenge.utils.StringOps;

import java.util.Arrays;
import java.util.List;

public class MapChallenge {
    public static void main(String[] args) {
        /*
        * 1 - Number to binary String... 6 -> "110"
        * 2 - Reverse binary String... "110" -> "011"
        * 3 - Reversed binary String to Integer... "011" -> 3
        * */

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println("====================MAP CHALLENGE====================");
        System.out.println("Original list: ");
        numbers.forEach(System.out::println);

        System.out.println("Binary Strings: ");
        numbers.stream().map(StringOps.convertIntToBinaryStr).forEach(System.out::println);

        System.out.println("Reversed binary Strings: ");
        numbers.stream()
                .map(StringOps.convertIntToBinaryStr)
                .map(StringOps.reverseString)
                .forEach(System.out::println);


        System.out.println("Reversed binary Strings back to Integer: ");
        numbers.stream()
                .map(StringOps.convertIntToBinaryStr)
                .map(StringOps.reverseString)
                .map(StringOps.convertBinaryStrToInt)
                .forEach(System.out::println);
    }
}
