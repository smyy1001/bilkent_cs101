/*
 * Course: CS-101
 * Semester: Spring 2022
 * Assignment: Lab03 - Q2
 * Author: Sumeyye Acar
 * Id: 22103640
*/

import java.util.Scanner;
public class Lab3_Q2_acar {
    public static void main(String[] args) {

        double venus = 0.78; 
        double mars = 0.39;
        double jupiter = 2.65; 
        double saturn = 1.17; 
        double uranus = 1.05; 
        double neptune = 1.23; 
        
        Scanner in = new Scanner( System.in );
        System.out.println( "Enter your weight: " );
        double weight = in.nextDouble();
        
        if(weight >= 0) { //because weight can't be negative 

            System.out.println( "Choose the planet: \n     1-Venus\n     2-Mars\n     3-Jupiter");
            System.out.println("     4-Saturn\n     5-Uranus\n     6-Neptune " );

            
            int choice = in.nextInt();
            System.out.printf( "Choice: %d \n", choice);
            
            if(choice == 1) {
                double planetWeight = weight * venus;
                System.out.printf( "Your weight on planet %d is %.1f ", choice, planetWeight);
            }
    
            else if(choice == 2) {
                double planetWeight = weight * mars;
                System.out.printf( "Your weight on planet %d is %.1f ", choice, planetWeight);
            }
    
            else if(choice == 3) {
                double planetWeight = weight * jupiter;
                System.out.printf( "Your weight on planet %d is %.1f ", choice, planetWeight);
            }
    
            else if(choice == 4) {
                double planetWeight = weight * saturn;
                System.out.printf( "Your weight on planet %d is %.1f ", choice, planetWeight);
            }
    
            else if(choice == 5) {
                double planetWeight = weight * uranus;
                System.out.printf( "Your weight on planet %d is %.1f ", choice, planetWeight);
            }
    
            else if(choice == 6) {
                double planetWeight = weight * neptune;
                System.out.printf( "Your weight on planet %d is %.1sf ", choice, planetWeight);
            }
    
            else {
                System.out.println( "Invalid choice - quitting..." );
            }

        }

        else { //in case the user enters an invalid answer 
            System.out.println( "Invalid weight, quitting..." );
        }
        in.close();
    }
}
