package Solved_Problems;

class Problem_005_SmallestMultiple {
    // Smallest multiple

    /* 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
       What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
    */

    public static void main(String[] args) {
        int min = 0, x = 1, y = 1;

        for (; x < 21; x++) {
            if (y % x == 0)
                min = y;
            else {
                y++;
                x = 1;
            }
        }

        System.out.println("Smallest positive number that is evenly divisible by all the numbers from 1 to 20 is " + min);
    }

}
