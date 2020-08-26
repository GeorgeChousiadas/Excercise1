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

        if (number < max) {
            Factorial factorial = new Factorial();  //object of Factorial type
            int result = factorial.computeFactorial(number);    //use method computeFactorial
            System.out.printf("The factorial of the number is " + result);
            System.out.printf("\n");
        } else {
            System.out.println("Maximum value of integer is " + max);
        }
    }
}

