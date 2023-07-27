/*
 * Course: CS-101
 * Semester: Spring 2022
 * Assignment: Lab05 - Q2
 * Author: Sumeyye Acar
 * Id: 22103640
*/

import java.util.Scanner;
public class Lab5_Q2_acar {
    
    public static void main(String[] args) {

        // On Planet X, the weights of the mountains are calculated according to their width, where the widths may only be odd values.
        // Write a program that inputs the mountain width from the user, displays the mountain and the calculated weight of the mountain.
        
        Scanner in = new Scanner( System.in ); 
        int width;
        int weigth = 0;
        int num2 = 0;

        do {
            System.out.print( "Enter the width ofthe mountain: ");
            width = in.nextInt();
            int width2 = width;
            
            if(width % 2 != 0) {
                for(int row = 1; row <= (width + 1) / 2; row++) {
                    for(int i = 0 ;i < width2 - 1 ;i++) {
                        System.out.print("    ");
                    }
                    width2 -= 2;
                    for(int num = (width + 2) - (2 * row); num <= width + 1 - row; num++) {
                        System.out.print(num + "\t");
                        weigth += num;
                        num2 = num;
                    }
                    for(int num3 = num2 - 1; num3 > num2 - row; num3--) {
                        System.out.print(num3 + "\t");
                        weigth += num3;
                    }
                    System.out.println();
                }                
            }
        }while(width % 2 == 0);
        System.out.printf("The weigth of a mountain %d long is: %d", width, weigth);
        in.close();
    }
}
