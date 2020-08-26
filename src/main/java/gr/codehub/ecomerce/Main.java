package gr.codehub.ecomerce;
import java.util.Scanner;   //entry library for input from keyboard


public class Main {
    public static void main(String[] args) {

    //EXERCISES ON SIMPLE ALGORITHMS
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
        System.out.println(" ");

        //Give a long number as input from the keyboard
        System.out.printf("Give a long number ");
        Scanner console2 = new Scanner(System.in);
        long longNumber = console2.nextLong(); //read the long from keyboard

        //Find the count of digits of the long integer given and print it
        CountDigits countdigits = new CountDigits();
        System.out.println("Number of digits: " + countdigits.numberOfDigits(longNumber));
        System.out.println(" ");

        //Give a float number as input from the keyboard
        System.out.printf("Give a float number ");
        Scanner console3 = new Scanner(System.in);
        float floatNumber = console2.nextFloat();

        //Find the decimal part of the float number and print it
        String floatAsString = String.valueOf(floatNumber);
        int Decimal = floatAsString.indexOf(".");
        System.out.println("Decimal Part: " + floatAsString.substring(Decimal));

    //EXERCISES ON SIMPLE ARRAYS



    }
}

