package gr.codehub.ecomerce;

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
