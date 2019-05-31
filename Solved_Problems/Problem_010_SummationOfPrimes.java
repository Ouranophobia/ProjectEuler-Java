package Solved_Problems;

class Problem_010_SummationOfPrimes {   // Summation of primes

    /*
    The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

    Find the sum of all the primes below two million.
    */

    public static void main(String[] args) {

        long sum = 2L;

        for (int i = 3; i < 2000000; i += 2) {
            if (isPrime(i)) {
                sum += i;
                // To have real-time output of progress.
                System.out.println(i);
            }
        }

        System.out.print(sum);

    }

    // Method to check if n is prime
    private static boolean isPrime(int n) {
        boolean is = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                is = false;
                break;
            }
        }

        return is;
    }

}
