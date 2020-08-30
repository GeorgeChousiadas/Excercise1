package gr.codehub.ecomerce;

/**
 * HarmonicSum calculates the harmonic
 * of the sum : 1 + ½ + ⅓ + … + 1/n
 * of a given number n
 */
public class HarmonicSum {

    //constructor
    public HarmonicSum(){
    }

    //method to calculate the sum
    public double calculateSum(int x){

        double i;
        double sum = 0.0;

        for (i = 1; i <= x; i++) {
            sum = sum + 1 / i;
        }

        return sum;
    }

}
