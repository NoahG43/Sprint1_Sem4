//edit made Oct 30 in AM by T Engle
// Worked on by Noah Gosse


package com.keyin.members;

import java.util.Scanner;
import picocli.CommandLine;
import picocli.CommandLine.Command;


public class CLI {
    public static int mainMenuCall(){
    //method to display the main menu of our program
    //returns variable to store menu selection
        int numSelection = 0;

        Scanner select = new Scanner(System.in);

        System.out.println("******************************************");
        System.out.println("Welcome to The Golf Club interactive menu!");
        System.out.println("******************************************");
        System.out.println("Enter a number 1,2, or 3(4 to exit)");
        System.out.println("1. Members");
        System.out.println("2. Tournaments");
        System.out.println("3. Help");
        System.out.println("Enter selection: ");
        numSelection = select.nextInt();

        return numSelection;
    }
    public static void main(String[] args){
    //main executable file
        Scanner input = new Scanner( System.in );

        System.out.println("select an option from the menu: ");

        int numSelection = mainMenuCall();
            switch (numSelection) {
                case 1:
                    System.out.println("Members!");
                    //membersFunctionCall();
                    break;
                case 2:
                    System.out.println("Tournaments!");
                    //tournyFunctionCall();
                    break;
                case 3:
                    System.out.println("Help!");
                    //helpFunctionCall();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("incorrect input please try again");
                    System.out.println("");
                    mainMenuCall();
            }

    }
}
