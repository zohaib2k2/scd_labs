/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafunkylist;

/**
 *
 * @author se20-005
 */
import java.util.ArrayList;

public class Javafunkylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        //Here is a fizbuzz
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        System.out.println("===END OF FIZZBUZZ===\n\n");
        System.out.println("===START OF PRIME LIST ARRAY===");
        
        ArrayList<Integer> primes = new ArrayList<>();
        int tot = 0;

        // List of first 10 prime numbers
        int[] firstTenPrimes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

        // Add each prime number to the ArrayList and calculate the total
        for (int prime : firstTenPrimes) {
            primes.add(prime);
            tot += prime;
        }

        // Output the results
        System.out.println("First 10 prime numbers: " + primes);
        System.out.println("Total sum of first 10 prime numbers: " + tot);
    }
    }
    
}
