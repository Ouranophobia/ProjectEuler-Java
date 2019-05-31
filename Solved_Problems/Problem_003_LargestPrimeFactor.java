package Solved_Problems;

class Problem_003_LargestPrimeFactor {
    //Largest Prime Factor

    // The prime factors of 13195 are 5, 7, 13 and 29.
    // What is the largest prime factor of the number 600851475143 ?

    public static void main(String[] args) {
        long n = 600851475143L;
        int largestPrimeFactor;

        for (largestPrimeFactor = 2; largestPrimeFactor <= n; largestPrimeFactor++) {
            if (n % largestPrimeFactor == 0) {
                n /= largestPrimeFactor;
                largestPrimeFactor--;
            }
        }
        System.out.println(largestPrimeFactor);
    }

}
