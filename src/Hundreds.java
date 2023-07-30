/* Name: Austin Allen
 * Course: CSC 135
 * Project: Problem 1.1
 * File Name: Favorite.java
 */

//Takes two integers from 100-9999 and finds the sum of thier hundreds position.

import java.util.Scanner;

public class Hundreds {
    public static void main(String[] args) {
        Integer integerA, integerB, digit1, digit2, sum;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter two integers from 100 - 9999: ");
        integerA = scan.nextInt();
        integerB = scan.nextInt();

        digit1 = (integerA / 100)/ 10;
        /* Whenever I put "(integerB/100)/10" like you did in week 3 part 2
        *  if integerB is less than 1000 instead of printing the hundreds it 
        *  prints 0 */
        digit2 = (integerB / 100);
        sum = digit1 + digit2;
        
        System.out.println("Integer A is " + integerA + ". Integer B is " +
                integerB + ". Digit 1 is " + digit1 + ". Digit 2 is " + digit2 
                + ". Sum is " + sum + ".");
    }
    
}
