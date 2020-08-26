package gr.codehub.ecomerce;

public class MaxValue{

    //constructor
    public MaxValue(){
    }

    //method of class MaxValue to calculate max of an integer
    public static int findMaxValue(){

        int res = 2;
        long fact = 2;
        while (true) {
            // when fact crosses its size,
            // it gives negative value
            if (fact < 0) {
                break;
            }
            res++;
            fact = fact * res;
        }
        return res - 1;
    }

}
