import com.blasco991.PrimeGenerator.NextPrime;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by blasco991 on 21/03/17.
 */
public class Test {

    public static void main(String args[]) {

        long[] primi = {1, 2, 3, 5, 7, 11};
        long[] not = {0, 4, 6, 8, 10};

        for (long n : primi)
            System.out.println(NextPrime.isPrime(n));

        System.out.println();

        for (long n : not)
            System.out.println(NextPrime.isPrime(n));

        System.out.println();

        long[] primes = new long[50];
        NextPrime primeGen = new NextPrime();
        IntStream.range(0, primes.length).forEach(i -> primes[i] = primeGen.getNextPrime());
        System.out.println(Arrays.toString(primes));

    }

}
