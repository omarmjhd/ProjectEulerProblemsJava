/**
 *
 * Problem 4: A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit
 * numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 * @author Omar Mujahid
 * @answer 906609
 */

import java.lang.Integer;
import java.lang.System;
import java.util.ArrayList;
import java.util.Collections;

public class Problem4 {

    /**
     *
     * Private helper method that takes in 2 ints, and returns a boolean
     * determining if those ints multiply to create a palindrome
     *
     * @param num1
     * @param num2
     * @return true or false depending if the numbers create a palindrome when multiplied
     */
    private static boolean palindrome(int num1, int num2) {

        int mult = num1 * num2;
        char[] chars = Integer.toString(mult).toCharArray(); //character array of the integer
        int length = chars.length;

        for (int i = 0; i <= length / 2; i++) {

            if (chars[i] != chars[length - 1 - i]) {

                return false;

            }

        }

        return true;

    }

    /**
     *
     * Method to calculate the largest palindrome possible from a product of 2 integers who's max boundary is set by
     * the parameters
     *
     * @param bound, the upper bound to use for the products
     * @return the largest possible palindrome of products that are less than the bound
     */
    public int largestPalindrome(int bound) {

        ArrayList<Integer> palindromes = new ArrayList<Integer>(); // ArrayList so it can be sorted

        for (int i = 0; i < bound; i++) { // go from 0 to the bound

            for (int j = 0; j < bound; j++) { // go from 0 to the bound

                if (palindrome(i, j) == true) { // if palindrome, add to the list

                    palindromes.add(i * j);

                }

            }

        }

        Collections.sort(palindromes); // sort list

        int largestIndex = palindromes.size() - 1; // gets end of ArrayList (index of largest palindrome in this case)

        return palindromes.get(largestIndex); //return the largest palindrome

    }


    public static void main(String[] args) {

        Problem4 p4 = new Problem4();

        System.out.println("The solution is: " + p4.largestPalindrome(1000));


    }
}
