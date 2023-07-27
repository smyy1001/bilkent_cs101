/*
 * Course: CS-101
 * Semester: Spring 2022
 * Assignment: Lab04 - Q2
 * Author: Sumeyye Acar
 * Id: 22103640
*/

import java.util.Scanner;

public class Lab4_Q2_acar {

    // inputs a string from the user and displays the length of the longest 
    // block of letters with the same case.
    // I.e., the longest block of uppercase letters or lowercase letters. 

    public static void main(String[] args) {

    int wordLength = 0;
    int longestLength = 0; 
    int index = 0;
    String Word = " ";

    Scanner input = new Scanner(System.in);    
    System.out.print("Input string: ");
    String Sentence = input.nextLine();
    Sentence = Sentence.trim();
    if(Sentence.equals("")) {
        System.out.println("Not enough input!");
    }
    else if(!Character.isLetter(Sentence.charAt(0))) {
        System.out.println("Please enter only Strings!");
    }

    else { 
        while ( Sentence.equals(" ") == false) {
            Word = Sentence.substring( index, Sentence.indexOf(" ") );
            if ( Word.toUpperCase().equals(Word) || Word.toLowerCase().equals(Word) ) {
                wordLength = Word.length();  
                if( wordLength > longestLength ) {
                    longestLength = wordLength;
                }
            }
            Sentence = Sentence.replaceFirst(Word, "");
            Sentence = Sentence.trim();
            Sentence = Sentence + " ";
        }
        System.out.printf("The longest block is %d \n", longestLength);
        }
        input.close();
    }
    
}