package com.company;


import com.sun.xml.internal.stream.Entity;

import java.util.Scanner;

public class Program {

    public static void main( String[] args )
    {
        double num1, num2, num3;
        Scanner keyboard = new Scanner(System.in);



        System.out.print( "First integer? " );
        num1 = keyboard.nextDouble();

        System.out.print( "Second integer? " );
        num2 = keyboard.nextDouble();

        System.out.print( "Third integer? " );
        num3 = keyboard.nextDouble();
        System.out.println("The total is : " + num1 + num2 + num3);
    }

}

