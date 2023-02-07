package com.revature.exceptions;

import java.io.*;

class Main{

    /*
     * Exceptions:
     * 
     * Exceptions represent a situation in which something unusual has occurred, 
     * usually this means some situation has arisen which java doesn't know how to handle on it's own.
     * 
     * We can usually handle this situation by using a try/catch block, 
     * essentially 'trying' the code that may throw an exception, and 'catching' the exception if it does occur, 
     * so that we can handle that situation as it arises
     * 
     * !!Exceptions are NOT errors!!
     *  but errors do represent a similar situation, just usually something more related to the machine at large
     * 
     * Exceptions are divided into two different categories: Checked and Unchecked
     *  
     *  Checked Exceptions(AKA Compile-time Exceptions): These occur while Java is converting source code to .class files
     *      These are rarer, but we will encounter some in this course
     *      Today, I will mention fileNotFoundException, but SQLException is another common one
     * 
     *  Unchecked Exceptions(AKA Runtime Exceptions): These occur while Java is running the .class files as a Java program
     *      These are more common, since more things can go wrong while the program is running than while compiling
     *      Today, we will create our own runtime exception
     */
    public static void main(String[] args){

        // try{
        //     int[] a = new int[]{1,2,3};
        //     System.out.println(a[3]);
        // }catch(Exception e){
        //     System.out.println("Something happened");
        // }

        Car lambo = new Car("Lamborghini", "Aventador", 750);
        try{
            lambo.drive(200, 0);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        // FileInputStream f = null;
        // try{
        //     f = new FileInputStream(new File("C:\\Irrelavant"));
        // }catch(FileNotFoundException e){
        //     //do something here
        // }


        try{
            System.out.println(fib(13));
        }catch(Error e){
            System.out.println(e.getStackTrace()[0]);
        }

    }

    public static void foo()throws FuelGuageException{
        Car lambo = new Car("Lamborghini", "Aventador", 750);
        lambo.drive(1, 0);
    }

    // 0 1 1 2 3
    public static int fib(int x){
        return fib(x);
    }

}