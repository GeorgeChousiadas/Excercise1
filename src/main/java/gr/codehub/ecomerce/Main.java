package gr.codehub.ecomerce;

import java.util.ArrayList;
import java.util.Scanner;   //entry library for input from keyboard
import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        ///////////////////////////////////////////////////////////////////
        ////      EXERCISES ON SIMPLE ALGORITHMS  /////////////////////////
        ///////////////////////////////////////////////////////////////////
        System.out.print("Give your number ");
        int number = console.nextInt();     //read the number from keyboard

        //Calculate the max value of an integer
        MaxValue maxvalue = new MaxValue();
        int max = maxvalue.findMaxValue();

        //if number is positive
        if(number>=0) {
            if (number < max) { //if number is valid, calculate the factorial
                Factorial factorial = new Factorial();  //object of Factorial type
                System.out.print("The factorial of the number is: " + factorial.computeFactorial(number)); //use method computeFactorial
                System.out.println(" ");
            }
            //if not valid
            else {
                System.out.println("Maximum value for a valid output is: " + max);
            }
        }else{
                System.out.println("There is not factorial ");
        }
        //find out if number is prime or not
        Prime prime = new Prime();
        prime.primeOrNot(number);

        //calculate the harmonic sum of the given number
        if(number>0) {
            HarmonicSum harmonicsum = new HarmonicSum();
            System.out.println("The harmonic sum is: " + harmonicsum.calculateSum(number));
            System.out.println(" ");
        }
        //Give a long number as input from the keyboard
        System.out.print("Give a long number ");

        long longNumber = console.nextLong(); //read the long from keyboard

        //Find the count of digits of the long integer given and print it
        CountDigits countdigits = new CountDigits();
        System.out.println("Number of digits: " + countdigits.numberOfDigits(longNumber));
        System.out.println(" ");

        //Give a float number as input from the keyboard
        System.out.print("Give a float number ");
        float floatNumber = console.nextFloat();

        //Find the decimal part of the float number and print it
        String floatAsString = String.valueOf(floatNumber);
        int Decimal = floatAsString.indexOf(".");
        System.out.println("Decimal Part: " + floatAsString.substring(Decimal));
        System.out.println(" ");


        ///////////////////////////////////////////////////////////////////
        ///////////    EXERCISES ON SIMPLE ARRAYS   ///////////////////////
        ///////////////////////////////////////////////////////////////////

        //Create an Array list
        List<Integer> list = new ArrayList<>();

        System.out.println("Give your integer/s and press ok ");
        Scanner input = new Scanner(System.in);

        int new_number;
        while (input.hasNextInt()) {
            new_number = input.nextInt();
            list.add(new_number); //Put integers in the list
        }

        //Print the initial arraylist
        System.out.println("ArrayList: " + list);

        // Create the sub list and put only the prime numbers
        List<Integer> sub_list = new ArrayList<>();
        int count;
        for(count=0; count<list.size(); count++) {

                Prime primeNumber = new Prime();
                if(primeNumber.primeOrNot(list.get(count))){
                    sub_list.add(list.get(count));
            }
        }
        //Print the new sub list
        System.out.println("SubList: " + sub_list);




    }
}

