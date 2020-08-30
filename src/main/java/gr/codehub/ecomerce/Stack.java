package gr.codehub.ecomerce;

import java.util.*;

/**
 * Stack implementation with it's main
 * functionalities push/pop/peek
 */
public class Stack{

    ArrayList<Character> stack = new ArrayList<Character>();
    int top=0;

    //constructor
    public Stack() {

    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){
        return top<=0;
    }

    //push char
    public void push(char data){
        stack.add(data);
        top++;
    }

    //pop char
    public char pop(){
        char data;
        top--;

        data = stack.get(top);
        stack.remove(top); //pop the top char in the stack
        return data; //return the top char
    }

    //peek char
    public char peek(){
        return stack.get(top-1); //return the top char
    }

    //printing
    public void show(){

            System.out.println(stack+" ");

    }


}