/*
 * Course: CS-101
 * Semester: Spring 2022
 * Assignment: Lab01 - Q3
 * Author: Sumeyye Acar
 * Id: 22103640
*/

public class Lab01_Q3_acar {

    public static void main(String[] args) {
        
        double y;
        int x;

        x = -5;
        y = (Math.pow(x, 3) + 3*Math.abs(x) + 9) / Math.pow(x, 2);
        y = (int) y;

        System.out.println(y);
    }
    
}
