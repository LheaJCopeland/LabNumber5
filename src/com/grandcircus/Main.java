package com.grandcircus;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String loop;

        System.out.println("Welcome to the Grand Circus Casino!");
        System.out.println(" ");

	do {
        System.out.println(" ");
        System.out.println("How many sides should each die have?");
        int x = scan.nextInt();

        Random r = new Random();

        for (int i = 0 ; i < 2 ; i++){
            int z = r.nextInt((x-1));
            System.out.println("Dice Number " +(i+1)+ " is: " + (z+1));
            //I made it z+1 instead of z because I did not want to get the Random number zero!!
        }

        scan.nextLine();
        System.out.println(" ");
        System.out.println("Do you want roll again? Yes or No");
        loop = scan.nextLine();
    }while (loop.equalsIgnoreCase("yes"));
        System.out.println("Thanks for playing along. Goodbye.");

    }
}
