package regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpression {
    public static void main(String[] args) {
        //Example 1
        //Pattern is used to define a regular expression.
        //"Hello" is the regex pattern that we want to find in the text.
        Pattern pattern = Pattern.compile("Hello", Pattern.CASE_INSENSITIVE);
        //Matcher is used to perform the operations of searching the text against the pattern.
        Matcher matcher = pattern.matcher("Hello world!");
        boolean matchFound = matcher.find();
        if (matchFound) { //shorthand way to check if a boolean variable is true
            System.out.println("Match found");
        } else {
            System.out.println("Not matching");
        }
        //Example 2
        String[] emails = {"user@example.com",
                "user.name@domain.co.in",
                "user-name@domain.co",
                "user_name@domain.com",
                "user@domain", // Invalid (no TLD)
                "user@domain@domain.com", // Invalid (double @)
                "user@domain.c", // Valid, though unusual TLD
                "userdomain.com" // Invalid (no @ symbol)}
        };
        String emailRegExp = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern1 = Pattern.compile(emailRegExp);
        for (String email : emails) {
            Matcher matcher1 = pattern1.matcher(email);
            boolean emailMatchFound = matcher1.matches();
            if (emailMatchFound) {
                System.out.println(email + " : is a valid email address");
            } else {
                System.out.println(email + " : is not a valid email address");
            }
        }
    }

}
