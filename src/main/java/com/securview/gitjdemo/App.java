package com.securview.gitjdemo;

/**
 * Hello world!
 * This is main class
 */
public class App 
{
	//main method
    public static void main( String[] args )
    {

        System.out.println( "Hello World 2 !" );
        System.out.println( "new change" );
        System.out.println( "Hello World 22 !" );
        System.out.println( "New changes by feature" );
    }
    
    private static void newMethod() {
    	System.out.println( "newMethod" );
        System.out.println( "Hello World 22 !" );
    }
    //master
    private static void f1() {
    	System.out.println( "f1" );
    }
    private static void master() {
    	System.out.println( "master" );
    }
}
