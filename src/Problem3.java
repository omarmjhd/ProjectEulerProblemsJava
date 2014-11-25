import java.util.ArrayList;

/**
 *
 * Problem 3: The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 *
 * @author Omar Mujahid
 */
public class Problem3 {
//This works, but the priority queue is inefficient. Maybe an treelist would be better?
// derp, theres no such thing as a treelist
//Also, the primeFactor algorithm gets increasingly larger primes, so dont need to be sorted
//In comes the Arraylist!

    public static long primeFactor(long num) {

        ArrayList<Long> primeFactors = primeFactors(num);

        int largestIndex = primeFactors.size() - 1;

        return primeFactors.remove(largestIndex);

    }

    public static ArrayList<Long> primeFactors(long num) {

        long primeFactor = 2;
        ArrayList<Long> factors = new ArrayList<Long>();

        while (num > 1) {

            while (num % primeFactor == 0) {

                factors.add(primeFactor);
                num /= primeFactor;

            }

            primeFactor += 1;

        }

        return factors;

    }

    public static void main(String[] args) {

        Problem3 p3 = new Problem3();

        long largest = p3.primeFactor(600851475143L);

        System.out.println("The solution is: " + largest);


    }

}
