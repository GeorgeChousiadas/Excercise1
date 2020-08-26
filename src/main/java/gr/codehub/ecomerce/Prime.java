package gr.codehub.ecomerce;

public class Prime {

    //Constructor
    public Prime(){
    }

    //method to find out if number is prime or not
    public static boolean primeOrNot(int x){

        boolean flag = true;
        for (int i = 2; i <= x/2; ++i){
            // condition for non-prime number
            if(x % i == 0){
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println(x + " is prime number");
            return true;
        }
        else {
            System.out.println(x + " is non-prime number");
            return false;
        }

    }

}
