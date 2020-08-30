package gr.codehub.ecomerce;

/**
 * Factorial calculate the factorial n!
 * of a given integer
 */
public class Factorial{

    //constructor
    public Factorial(){
    }

    //method to compute the factorial of a number
    public long computeFactorial(int x){

        long factorial = 1;
        for(int i = 1; i <= x; ++i) {
            // factorial = factorial * i;
            factorial *= i;
        }
        return factorial;
    }
}