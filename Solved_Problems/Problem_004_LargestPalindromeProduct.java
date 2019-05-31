package Solved_Problems;

import java.util.ArrayList;
import java.util.Objects;

class Problem_004_LargestPalindromeProduct {
    //Largest palindrome product

    //A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.Find the largest palindrome made from the product of two 3-digit numbers.


    public static void main(String[] args) {
        ArrayList<Integer> palindrome = new ArrayList<>();
        int max = 0, fact1 = 0, fact2 = 0;

        for (int i = 999999; i > 100000; i--) {
            String p = Integer.toString(i);

            if (Objects.equals((p.charAt(0)), p.charAt(5)) && (Objects.equals((p.charAt(1)), p.charAt(4))) && (Objects.equals((p.charAt(2)), p.charAt(3)))) {
                int x = Integer.parseInt(p);
                palindrome.add(x);
            }
        }

        for (int i = palindrome.size() - 1; i >= 0; i--) {
            for (int j = 999; j > 100; j--) {
                if (palindrome.get(i) % j == 0) {
                    int x = palindrome.get(i) / j;
                    int f1 = Integer.toString(j).length();
                    int f2 = Integer.toString(x).length();

                    if (f1 == 3 && f2 == 3) {
                        max = palindrome.get(i);
                        fact1 = j;
                        fact2 = x;
                    }
                }
            }
        }

        System.out.print("Largest palindrome of two 3-digit numbers is " + max + "\nFactor 1: " + fact1 + "\nFactor 2: " + fact2);
    }
}
