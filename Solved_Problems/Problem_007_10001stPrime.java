package Solved_Problems;

import java.util.ArrayList;

class Problem_007_10001stPrime {
    // 10001st prime

    // By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.What is the 10 001st prime number?

    public static void main(String[] args) {
        ArrayList<Integer> prime = new ArrayList<>();

        for (int i = 2; prime.size() <= 10001; i++) {
            if (isPrime(i))
                prime.add(i);
        }

        System.out.print("The 10,001st prime is " + prime.get(10000));
    }

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
