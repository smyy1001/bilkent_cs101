/*
 * Course: CS-101
 * Semester: Spring 2022
 * Assignment: Lab01 - Q2
 * Author: Sumeyye Acar
 * Id: 22103640
*/

public class Lab01_Q2_acar {
    
    public static void main(String[] args)  {
        
        int totalSeconds;
        int seconds;
        int minutes;
        int hours;

        totalSeconds = 12486;
        minutes = (int) totalSeconds / 60;
        hours = (int) totalSeconds / 3600;
        seconds = totalSeconds % 60;
        minutes = minutes % 60;

        System.out.println(totalSeconds + " seconds represent " + hours + " hours " + minutes + " minutes and " + seconds + " seconds.");
        
    }
    
}
