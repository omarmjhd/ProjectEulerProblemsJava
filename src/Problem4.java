/**
 *
 * Problem 4: A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit
 * numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 * @author Omar Mujahid
 */

public class Problem4 { //Doesnt work yet

    /**
     *
     * Private helper method that takes in 2 ints, and returns a boolean
     * determining if those ints multiply to create a palindrome
     *
     * @param num1
     * @param num2
     * @return
     */
    private static boolean palindrome(int num1, int num2) { //this works (I think, need to check odds)

        int mult = num1 * num2;
        char[] chars = Integer.toString(mult).toCharArray(); //character array of the integer
        int length = chars.length; //how do I handle odds?

        for (int i = 0; i <= length / 2; i++) {

            if (chars[i] != chars[length - 1 - i]) {

                return false;

            }

        }

        return true;

    }

    public static int largestPalindrome(int num1, int num2) {
    //this is wrong because the largest can come from an uneven decrement

        int first = num1;
        int second = num2;
        boolean palindrome = palindrome(first, second);
        int lastDecremented = 1;

        while (!palindrome) {

            if (lastDecremented == 1) {

                second -= 1;
                palindrome = palindrome(first, second);
                lastDecremented = 2;

            } else {

                first -= 1;
                palindrome = palindrome(first, second);
                lastDecremented = 1;

            }
        }

        return first * second;
    }


    public static void main(String[] args) {

        Problem4 p4 = new Problem4();

        System.out.println("The solution is: " + p4.largestPalindrome(999, 999));


    }
}
