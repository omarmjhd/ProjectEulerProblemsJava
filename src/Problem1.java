/**
 *
 * Problem 1: If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * @author Omar Mujahid
 *
 */
public class Problem1 { //Correct answer is: 233168


    public static int multiplesOf3and5(int limit) {

        int sum = 0;

        for (int i = 0; i < limit; i++) {

            if (i % 3 == 0 || i % 5 == 0) {

                sum += i;

            }

        }

        return sum;

    }

    public static void main(String[] args) {


        Problem1 p1 = new Problem1();

        int solution = p1.multiplesOf3and5(1000);

        System.out.println("The solution is: " + solution);

    }
}
