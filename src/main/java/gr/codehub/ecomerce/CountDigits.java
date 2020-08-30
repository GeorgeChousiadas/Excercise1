package gr.codehub.ecomerce;

/**
 * CountDigits take as input a long integer
 * uses it's method numberOfDigits
 * and returns the digits of it
 */
public class CountDigits {

    //constructor
    public CountDigits(){
    }

    //create method to count digits
    public int numberOfDigits(long x){

        int count = 0;

        while(x != 0) {
            // x = x/10
            x /= 10;
            ++count;
        }

        return count;
    }


}
