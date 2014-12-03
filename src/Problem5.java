/**
 *
 * Problem 5: 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 *
 * @author Omar Mujahid
 * @answer 232792560
 */
public class Problem5 {

    public static int smallest() {

        int small = 1;
        boolean found = false;

        while (!found) {

            if ((small % 11 == 0) && (small % 12 == 0) && (small % 13 == 0) && (small % 14 == 0) && (small % 15 == 0) &&
                    (small % 16 == 0) && (small % 17 == 0) && (small % 18 == 0) && (small % 19 == 0) && (small % 20 == 0)) {

                return small;

            } else {

                small++;

            }
        }

        return small;
    }

    public static void main(String[] args) {

        Problem5 p5 = new Problem5();

        int smallest = p5.smallest();

        System.out.println("The solution is: " + smallest);

    }
}
