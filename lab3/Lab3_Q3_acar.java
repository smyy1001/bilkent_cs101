/*
 * Course: CS-101
 * Semester: Spring 2022
 * Assignment: Lab03 - Q3
 * Author: Sumeyye Acar
 * Id: 22103640
*/

import java.util.Scanner;
public class Lab3_Q3_acar {
    public static void main(String[] args) {
        String elephant = "Elephant";
        String pumpkin = "Pumpkin";
        String bus = "Bus";
        String squirrel = "Squirrel";
        String carrot = "Carrot";
        String pencil = "Pencil";
        String mineral = "Mineral";
        String vegetable = "Vegetable";
        String animal = "Animal";
        String yes = "Yes";
        String no = "No";

        Scanner input = new Scanner( System.in );
        System.out.println( "Is the object an Animal/Vegetable/Mineral?");
        String object1 = input.next();

        if( object1.equalsIgnoreCase(mineral) || object1.equalsIgnoreCase(animal) || object1.equalsIgnoreCase(vegetable)) {
            
            System.out.println( "Is the object bigger than a shoe box?");
            String object2 = input.next();
            
            if(object1.equalsIgnoreCase(animal) && object2.equalsIgnoreCase(yes)) {
                System.out.printf( "%s it is, right :) ", elephant);
            }
            
            else if(object1.equalsIgnoreCase(animal) && object2.equalsIgnoreCase(no)) {
                System.out.printf( "%s it is, right :) ", squirrel);
            }

            else if(object1.equalsIgnoreCase(vegetable) && object2.equalsIgnoreCase(yes)) {
                System.out.printf( "%s it is, right :) ", pumpkin);
            }

            else if(object1.equalsIgnoreCase(vegetable) && object2.equalsIgnoreCase(no)) {
                System.out.printf( "%s it is, right :) ", carrot);
            }

            else if(object1.equalsIgnoreCase(mineral) && object2.equalsIgnoreCase(yes)) {
                System.out.printf( "%s it is, right :) ", bus);
            }

            else if(object1.equalsIgnoreCase(mineral) && object2.equalsIgnoreCase(no)) {
                System.out.printf( "%s it is, right :) ", pencil);
            }

            else if(!object2.equalsIgnoreCase(no) || !object2.equalsIgnoreCase(yes)){
                System.out.printf( "I don't understand, \"%s\" is not a valid answer", object2);  
            }

        } 
        
        else { //in case the user enters an invalid answer 
            System.out.printf( "I don't understand, \"%s\" is not a valid answer", object1);
        }
        input.close();

    }
    
}
