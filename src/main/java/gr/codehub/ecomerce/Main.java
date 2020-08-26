package gr.codehub.ecomerce;
import java.util.Scanner;   //entry library for input from keyboard


public class Main {
    public static void main(String[] args) {

        System.out.printf("Give your number ");
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();     //read the number from keyboard

        Factorial factorial = new Factorial();
        int result = factorial.computeFactorial(number);
        System.out.printf("The factorial of the number is " +result);
    }
}
