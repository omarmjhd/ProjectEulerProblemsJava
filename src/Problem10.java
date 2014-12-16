/**
 *
 * Problem 10: The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 *
 * @author Omar Mujahid
 */
public class Problem10 {

    /**
     *
     * Private helper method to check if an integer is prime
     *
     * @param num
     * @return
     */
    private static boolean prime(int num) {

        if ((num % 2 == 0) || (num % 3 == 0) || (num % 5 == 0) || (num % 7 == 0)) {

            return false;

        }

        return true;

    }

    public static int sumPrime(int limit) {

        int currentInt = 2;
        int currentSum = 2;

        while (currentInt < limit) {

            if (prime(currentInt)) {

                currentSum += currentInt;

            }

            currentInt++;

        }

        return currentSum;

    }

    public static void main(String[] args) {

        Problem10 p10 = new Problem10();

        int largest = p10.sumPrime(10);
        //2, 3, 5, 7, 11, 13, 17, 19, 23, 29

        System.out.println("The solution is: " + largest);

    }
}
