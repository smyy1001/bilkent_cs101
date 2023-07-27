/*
 * Course: CS-101
 * Semester: Spring 2022
 * Assignment: Lab06
 * Author: Sumeyye Acar
 * Id: 22103640
*/

import java.util.Scanner;
//pay attention to the remove letter part 
public class Lab6_acar {

    /**
     * mthod responsible for making sure the input is made of ALphabetic Characters
     * @param word
     * @return isAlphaWord(word)
     */
    public static boolean isAlphaWord(String word) {
        int a = 0;
        word = word.trim();
        while( a < word.length() && true) {
            if( Character.isLetter(word.charAt(a)) == true ) {
                a++;
                return true;
            }
            else {
                return false;
            }
        } 
        return isAlphaWord(word);
    }
    
    /**
     * method responsible for building groups of letters and giving them some numbers
     * @param a
     * @return result 
     */
    public static int getCode(char a) {
        int result = 0;

        if( a == 'B' || a == 'P' || a == 'V' || a == 'F') {
            result = 1;
        }
        else if(a == 'C' ||a == 'G' || a == 'J' || a == 'K' || a == 'Q' || a == 'S' || a == 'X' || a == 'Z'){
            result = 2;
        }
        else if(a == 'D' || a == 'T') {
            result = 3;
        }
        else if(a == 'L') {
            result = 4;
        }
        else if(a == 'M' || a == 'N') {
            result = 5;
        }
        else if(a == 'R') {
            result = 6;
        }
        else if(a == 'U' || a == 'E' || a == 'H' || a == 'W' || a == 'Y' || a == 'I' || a == 'O' || a == 'A') {
            result = -1;
        }
        return result;
    }

    /** 
     * method responsible for replaceing some letters (all but 'ariouhwy') with their number of group 
     * @param str
     * @return finall
     */
    public static String buildCode(String str) {
        String strr = str.substring(1, str.length()).toUpperCase();
        String finall = "";
        int i = 0;
        while( i < strr.length() ) {
            if( Lab6_acar.getCode(strr.charAt(i)) <= 6 && Lab6_acar.getCode(strr.charAt(i)) > 0 )  {
                finall = finall + Lab6_acar.getCode(strr.charAt(i)) ;
            }
            else if( Lab6_acar.getCode(strr.charAt(i)) == -1) {
                finall = finall + strr.charAt(i);
            }
            i ++;
        }
        return finall;
    }

    /**
    *method responsible for removing adjancent dublicates (numbers)
    *@param a
    *@return a
    */
    public static String removeAdjacentDuplicates(String a) {
        int x = 0;
        int y = 1;
        a = Lab6_acar.buildCode(a);
        while( y < a.length() ) {
            if(Character.compare(a.charAt(x), a.charAt(y)) == 0 ) {
                a = a.substring(0, x) + a.substring(y, a.length());
            }
            x ++;
            y ++;
        }
        return a;
    }

    /**
    * method responsible for removing letter
    * @param first
    * @return first without aeiouwhy
    */
    public static String removeLetters(String first, String second) {
        second = "AEIOUHWY";
        first = Lab6_acar.removeAdjacentDuplicates(first);
        for(int i = 0; i < first.length(); i++) {
            for(int a = 0; a < second.length(); a++) {
                if(Character.compare(first.charAt(i), second.charAt(a)) == 0) {
                    first = first.substring(0, i) + first.substring(i + 1, first.length());
                }
            }
        }
        return first; 
    }

    /**
    * method responsible for making the soundex code exatly 4 places. 
    * @param finalCode
    * @return finalCode
    */
    public static String padCode(String finalCode) {
        finalCode = Lab6_acar.removeLetters(finalCode, "");
        while(finalCode.length() < 3) {
            finalCode = finalCode + "0";
        }
        if(finalCode.length() > 3) {
            finalCode = finalCode.substring(0, 3);
        }
        return finalCode;
    }

    /**
     * method responsible for turning the input to a 4 placeses Soundex Code number 
     * @param Final
     * @return Final
     */
    public static String getSoundex(String Final) {
        if(!Final.equalsIgnoreCase("exit")) {
            if( Lab6_acar.isAlphaWord(Final)) {
                Final = (Final.substring(0, 1) + Lab6_acar.padCode(Final)).toUpperCase();
            } 
            else {
                Final = " Characters must be alphabetic... ";
            }
        }
        else if(Final.equalsIgnoreCase("exit")) {
            Final = (Final.substring(0, 1) + Lab6_acar.padCode(Final)).toUpperCase() + "\n" + "Good Bye!" ;
        }
        return Final;
    }


    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);
        System.out.println( "Enter a String(enter exit to stop): " );
        String word = in.next();
        while(!word.equalsIgnoreCase("exit")) {
            System.out.printf("Soundex: %s%n", Lab6_acar.getSoundex(word));
            System.out.println( "Enter a String(enter exit to stop): " );
            word = in.next();
        }   
        if(word.equalsIgnoreCase("exit")) {
            System.out.printf("Soundex: %s%n", Lab6_acar.getSoundex(word));
        }    
        in.close();    
    }
}
