package edu.whccd.evaldez;

import java.util.Scanner;

/*
    The purpose of this application is to show the uses of while and for loops.
    author: Evander Valdez
*/
public class Main {

    public static void main(String[] args) {
    System.out.print("Enter an integer (20-50): ");

    //initialize variables and create a scanner object
    int limit = 0;
    int currentNumber = 0;
    Scanner sc = new Scanner(System.in);

    //for loop
    limit = sc.nextInt();
    if (limit < 20 || limit > 50)
    {
        System.out.println("Invalid Input");
        System.exit(0);
    }
    for(int i = 1; i<= limit-1; i++)
    {
        if (i % 2 == 0)
        {
            System.out.println(i);
        }
    }
    System.out.println("********************************");
    System.out.println("odd numbers decreasing");

    //while loop
    currentNumber = limit;
    while(currentNumber > 0)
    {
        currentNumber--;
        if (currentNumber % 2 == 1)
        {
            System.out.println(currentNumber);
        }
    }
    }
}
