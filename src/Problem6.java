/**
 *
 * Problem 6: The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 *
 * @author Omar Mujahid
 * @answer 25164150
 */
public class Problem6 {

    public static int sumSquareDiff(int num) {

        int sumOfNums = 0;
        int sumOfSquares = 0;
        int squareOfSum = 0;

        for (int i = 0; i < num + 1; i++) {

            sumOfNums += i;

            sumOfSquares += (i * i);

        }

        squareOfSum = (sumOfNums * sumOfNums);

        return squareOfSum - sumOfSquares;

    }

    public static void main(String[] args) {

        Problem6 p6 = new Problem6();

        int difference = p6.sumSquareDiff(100);

        System.out.println("The solution is: " + difference);

    }
}
