package Solved_Problems;

class Problem_009_SpecialPythagoreanTriplet {
    // Special Pythagorean triplet

    /*

    A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
    a2 + b2 = c2

    For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

    There exists exactly one Pythagorean triplet for which a + b + c = 1000.
    Find the product abc.

    */

    public static void main(String[] args) {
        int a = 0, b = 0, c = 0, m = 1, n = 2;

        while ((a + b + c) != 1000) {
            // Euclid's formula for a Pythagorean triple
            a = (m * m) - (n * n);
            b = 2 * m * n;
            c = (m * m) + (n * n);

            // Iterates n when m max
            if (m >= 20) {
                m = n;
                n++;
            }
            m++;
        }
        System.out.println(a * b * c);
    }

}