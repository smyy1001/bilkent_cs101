/*
 * Course: CS-101
 * Semester: Spring 2022
 * Assignment: Lab10
 * Author: Sumeyye Acar
 * Id: 22103640
*/

import java.util.*;
public class Diary {
    public static void main(String[] args) {
        
        //Control;
        int control = 0;

        //Attributes of a notebook
        Scanner in = new Scanner( System.in );
        System.out.print( "Enter number of pages: " );
        int pageNum = in.nextInt();
        System.out.print( "Enter page size: " );
        int size = in.nextInt();
        System.out.println();

        //The Notebook
        Notebook note = new Notebook(pageNum, size);

        //Menu
        String menu = "What do you want to do?\n(1) Take a note\n(2) Browse notebook\n(3) Exit";
        System.out.print(menu + "\nYour choice: ");
        int choice = in.nextInt();

        //What to do according to the choice
        while( choice != 3 ) {
            if( choice == 1 ) {
                System.out.print("Enter note: ");
                String myNotes = in.nextLine();
                myNotes = in.nextLine();
                if( control >= pageNum ) {
                    System.out.println("Notebook full! No pages remaining!");
                }
                else {
                    note.writeNote( myNotes );
                    control++;
                }
                System.out.println();
            }
            else if( choice == 2 ) {
                System.out.println( "Here is your Notebook: " );
                note.printNotebook();
                System.out.println();
            }
            else {
                System.out.println("What do you mean..?");
            }
            System.out.print(menu + "\nYour choice: ");
            choice = in.nextInt();
        }
        
        //The Closing part
        if( choice == 3 ) {
            System.out.println("Goodbye...");
        }

        //Dont leave the Scanner open!!!
        in.close();
    }
}
