/*
 * Course: CS-101
 * Semester: Spring 2022
 * Assignment: Lab04 - Q1
 * Author: Sumeyye Acar
 * Id: 22103640
*/

import java.util.Scanner;

public class Lab4_Q1_acar {

    
    // inputs words from the user, until the user enters ‘exit’. 
    // When the user enters ‘exit’ the program should display the word that comes second alphabetically.
    // Your program should not be case sensitive.

    public static void main(String[] args) {
 
    String String1 = "";
    String String2 = "";
    String String3 = "";
    String Temp;
    String Exit = "exit";
    boolean exitStatus = false;
    boolean printStatus = true;

    Scanner in = new Scanner(System.in);
    System.out.println("Please enter strings (type exit to stop)");
    while( String1.equalsIgnoreCase("start") == false ) {
        String1 = in.nextLine();
    }

    String1 = in.nextLine();
    
    if ( String1.equalsIgnoreCase(Exit) == true ) {
        exitStatus = true;
        printStatus = false;
        System.out.println("Not enough input data...");
        
    }

    if ( exitStatus == false ) { 
        
        String2 = in.nextLine();
        if ( String2.equalsIgnoreCase(Exit) == true ) {
            exitStatus = true;
            printStatus = false;
            System.out.println("Not enough input data...");
        }
        else if ( String2.compareToIgnoreCase(String1) < 0 ) {
            Temp = String1;
            String1 = String2;
            String2 = Temp;
        }
    }

    while ( exitStatus == false ) {
        String3 = in.nextLine();
        if ( String3.equalsIgnoreCase(Exit) ) {
            break;
        }

        if ( String3.compareToIgnoreCase(String2) < 0 ) {
            String2 = String3;
        }
        if ( String2.compareToIgnoreCase(String1) < 0 ) {
            Temp = String1;
            String1 = String2;
            String2 = Temp;
        }
    }
    if (printStatus == true) {
        System.out.println("The second string in alphabetical order is: " + String2);
    }
    in.close();
    }
}
