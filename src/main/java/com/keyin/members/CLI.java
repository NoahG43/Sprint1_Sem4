// Worked on by Noah Gosse

package com.keyin.members;

import java.util.Scanner;
import picocli.CommandLine;
import picocli.CommandLine.Command;


public class CLI {

    public static void main(String[] args){

        int numSelection;

        Scanner select = new Scanner(System.in);

        System.out.println("What are you looking for?");
        System.out.println("Enter a number 1,2, or 3");
        System.out.println("1. Members");
        System.out.println("2. Tournaments");
        System.out.println("3. Help");

        numSelection = select.nextInt();

        switch(numSelection){
            case 1:
                System.out.println("Members!");
                break;
            case 2:
                System.out.println("Tournaments!");
                break;
            case 3:
                System.out.println("Help!");
                break;
        }
    }
}
