package workingWithStringArrayCharacters;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//3. В строке найти количество цифр.
public class AllDigitsOfTheString {
    public static void main(String[] args) {
        String string3 = "В16 21стро5ке най14ти 74количеств4о чис41ел";
        String numeral = string3.replaceAll("\\D+", "");
        int count = 0;
        for (int i = numeral.length(); i > 0; i--) {
            count++;
        }
        System.out.println("В строке numeral: " + count + " цифр.");
    }
}
