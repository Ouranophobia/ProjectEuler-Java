package Solved_Problems;

import static Unsolved_Problems.EulerMethods.triangleNum;
import static Unsolved_Problems.EulerMethods.isPentagonNum;
import static Unsolved_Problems.EulerMethods.isHexagonal;

public class Problem_045_TriangularPentagonalAndHexagonal
{
    public static void main(String[] args)
    {
        long start = System.nanoTime();
        for(int i = 286; i < 6000; i++)
            if(isPentagonNum(triangleNum(i)) && isHexagonal(triangleNum(i)))
                System.out.println(i);
        long end = System.nanoTime();
        double ms = (double) (end - start) / 1000000.0;
        System.out.println(ms);
    }
}
