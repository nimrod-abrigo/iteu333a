package activity1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Activity1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        regexChecker("[a-z_]{1,}", input, "ID");
        regexChecker("[+]", input, "PLUS");
        regexChecker("[-]", input, "MINUS");
        regexChecker("[*]", input, "TIMES");
        regexChecker("[/]", input, "DIVIDE");
        regexChecker("[(]", input, "LPAREN");
        regexChecker("[)]", input, "RPAREN");
        regexChecker("[=]", input, "ASSIGN");
        regexChecker("[;]", input, "SEMI");
        regexChecker("[0-9]{1,}", input, "NUM");
    }

    public static void regexChecker(String theRegex, String str2Check, String identifier) {
        Pattern checkRegex = Pattern.compile(theRegex);
        Matcher regexMatcher = checkRegex.matcher(str2Check);

        while (regexMatcher.find()) {
            if (regexMatcher.group().length() != 0) {
                System.out.println("Token: " + regexMatcher.group().trim());
            }

            System.out.println("Identifier: " + identifier);
        }
    }
}
