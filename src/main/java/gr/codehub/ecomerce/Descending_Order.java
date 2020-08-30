package gr.codehub.ecomerce;

/**
* Descending_Order is a class uses
 * it's method orderDigits to display
 * the digits on the number in descending order
 * put them in an array and print them
 *
 */
public class Descending_Order {

    //constructor
    public Descending_Order(){

    }

    public void orderDigits(int x){

        int len = Integer.toString(x).length(); //take it's length in variable
        int a[] = new int[len]; //create an int table for the digits
        int i=0;

        //put the digits in the table a[]
        while(x != 0){
            a[i] = x % 10;
            x /= 10;
            i++;
        }

        //sorting the digits of the table
        for(i = 0; i < len; i++){
            for(int j = 0; j < len - 1 - i; j++){
                if(a[j] < a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.print("The digits in descending order are: ");
        for(i = 0; i < len; i++){
            System.out.print(+a[i]);
        }
        System.out.println(" ");
        System.out.println(" ");
    }

}
