package gr.codehub.ecomerce;

public class Factorial{

    // constructor
    public Factorial(){
    }

    // method to compute the factorial of a number
    public int computeFactorial(int x){
        int i,fact=1;
        for(i=1;i<=x;i++){
            fact=fact*i;
        }
        return fact; //return the result
    }
}