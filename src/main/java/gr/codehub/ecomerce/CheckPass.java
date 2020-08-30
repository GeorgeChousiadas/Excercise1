package gr.codehub.ecomerce;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Check Pass has methods which
 * check out all the criteria
 */
public class CheckPass {

    //constructor
    public CheckPass() {

    }

    //check to have at least on uppercase
    public boolean checkUpper(String x){
        char ch;
        for (int i = 0; i < x.length(); i++) {
            ch = x.charAt(i);
            if (Character.isUpperCase(ch)) {
                return true;
            }

        }
        return false;
    }

    //check to have at least one lowercase
    public boolean checkLower(String x){
        char ch;
        for (int i = 0; i < x.length(); i++) {
            ch = x.charAt(i);
            if (Character.isLowerCase(ch)) {
                return true;
            }

        }
        return false;
    }

    //check to have at least one number
    public boolean checkNumber(String x){
        char ch;
        for (int i = 0; i < x.length(); i++) {
            ch = x.charAt(i);
            if (Character.isDigit(ch)) {
                return true;
            }

        }
        return false;
    }


    //check for special character
    public boolean checkSpecial(String x) {
        char ch;
        char specialChar;
        String specialChars = "/*!@#$%^&*()\"{}_[]|\\?/<>,.";

        for(int i=0; i<specialChars.length(); i++) {
            specialChar = specialChars.charAt(i);
            for (int j = 0; j < x.length(); j++) {
                ch = x.charAt(j);
                if ( ch == specialChar ){
                    return true;
                }

            }
        }
        return false;
    }

    //check for 8 characters length
    public boolean checkLength(String x){
        int minimum = 8;
        if(x.length() <8){
            return false;
        }
        return true;
    }

    //check for sequence of 3 same/consecutive characters
    public boolean checkSequence(String x) {
        Pattern pattern = Pattern.compile("([a-z\\d])\\1\\1", Pattern.CASE_INSENSITIVE);
        Pattern pattern2 = Pattern.compile("(abc|bcd|cde|def|efg|fgh|ghi|hij|ijk|jkl|klm|lmn|mno|" +
                "nop|opq|pqr|qrs|rst|stu|tuv|uvw|vwx|wxy|xyz|012|123|234|345|456|567|678|789)+");

        Matcher matcher = pattern.matcher(x);
        Matcher matcher2 = pattern2.matcher(x);

        boolean matchFound = matcher.find();
        boolean matchFound2 = matcher2.find();

        if(matchFound || matchFound2) {
            return false;
        } else {
            return true;
        }



    }
}

