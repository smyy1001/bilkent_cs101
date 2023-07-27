/*
 * Course: CS-101
 * Semester: Spring 2022
 * Assignment: Lab04 - Q3
 * Author: Sumeyye Acar
 * Id: 22103640
*/

import java.util.Scanner;

public class Lab4_Q3_acar {

    // inputs a long binary number and displays its decimal and hexadecimal values.

    public static void main(String[] args) {

        String binary;
        String hex = "";
        char decimal;
        int sum = 0;
        int digit = 0;
        char Hdigit = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an binary number (type exit to quit): ");
        binary = input.nextLine();

        for(int i = 0; i < binary.length(); i++) {
            decimal = binary.charAt(binary.length() - (i+1));
            digit  = (int) decimal - 48;
            sum = sum + (int)( digit*Math.pow(2, i) );

        }

        System.out.printf("In decimal: %d\n", sum);

        for ( int n = 1; sum != 0; n++ ) {
            digit = sum % (int)( Math.pow(16, n) );
            sum = sum - digit;
            digit = digit / (int) Math.pow(16, n-1);
            // to hexadecimal and write to the LEFT of string --> hex 
            if (digit % 10 != digit) {
                //to ABCDEF (ASCII)
                digit += 55;
                Hdigit = (char) digit;
            }

            else {
                //to digit (ASCII)
                digit += 48;
                Hdigit = (char) digit;
            }

            hex = Hdigit + hex;
            // a.16^0 + b.16^1 + c.16^2 ... + x.16^n + 0.16^n+1
        }

        System.out.printf("In hexadecimal: #%s\n", hex);
        input.close();

    }
}
