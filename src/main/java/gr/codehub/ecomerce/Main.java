package gr.codehub.ecomerce;
import java.util.Scanner;   //entry library for input from keyboard


public class Main {
    public static void main(String[] args) {

        System.out.printf("Give your number ");
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();     //read the number from keyboard

        //Calculate the max value of an integer
        MaxValue maxvalue = new MaxValue();
        int max = maxvalue.findMaxValue();

        //if number is valid, calculate the factorial
        if (number < max) {
            Factorial factorial = new Factorial();  //object of Factorial type
            System.out.printf("The factorial of the number is " + factorial.computeFactorial(number)); //use method computeFactorial
            System.out.printf("\n");
        }
        //if not valid
        else{
            System.out.println("Maximum value for a valid output is " + max);
        }

        //find out if number is prime or not
        Prime prime = new Prime();
        boolean prOrNot = prime.primeOrNot(number);

        //calculate the harmonic sum of the given number
        HarmonicSum harmonicsum = new HarmonicSum();
        System.out.println("The harmonic sum is: " + harmonicsum.calculateSum(number));

    }
}

