package gr.codehub.ecomerce;

import java.util.ArrayList;
import java.util.List;

public class Prime {

    //Constructor
    public Prime(){
    }


    //method to find out if number is prime or not
    public boolean primeOrNot(int x){

        if(x<=0||x==1){
            //x is not prime number
            return false;
        }

        boolean flag = true;
        for (int i = 2; i <= x/2; ++i){
            // condition for non-prime number
            if(x % i == 0){
                flag = false;
                break;
            }
        }

        if (flag) {
            //x is prime number
            return true;
        }
        else {
            //x is not prime number
            return false;
        }

    }

}
