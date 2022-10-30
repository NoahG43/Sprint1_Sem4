//Last edited Oct 30 9:00pm
//Created for
//Created on Oct 23
//Created by Noah Gosse


package com.keyin.members;
import java.util.Scanner;
public class CLI {
    public static int mainMenu(){
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
        System.out.println("Enter selection: ");
        numSelection = select.nextInt();
        return numSelection;
    }
    public static void main(String[] args){
    //main executable file
        Scanner input = new Scanner( System.in );
    //switch statement is how menu naviation happens
        System.out.println("select an option from the menu: ");
        int numSelection = mainMenu();
            switch (numSelection) {
                case 1:
                //case1 is members menu
                    System.out.println("Members!");
                    //membersFunctionCall();
                    //scanner
                    //selection variable
                    //menu options shown with print statements
                    int membersNumSelection = 0;
                    Scanner membersMenuInput = new Scanner( System.in );
                    while (membersNumSelection != 3) {
                        System.out.println("Members menu!");
                        System.out.println("1. All users");
                        System.out.println("2. User search");
                        System.out.println("3. Return");
                        System.out.println("Make a selection: ");
                        membersNumSelection = input.nextInt();
                        if (membersNumSelection == 1) {
                            System.out.println("All users in database");
                            //return all users stored in the database
                        } else if (membersNumSelection == 2) {
                            System.out.println("Enter name of member you are requesting info for: ");
                        } else if (membersNumSelection == 3) {
                            System.out.println("Back to main menu");
                            mainMenu();
                        } else {
                            System.out.println("Sorry wrong input!");
                        }
                    }
                    break;
                case 2:
                //case2 is tournaments menu
                    System.out.println("Tournaments!");
                    int tournamentsNumSelection = 0;
                    Scanner tournamentsInput = new Scanner( System.in );
                    while (tournamentsNumSelection != 3){
                        System.out.println("Tournaments menu!");
                        System.out.println("1. All tournaments");
                        System.out.println("2. Tournament search");
                        System.out.println("3. Return");
                        tournamentsNumSelection = input.nextInt();
                        if (tournamentsNumSelection == 1) {
                            System.out.println("All tournaments in database");
                            //return all users stored in the database
                        } else if (tournamentsNumSelection == 2) {
                             String temporaryInput;
                            System.out.println("Enter name of member you are requesting info for: ");
                            temporaryInput = tournamentsInput.next();
                            //search database for a member with the name of <temporaryInput> and return all info
                        } else if (tournamentsNumSelection == 3) {
                            System.out.println("Back to main menu!");
                            mainMenu();
                        } else {
                            System.out.println("Sorry wrong input!");
                        }
                    }
                    break;
                default:
                    System.out.println("Incorrect input please try again");
                    System.out.println("");
            }
    }
}
