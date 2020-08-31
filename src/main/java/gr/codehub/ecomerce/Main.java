package gr.codehub.ecomerce;

import java.util.ArrayList;
import java.util.Scanner;   //entry library for input from keyboard
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        ///////////////////////////////////////////////////////////////////
        ////      EXERCISES ON SIMPLE ALGORITHMS  /////////////////////////
        ///////////////////////////////////////////////////////////////////
        System.out.print("Give your number ");
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();     //read the number from keyboard

        //calculate the max value of an integer
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
        System.out.println("The number is prime? " +prime.primeOrNot(number));

        //Calculate the harmonic sum of the given number
        if(number>0) {
            HarmonicSum harmonicsum = new HarmonicSum();
            System.out.println("The harmonic sum is: " + harmonicsum.calculateSum(number));
            System.out.println(" ");
        }
        //give a long number as input from the keyboard
        System.out.print("Give a long number ");

        long longNumber = console.nextLong(); //read the long from keyboard

        //Find the count of digits of the long integer given and print it
        CountDigits countdigits = new CountDigits();
        System.out.println("Number of digits: " + countdigits.numberOfDigits(longNumber));
        System.out.println(" ");

        //give a float number as input from the keyboard
        System.out.print("Give a float number ");
        float floatNumber = console.nextFloat();

        //find the decimal part of the float number and print it
        String floatAsString = String.valueOf(floatNumber);
        int Decimal = floatAsString.indexOf(".");
        System.out.println("Decimal Part: " + floatAsString.substring(Decimal));
        System.out.println(" ");


        ///////////////////////////////////////////////////////////////////
        ///////////    EXERCISES ON SIMPLE ARRAYS   ///////////////////////
        ///////////////////////////////////////////////////////////////////

        //create an Array list
        List<Integer> list = new ArrayList<>();

        System.out.println("Give your integer/s till you press a letter ");
        Scanner input = new Scanner(System.in);

        int new_number;
        while (input.hasNextInt()) {
            new_number = input.nextInt();
            list.add(new_number); //Put integers in the list
        }

        //print the initial arraylist
        System.out.println("List: " + list);

        //create the sub list and put only the prime numbers
        List<Integer> sub_list = new ArrayList<>();
        int count;
        for(count=0; count<list.size(); count++) {

                Prime primeNumber = new Prime();
                if( primeNumber.primeOrNot(list.get(count)) ){
                    sub_list.add(list.get(count));
            }
        }
        //print the new sub list
        System.out.println("SubList: " + sub_list);


        //create a set with name hashSet (set does not have duplicate elements)
        Set<Integer> hashSet = new LinkedHashSet(list);
        ArrayList<Integer> removeDuplicates = new ArrayList(hashSet);
        System.out.println("Non-duplicated list: " + removeDuplicates);
        System.out.println(" ");

        //read an integer from keyboard
        System.out.print("Give a number ");
        int newNumber = console.nextInt();
        Descending_Order descending_order = new Descending_Order();
        descending_order.orderDigits(newNumber);


        //read a string from keyboard
        System.out.print("Enter your string ");
        Scanner myObj = new Scanner(System.in);
        String userString = myObj.nextLine();

        //create a stack object word
        Stack word = new Stack();

        //push characters from the string one by one in the stack
        for(int i=0; i<userString.length(); i++) {
            char c = userString.charAt(i);
            word.push(c);
        }

        System.out.println("Your string is put in the stack successfully! ");

        System.out.print("Your reverse string is: ");

        for(int i=0; i<userString.length(); i++) {
            System.out.print(word.pop());
        }
        System.out.println(" ");
        System.out.println(" ");

        //give a word from keyboard
        System.out.print("Enter your word ");
        Scanner myObj2 = new Scanner(System.in);
        String userWord = myObj2.nextLine();

        //create an object
        Palindrome palindromeStr = new Palindrome();

        //in this object apply the method to see if it is symmetric or not
        if(palindromeStr.PalindromeFunction(userWord)){
            System.out.println("The word is symmetric ");
        }
        else{
            System.out.println("The word is not symmetric ");
        }
        System.out.println(" ");
        ///////////////////////////////////////////////////////////////////
        ///////////    STRING CLASS EXERCISE   ///////////////////////
        ///////////////////////////////////////////////////////////////////

        //give your password from keyboard
        System.out.print("Enter your password ");
        Scanner myObj3 = new Scanner(System.in);
        String userPassword = myObj3.nextLine();


        CheckPass check1 = new CheckPass();

/*

        //1 check if password has at least one uppercase
        if (!check1.checkUpper(userPassword)) {
            System.out.println("Your password must have at least one uppercase character ");
        }

        //2 check if password has at least one lowercase
        if (!check1.checkLower(userPassword)) {
            System.out.println("Your password must have at least one lowercase character ");
        }

        //3 check if password has at least one number
        if(!check1.checkNumber(userPassword)){
            System.out.println("Your password must have at least one number ");
        }

        //4 check if password has at least one special character
        if(!check1.checkSpecial(userPassword)){
           System.out.println("Your password must have at least one special character ");
        }

        //5 check if password has at least 8 characters
        if(!check1.checkLength(userPassword)){
            System.out.println("Your password must have at least 8 characters long ");
        }

        //6 check if password contains sequences
        if(!check1.checkSequence(userPassword)){
            System.out.println("Your password cannot contain a sequence of 3 characters ");
        }

*/

        int counter=0;

        if( !check1.checkLength(userPassword) ) {
            System.out.println("Invalid password ");

            if(!check1.checkUpper(userPassword))
                System.out.println("Your password must have at least one uppercase character ");

            if (!check1.checkLower(userPassword))
                System.out.println("Your password must have at least one lowercase character ");

            if (!check1.checkNumber(userPassword))
                System.out.println("Your password must have at least one number ");

            if(!check1.checkSpecial(userPassword))
                System.out.println("Your password must have at least one special character ");

            if(!check1.checkLength(userPassword))
                System.out.println("Your password must have at least 8 characters long ");

            if(!check1.checkSequence(userPassword))
                System.out.println("Your password cannot contain a sequence of 3 characters ");

        }
        else{
            counter = 1;
            if(check1.checkUpper(userPassword))
                counter++;

            if (check1.checkLower(userPassword))
                counter++;

            if (check1.checkNumber(userPassword))
                counter++;

            if(check1.checkSpecial(userPassword))
                counter++;

            if(check1.checkSequence(userPassword))
                counter++;

            switch(counter){
                case 6:
                    System.out.println("Very Strong password ");
                    break;
                case 5:
                    System.out.println("Strong password ");
                    break;
                case 4:
                    System.out.println("Password OK ");
                    break;
                case 3:
                    System.out.println("Password OK ");
                    break;

            }
        }


    }
}

