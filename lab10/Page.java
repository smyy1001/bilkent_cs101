/*
 * Course: CS-101
 * Semester: Spring 2022
 * Assignment: Lab10
 * Author: Sumeyye Acar
 * Id: 22103640
*/

import java.util.*;
public class Page {
    
    private char[] Array1;

    //Constructor
    public Page( int length ) {
        Array1 = new char[length];
        for( int i = 0; i < length; i++ ) {
            Array1[i] = '-';
        }
    }

    /**
     * this method writes the entered note to the page
     * @param str (entered note)
     */
    public void writePage( String str ) {   
        if( str.length() <= Array1.length ) {
            for( int j = 0; j < str.length(); j++ ) {
                Array1[j] = str.charAt(j);
            }
        }
        if( str.length() > Array1.length ) {
            for( int j = 0; j < Array1.length; j++ ) {
                Array1[j] = str.charAt(j);
            }
        }
    }

    //converts the Array(page) to a printable string 
    public String toString() {
        String output = "" + Arrays.toString(Array1);
        output = output.replaceAll(",", "");
        output = output.replace("[", "");
        output = output.replace("]", "");
        return output;
    }

}
