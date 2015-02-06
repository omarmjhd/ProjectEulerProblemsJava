/**
 *
 * Problem 7: By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 *
 * @author Omar Mujahid
 */
public class Problem7 { //TODO: check website to see if correct before pushing to GitHub

    /**
     *
     * Private helper method to check if an integer is prime
     *
     * @param num
     * @return
     */
    private static boolean prime(int num) {

        if ((num % 2 == 0) || (num % 3 == 0) || (num % 5 == 0) || (num % 7 == 0) || (num == 0) || (num == 1)) {

            return false;

        }

        return true;

    }

    public static int largestPrime(int limit) {

        //2, 3, 5, 7

        //Look at sieve of eratosthenes

        return 0;



    }

    public static void main(String[] args) {

        Problem7 p7 = new Problem7();

        int largest = p7.largestPrime(10001);
        //2, 3, 5, 7, 11, 13, 17, 19, 23, 29

        System.out.println("The solution is: " + largest);

    }
}
