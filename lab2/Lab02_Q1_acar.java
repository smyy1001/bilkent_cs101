/*
 * Course: CS-101
 * Semester: Spring 2022
 * Assignment: Lab02 - Q1
 * Author: Sumeyye Acar
 * Id: 22103640
*/

import java.util.Scanner;

public class Lab02_Q1_acar {
    public static void main(String[] args) {

        double venüs;
        double mars;
        double mercury;
        double satürn;
        double firstWeight;
        double secondWeight;
        Scanner scan;

        venüs = 8.8;
        mars = 3.7;
        mercury = 3.7;
        satürn = 10.4;

        scan = new Scanner( System.in );
        System.out.print( "Enter weight of first earthling(kg): " );
        firstWeight = scan.nextInt();
        System.out.print( "Enter weight of second earthling(kg): " );
        secondWeight = scan.nextInt();
        scan.close();

        System.out.println("                            VENUS      MARS      MERCURY      SATURN");
        System.out.printf( "EARTHLING ONE(  %.1f ):     %.2f     %.2f     %.2f     %.2f  %n", firstWeight, firstWeight*venüs, firstWeight*mars, firstWeight*mercury, firstWeight*satürn);
        System.out.printf( "EARTHLING TWO( %.1f ):     %.2f     %.2f     %.2f     %.2f  %n", secondWeight, secondWeight*venüs, secondWeight*mars, secondWeight*mercury, secondWeight*satürn);

    }
 
}
