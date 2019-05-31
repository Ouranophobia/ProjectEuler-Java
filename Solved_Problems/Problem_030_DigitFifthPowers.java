package Solved_Problems;

class Problem_030_DigitFifthPowers
{
    public static void main(String[] args)
    {
        String s;
        int sum = 0;

        for(int i = 0; i < 10; i++)
            for(int j = 0; j < 10; j++)
                for(int k = 0; k < 10; k++)
                    for(int l = 0; l < 10; l++)
                        for(int m = 0; m < 10; m++)
                            for(int n = 0; n < 10; n++)
                            {
                                s = String.valueOf(i) + j + k + l + m + n;

                                if(i==0 && j==0 && k==0 && l==0)
                                    continue;
                                if(i==0 && j==0 && k==0 && l==1)
                                    continue;

                                if (Math.pow(i, 5) + Math.pow(j, 5) + Math.pow(k, 5) +
                                 Math.pow(l, 5) + Math.pow(m, 5) + Math.pow(n, 5) == Integer.valueOf(s))
                                {
                                   sum += Integer.valueOf(s);
                                    System.out.println(s);
                                }
                            }

                        System.out.println(sum);
    }
}
