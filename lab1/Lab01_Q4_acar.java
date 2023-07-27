/*
 * Course: CS-101
 * Semester: Spring 2022
 * Assignment: Lab01 - Q4
 * Author: Sumeyye Acar
 * Id: 22103640
*/

public class Lab01_Q4_acar {
    public static void main(String[] args) {
        
        double a;
        int n;
        double b;

        a = (1 + Math.sqrt(5)) / 2;
        n = 101;
        
        b = (Math.pow(a, n) - Math.pow((Math.pow(-a, -1)),n)) / Math.sqrt(5);
        System.out.println( "Fibonacci(" + n + "): " + (long) b );

    }
    
}
