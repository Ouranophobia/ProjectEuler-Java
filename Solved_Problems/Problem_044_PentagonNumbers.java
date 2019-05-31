package Solved_Problems;
import static Unsolved_Problems.EulerMethods.pentagonNum;
import static Unsolved_Problems.EulerMethods.isPentagonNum;

public class Problem_044_PentagonNumbers
{
    public static void main(String[] args)
    {
        for(int i = 1; i < 2500; i++)
            for(int j = 1; j < 2500; j++)
                if(isPentagonNum(pentagonNum(i) + pentagonNum(j)))
                    if(isPentagonNum(pentagonNum(i) - pentagonNum(j)))
                        System.out.println(pentagonNum(i) - pentagonNum(j));

    }
}
