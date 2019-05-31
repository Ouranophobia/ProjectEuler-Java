package Solved_Problems;
import static Unsolved_Problems.EulerMethods.getPythagorasABC;

/*
If p is the perimeter of a right angle triangle with integral length sides, {a,b,c}, there are exactly three solutions for p = 120.

{20,48,52}, {24,45,51}, {30,40,50}

For which value of p ≤ 1000, is the number of solutions maximised?
*/

public class Problem_039_IntegerRightTriangles
{
    public static void main(String[] args)
    {
        long start = System.nanoTime();
        int max = 0;
        int n = 0;

        for(int i = 100; i <= 1000; i++ )
            if(getPythagorasABC(i).size() > max) {
                max = getPythagorasABC(i).size();
                n = i;
            }

        System.out.println(n);
        System.out.println(getPythagorasABC(n));
        long end = System.nanoTime();
        double ms = (double) (end - start) / 1000000.0;
        System.out.println(ms);
    }
}
