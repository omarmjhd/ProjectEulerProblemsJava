import java.util.PriorityQueue;

/**
 *
 * Problem 3: The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 *
 * @author Omar Mujahid
 */
public class Problem3 { //This works, but the priority queue is inefficient. Maybe an treelist would be better?

    public static long primeFactor(long num) {

        PriorityQueue<Long> primeFactors = primeFactors(num);

        long prime = 0;

        while (!primeFactors.isEmpty()) {

            prime = primeFactors.poll();

        }

        return prime;

    }

    public static PriorityQueue<Long> primeFactors(long num) {

        long primeFactor = 2;
        PriorityQueue<Long> factors = new PriorityQueue<Long>();

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
