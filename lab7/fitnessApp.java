/*
 * Course: CS-101
 * Semester: Spring 2022
 * Assignment: Lab07
 * Author: Sumeyye Acar
 * Id: 22103640
*/

import java.util.Scanner;
public class fitnessApp {
    public static void main(String[] args) {

        Scanner in = new Scanner( System.in );
        System.out.print( "Enter birthdate (YYYY-MM-DD): " );
        String birthdate = in.nextLine();
        birthdate = birthdate.trim();
        System.out.print( "Enter gender (f)emale/(m)ale: " );
        String gender = in.next();
        System.out.print( "Enter height (meter): " );
        double height = in.nextDouble();
        System.out.print( "Enter weight (kilograms): " );
        double weight = in.nextDouble();
        System.out.print( "Enter waist measurment: " );
        double waist = in.nextDouble();
        System.out.print( "Enter hip measurment: " );
        double hip = in.nextDouble();
        System.out.print( "Enter resting heart rate: " );
        int restingHeartRate = in.nextInt();

        FitnessAssessment fitnessAssessment = new FitnessAssessment();
        
        System.out.println("--------------MENU-------------- \n1 - Calculate Target Heart Rate\n2 - Calculate Waist/Hip Ratio");
        System.out.println("3 - Body Mass Index\n4 - Display Fitness Level\n5 - Quit");
        int choice = in.nextInt();

        while(choice < 6 && choice > 0) {
            if(choice == 1) {
                System.out.println( "Target heart rate: " + fitnessAssessment.calculateTargetHeartRate(
                                fitnessAssessment.calculateMaxHeartRate(fitnessAssessment.calculateAge(birthdate))) );
            }
            else if(choice == 2) {
                System.out.printf( "Waist/Hip ratio: %.1f %n", fitnessAssessment.calculateWaistHipRatio(waist, hip));
            }
            else if(choice == 3) {
                System.out.printf( "Your BMI is: %.1f Category: %s %n", fitnessAssessment.calculateBMI(weight, height),
                                    fitnessAssessment.findBMICategory(fitnessAssessment.calculateBMI(weight, height)));
            }
            else if(choice == 4) {
                System.out.println( "Your fitness level is " + fitnessAssessment.determineFitnessLevel(height, weight, waist, hip,
                                                                                                        restingHeartRate, gender));
            }
            else if(choice == 5) {
                System.out.println( "Have a nice day, goodbye!" );
                choice ++;
            }
            if(choice < 6 && choice > 0) {
                System.out.println("--------------MENU-------------- \n1 - Calculate Target Heart Rate\n2 - Calculate Waist/Hip Ratio");
                System.out.println("3 - Body Mass Index\n4 - Display Fitness Level\n5 - Quit");
                choice = in.nextInt();                
            }
        }
        in.close();
    }
}
    





