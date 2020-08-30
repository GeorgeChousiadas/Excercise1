package gr.codehub.ecomerce;


/**
 * Palindrome checks if a word is symmetric
 * ignoring cases
 */
public class Palindrome {

    //constructor
    public Palindrome(){

    }

    public boolean PalindromeFunction(String x){

        boolean notPalindrome = true;

        String a = x.replaceAll("[^a-zA-Z]+","").toLowerCase();
        char[] array = a.toCharArray();

        for(int i=0, j=array.length-1; i<j; i++, j--) {
            if(array[i] != array[j]) {
                notPalindrome = false;
                break;
            }
        }
        return notPalindrome;
    }

}
