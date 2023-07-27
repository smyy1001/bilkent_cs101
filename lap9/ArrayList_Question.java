/*
 * Course: CS-101
 * Semester: Spring 2022
 * Assignment: Lab09
 * Author: Sumeyye Acar
 * Id: 22103640
*/

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Question {
    public static void removeDublicates(ArrayList<Integer> arr1) {
        for( int i = 0; i < arr1.size(); i++ ) {
            for( int j = 0; j < arr1.size(); j++ ) {
                if( arr1.get(i) == arr1.get(j) && i != j ) {
                    arr1.remove(j);
                    j--;
                }
            }
        }
    }

    public static ArrayList<Integer> fillList() {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer values (-1 to exit): ");
        int val = input.nextInt();
        while( val != -1 ) {
            newList.add(val);
            System.out.println("Enter integer values (-1 to exit): ");
            val = input.nextInt(); 
        }
        input.close(); 
        return newList;
    }

    public static void sumDivisible(ArrayList<Integer> ar1, ArrayList<Integer> ar2, int x) {
        int sum = 0;
        for(int i =  0; i < ar1.size(); i++) {
            if(ar1.get(i) % x == 0) {
                sum += ar1.get(i);
            }
            ar2.add(sum);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> sumList = new ArrayList<Integer>();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter a divisor: ");
        int divisor = input2.nextInt();

        ArrayList<Integer> list1 = fillList();
        System.out.println("List: " + list1);

        sumDivisible(list1, sumList, divisor);
        System.out.println("Sum List: " + sumList);

        removeDublicates(sumList);
        System.out.println("Sum List (No Dublicates): " + sumList);

        input2.close();        
    }
}
