package Solved_Problems;

import java.util.ArrayList;

class Problem_032_PandigitalProducts
{
    /*
    We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once; for example, the 5-digit number, 15234, is 1 through 5 pandigital.

    The product 7254 is unusual, as the identity, 39 × 186 = 7254, containing multiplicand, multiplier, and product is 1 through 9 pandigital.

    Find the sum of all products whose multiplicand/multiplier/product identity can be written as a 1 through 9 pandigital.
    HINT: Some products can be obtained in more than one way so be sure to only include it once in your sum.
     */

    public static void main(String[] args)
    {
        ArrayList<Integer> pandigitalProducts = new ArrayList<>();
        ArrayList<Integer> multiplicand = new ArrayList<>();
        ArrayList<Integer> multiplier = new ArrayList<>();
        int product = 0;
        int sum = 0;
        int charsum = 0;

        // Creates multiplicands of 2-digit length without recurring digits and adds to array
        for(int i = 1; i < 10; i++)
            for(int j = 1; j < 10; j++)
                if(i != j)
                    multiplicand.add(Integer.parseInt(i + "" + j));
        // Adds digits 1-9  to multiplicands
        for(int i = 1; i < 10; i++)
            multiplicand.add(i);

        // Creates multiplier of 3-digit length without recurring digits and adds to array
        for(int i = 1; i < 10; i++)
            for(int j = 1; j < 10; j++)
                for(int k = 1; k < 10; k++)
                    if(i != j && j != k && i != k)
                        multiplier.add(Integer.parseInt(i + "" + j + "" + k));
        // Creates multiplier of 4-digit length without recurring digits and adds to array
        for(int i = 1; i < 10; i++)
            for(int j = 1; j < 10; j++)
                for(int k = 1; k < 10; k++)
                    for(int l = 1; l < 10; l++)
                        if(i != j && j != k && i != k && l != i && l != j && l != k)
                            multiplier.add(Integer.parseInt(i + "" + j + "" + k + "" + l));

        // Multiplies ever element in both arrays
        for(int x : multiplicand)
            for (int y : multiplier) {
                String s1 = String.valueOf(x);
                String s2 = String.valueOf(y);

        // Filters outs multipliers with common digits found in the multiplicand
                if(s1.length() == 1)
                    if(!s2.contains(String.valueOf(s1.charAt(0)))) {}
                    else
                        continue;
                if (s1.length() == 2)
                    if(!s2.contains(String.valueOf(s1.charAt(0))) || !s2.contains(String.valueOf(s1.charAt(1)))) {}
                    else
                        continue;

            product = x * y;
            String s = product + "" + x + "" + y;
            String s3 = x + "" + y;
            String s4 = String.valueOf(product);
            byte[] b = s.getBytes();
            byte[] c = s4.getBytes();
            boolean is = true;

            // Filters out products whose length is not 4
            if(String.valueOf(product).length() == 4)
                // Filters out product with '0' digits
                if(!String.valueOf(product).contains("0"))
                    // Adds the ASCII value of each char of the identity 1-9 = 477
                    for (int z : b)
                        charsum += z;
                    else
                        is = false;

            // Filters out products whose digits are found in the multiplicand and multiplier
            for(int i = 0; i < s3.length(); i++)
                if(Integer.toString(product).contains(String.valueOf(s3.charAt(i))))
                    is = false;

            // Filters out products with reoccurring digits
            for(int i = 0; i < s4.length(); i++)
                for(int j = i+1; j < s4.length(); j++)
                    if(is && s4.charAt(i) == s4.charAt(j))
                        is =false;

            // If identity is 1-9 pandigital adds product to array
            if (charsum == 477 && is)
                if (!pandigitalProducts.contains(product)) {
                    pandigitalProducts.add(product);
                    System.out.println(product + " " + x + " " + y);
                }

            // Resets variables
            charsum = 0;
            sum = 0;
            }

        // Sums up all products in array
        for(int p : pandigitalProducts)
            sum += p;

        System.out.print(sum);

    }
}
