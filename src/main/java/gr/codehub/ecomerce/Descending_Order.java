package gr.codehub.ecomerce;

public class Descending_Order {

    //constructor
    public Descending_Order(){

    }

    public void orderDigits(int x){

        int len = Integer.toString(x).length(); //take it's length in variable
        int a[] = new int[len]; //create an int table for the digits
        int i=0;

        //Put the digits in the table a[]
        while(x != 0){
            a[i] = x % 10;
            x /= 10;
            i++;
        }

        //Sorting the digits of the table
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

    }

}
