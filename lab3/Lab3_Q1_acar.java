/*
 * Course: CS-101
 * Semester: Spring 2022
 * Assignment: Lab03 - Q1
 * Author: Sumeyye Acar
 * Id: 22103640
*/

import java.util.Scanner;

public class Lab3_Q1_acar {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        System.out.println( "Enter names of the passengers: ");
        String lastNames = in.nextLine(); 
        lastNames = lastNames.trim(); //in case the input contains spaces 
                                    // cause I used the first letter with assuming it is the initial of the first surname
        

        String firstSureName = lastNames.substring(0,1);
        String secondSureName = lastNames.substring(lastNames.indexOf("-") + 1 , lastNames.indexOf("-") +2);

        if(firstSureName.equalsIgnoreCase( "a" ) || firstSureName.equalsIgnoreCase( "b" ) || 
                        firstSureName.equalsIgnoreCase( "c" ) || firstSureName.equalsIgnoreCase( "d") ||
                        firstSureName.equalsIgnoreCase( "e" ) || firstSureName.equalsIgnoreCase( "f" ) ||
                        secondSureName.equalsIgnoreCase( "a" ) || secondSureName.equalsIgnoreCase( "b" ) ||
                        secondSureName.equalsIgnoreCase( "c" ) || secondSureName.equalsIgnoreCase( "d") ||
                        secondSureName.equalsIgnoreCase( "e" ) || secondSureName.equalsIgnoreCase( "f" )) {
            System.out.println( "BOARDING GROUP 1" );
        }

        else if(firstSureName.equalsIgnoreCase( "g" ) || firstSureName.equalsIgnoreCase( "h" ) ||
                        firstSureName.equalsIgnoreCase( "i" ) || firstSureName.equalsIgnoreCase( "j") ||
                        firstSureName.equalsIgnoreCase( "k" ) || firstSureName.equalsIgnoreCase( "l" ) ||
                        firstSureName.equalsIgnoreCase( "m" ) || firstSureName.equalsIgnoreCase( "n" ) ||
                        secondSureName.equalsIgnoreCase( "g" ) || secondSureName.equalsIgnoreCase( "h" ) ||
                        secondSureName.equalsIgnoreCase( "i" ) || secondSureName.equalsIgnoreCase( "j") ||
                        secondSureName.equalsIgnoreCase( "k" ) || secondSureName.equalsIgnoreCase( "l" ) ||
                        secondSureName.equalsIgnoreCase( "m" ) || secondSureName.equalsIgnoreCase( "n" )) {
            System.out.println( "BOARDING GROUP 2" );
        }

        else if(firstSureName.equalsIgnoreCase( "o" ) || firstSureName.equalsIgnoreCase( "p" ) ||
                        firstSureName.equalsIgnoreCase( "q" ) || firstSureName.equalsIgnoreCase( "r") || 
                        firstSureName.equalsIgnoreCase( "s" ) || firstSureName.equalsIgnoreCase( "t" ) ||
                        secondSureName.equalsIgnoreCase( "o" ) || secondSureName.equalsIgnoreCase( "p" ) ||
                        secondSureName.equalsIgnoreCase( "q" ) || secondSureName.equalsIgnoreCase( "r") ||
                        secondSureName.equalsIgnoreCase( "s" ) || secondSureName.equalsIgnoreCase( "t" )) {
            System.out.println( "BOARDING GROUP 3" );
        }

        else if(firstSureName.equalsIgnoreCase( "u" ) || firstSureName.equalsIgnoreCase( "v" ) ||
                        firstSureName.equalsIgnoreCase( "w" ) || firstSureName.equalsIgnoreCase( "x") ||
                        firstSureName.equalsIgnoreCase( "y" ) || firstSureName.equalsIgnoreCase( "z" ) ||
                        secondSureName.equalsIgnoreCase( "u" ) || secondSureName.equalsIgnoreCase( "v" ) ||
                        secondSureName.equalsIgnoreCase( "w" ) || secondSureName.equalsIgnoreCase( "x") ||
                        secondSureName.equalsIgnoreCase( "y" ) || secondSureName.equalsIgnoreCase( "z" )) {
            System.out.println( "BOARDING GROUP 4" );
        }

        else { //in case the user enters an invalid answer 
            System.out.println( "Invalid answer. Please enter the surnames again");
        }
        
        in.close();
    }

}
