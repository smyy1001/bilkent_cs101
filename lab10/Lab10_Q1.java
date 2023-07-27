/*
 * Course: CS-101
 * Semester: Spring 2022
 * Assignment: Lab10
 * Author: Sumeyye Acar
 * Id: 22103640
*/

import java.util.Arrays;
public class Lab10_Q1 {
    
    /**
     * this method takes an array of int as a parameter and returns an array 
     * that contains the same numbers as the given array but rearranged so 
     * that every 4 is immediately followed by a 5. The array contains the same number of 4
     * and 5, and every 4 has a number after it that is not a 4.
     * @param arr
     * @return the sorted version of the given list
     */
    static int[] makeAdjacent( int[] arr ) {
        int[] finalArr = new int[arr.length];
        int a = 0;
        for( int i = 0; i < arr.length; i++ ) {
            if( arr[i] != 4 && arr[i] != 5 ) {
                finalArr[a] = arr[i];
                a++;
            }
            else if( arr[i] == 4 ) {
                finalArr[a] = arr[i];
                a++;
                finalArr[a] = 5;
                a++;
            }
        }
        return finalArr;
    }

    /**
     * this method is supposed to show what the "makeAdjacent" method does
     * @param arrx2
     */
    static void testAdjacent( int[][] arrx2 ) {
        for( int i = 0; i < arrx2.length; i++ ) {
            System.out.print( "Original List:  " + Arrays.toString(arrx2[i]) + 
                                "  Result:  " + (Arrays.toString(makeAdjacent(arrx2[i]))) + "\n" );
        }
    }
    
    public static void main(String[] args) {
        int[][] twoDArray = { {5, 4, 9, 4, 9, 5}, {4, 2, 4, 5, 5}, {5, 4, 5, 4, 1}, {5, 4, 1}, {1, 1, 1}, {4, 5} };
        testAdjacent( twoDArray );
    }
}
