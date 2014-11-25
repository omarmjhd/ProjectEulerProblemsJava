import java.util.ArrayList;

/**
 *
 * Problem 3: The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 *
 * @author Omar Mujahid
 */
public class Problem3 {

    public static long largestPrimeFactor(long num) {

        ArrayList<Long> primeFactors = new ArrayList<Long>();
        long primeFactor = 2;

        while (num > 1) { //gets all primefactors

            while (num % primeFactor == 0) {

                primeFactors.add(primeFactor);

                num /= primeFactor;

            }

            primeFactor += 1;

        }

        int largestIndex = primeFactors.size() - 1; // gets end of arrayList
                                                    // not necessary, but makes code easier to understand

        return primeFactors.remove(largestIndex);

    }

    public static void main(String[] args) {

        Problem3 p3 = new Problem3();

        long largest = p3.largestPrimeFactor(600851475143L);

        System.out.println("The solution is: " + largest);


    }

}
