package Solved_Problems;
import java.util.ArrayList;

import Unsolved_Problems.EulerMethods;
import org.apache.commons.lang3.ArrayUtils;

import static Unsolved_Problems.EulerMethods.fact;

class Problem_024_LexicographicPermutations {
    /*
    A permutation is an ordered arrangement of objects. For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4. If all of the permutations are listed numerically or alphabetically, we call it lexicographic order. The lexicographic permutations of 0, 1 and 2 are:

    012   021   102   120   201   210

    What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
     */

    public static void main(String[] args)
    {
        ArrayList<Integer> permutation = new ArrayList<>();
        int nums[] = {0,1,2,3,4,5,6,7,8,9};
        int length = nums.length;
        int mod = 999999;

        nums = EulerMethods.getInts(permutation, nums, length, mod);

        for(int i : nums)
            permutation.add(i);

        String mil = "";
        for(int i : permutation)
            mil += Integer.toString(i);

        System.out.println(mil);
    }
}
