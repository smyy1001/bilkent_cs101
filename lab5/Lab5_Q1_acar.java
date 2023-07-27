/*
 * Course: CS-101
 * Semester: Spring 2022
 * Assignment: Lab05 - Q1
 * Author: Sumeyye Acar
 * Id: 22103640
*/

import java.util.Scanner;

public class Lab5_Q1_acar { 

    // displays a menu and based on the choice from the user, executes the following tasks.
    // The program should terminate when the user selects quit. Your program should validate inputs where appropriate.  
    
    // Choice 1: input a 4-digit number and display whether it is a special number. Special numbers are 4 digit 
    // numbers (abcd)  where 4 * abcd == dcba. 
    
    // Choice 2: input a word from the user and display whether it is a vowel word.  An English vowel word is a 
    // word that contains all 5 vowels (aeiou).

    public static void main(String[] args) {
        int choice;
        int specialNumberCheck2;
        int specialNumber = 0;
        int breakingP = 0;

        do {
            System.out.println( "Menu:\n   1-Special Number\n   2-Vowel Word\n   3-Quit" ); 
            Scanner in = new Scanner( System.in );
            System.out.print( "Enter choice:" );
            choice = in.nextInt(); 
            if(choice == 1){
                do {
                    System.out.print("Enter number: ");
                    int specialNumberCheck = in.nextInt();
                    specialNumberCheck2 = specialNumberCheck;
                    if(10000 > specialNumberCheck && specialNumberCheck >= 1000) {
                        do{
                            if(specialNumberCheck2 > 0){
                                do{
                                    int remainder = specialNumberCheck2 % 10;
                                    specialNumberCheck2 = specialNumberCheck2 / 10;
                                    specialNumber = (specialNumber * 10) + remainder;
                                } while(specialNumberCheck2 > 0);
                                if(specialNumber == 4*specialNumberCheck){
                                    System.out.printf( "%d is a very special number", specialNumberCheck);
                                }
                                if(specialNumber != 4*specialNumberCheck){
                                    System.out.printf( "%d is not a very special number", specialNumberCheck);
                                }
                            }
                        } while(10000 > specialNumberCheck && specialNumberCheck >= 1000);
                    }
                } while(choice == 1);
            }


            if(choice == 2){
                if(breakingP == 0){
                    System.out.print("Enter a word: ");
                    String word = in.next();
                    in.close();
                    boolean vowelCheck1 = false;
                    boolean vowelCheck2 = false;
                    boolean vowelCheck3 = false;
                    boolean vowelCheck4 = false;
                    boolean vowelCheck5 = false;
                    if(word.length()<5) {
                        System.out.printf( "%s is not a vowel word!", word );
                    }
                    else {
                        for(int k = 0; k < word.length() && vowelCheck5 == false; k++ ) {
                            if(word.substring(k, k + 1).equalsIgnoreCase("a")) {
                                vowelCheck1 = true;
                                if(vowelCheck1) {
                                    for(k = 0; k < word.length(); k++ ) {
                                        if (word.substring(k, k + 1).equalsIgnoreCase("e")){
                                            vowelCheck2 = true;
                                            if(vowelCheck2) {
                                                for(k = 0; k < word.length(); k++ ) {
                                                    if (word.substring(k, k + 1).equalsIgnoreCase("i")){
                                                        vowelCheck3 = true;
                                                        if(vowelCheck3) {
                                                            for(k = 0; k < word.length(); k++ ) {
                                                                if (word.substring(k, k + 1).equalsIgnoreCase("o")){
                                                                    vowelCheck4 = true;
                                                                    if(vowelCheck4) {
                                                                        for(k = 0; k < word.length(); k++ ) {
                                                                            if (word.substring(k, k + 1).equalsIgnoreCase("u")){
                                                                                vowelCheck5 = true;
                                                                                if(vowelCheck5) {
                                                                                    System.out.printf( "%s is a vowel word!%n", word);
                                                                                }
                                                                            }
                                                                        }                                                                       
                                                                    }
                                                                }
                                                            }                                    
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if(vowelCheck1 == false ||vowelCheck2 == false ||vowelCheck3 == false ||vowelCheck4 == false ||vowelCheck5 == false) {
                        System.out.printf( "%s is not a vowel word!%n", word );
                        break;
                    }
                    breakingP ++;
                }
            }
            if(choice < 1 || choice >3) {
                System.out.println("The choice must be between 1 and 3!");
            }
        }while(choice != 3 && breakingP == 5);
       System.out.println( "Good Bye!" );
    }
}
