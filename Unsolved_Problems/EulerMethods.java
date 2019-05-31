package Unsolved_Problems;

import org.apache.commons.lang3.ArrayUtils;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class EulerMethods
{
    // Returns factorial of int n
    public static BigInteger factorial(int n)
    {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    // Returns factorial of BigInteger n
    public static BigInteger factorial(BigInteger n)
    {
        BigInteger fact = BigInteger.valueOf(1);
        for(BigInteger i = BigInteger.valueOf(1); i.compareTo(n) < 0; i=i.add(BigInteger.ONE))
            fact=fact.multiply(i);

        return fact;
    }



    // Returns factorial of BigInteger n
    public static int fact(int n)
    {
        int fact = 1;
        for(int i = 2; i <= n; i++)
            fact*=i;

        return fact;
    }

    // Checks if n is prime
    public static boolean isPrime(int n)
    {
        if(n == 1) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;
        for (int i = 3; i*i <= n; i+=2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Sieve of Erathosthenes for primes
    public static ArrayList<Integer> sievePrime(int n)
    {
        ArrayList<Integer> primes = new ArrayList<>();
        boolean A[] = new boolean[n+1];
        for (int i = 0; i < n; i++)
            A[i] = true;
        for(int i = 2; i < Math.sqrt(n); i++){
            if(A[i])
                for (int j = i*2; j < n; j += i)
                    A[j] = false;
        }
        for(int i = 2; i <= n; i++)
        {
            if(A[i])
                primes.add(i);
        }
        return primes;
    }

    // Euclid's formula for a Pythagorean triple
    public static int[] pythagoreanTriple(int n, int m)
    {
        int[] triple = new int[3];
        triple[0] = (m * m) - (n * n); // a
        triple[1] = 2 * m * n;         // b
        triple[2] = (m * m) + (n * n); // c

        return triple;
    }

    // Returns number of divisors of n
    public static int numOfDivisors(int n)
    {
        int count = 0;
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n == 1) {
                count = 1;
                break;
            }
            if(n % i == 0) {
                count+=2;
            }
        }
        return count;
    }

    // Returns the set of proper divisors of n
    public static ArrayList<Integer> setOfDivisors(int n)
    {
        ArrayList<Integer> divisors = new ArrayList<>();
        for(int i = 2; i <= n/2; i++){
            if(n == 1)
                break;
            if(n % i == 0){
                divisors.add(n/i);
            }
        }
        divisors.add(1);
        return divisors;
    }

    // Returns true if n is a perfect number
    public static boolean isPerfectNum(int n)
    {
        ArrayList<Integer> arr = setOfDivisors(n);
        int sum = 0;
        for(int i : arr)
            sum += i;
        return(sum == n);
    }

    // Returns true if n is a abundant number
    public static boolean isAbundantNum(int n)
    {
        ArrayList<Integer> arr = setOfDivisors(n);
        int sum = 0;
        for(int i : arr)
            sum += i;
        return(sum > n);
    }

    // Returns the sum of all elements in array x
    public static int sumOfElements(ArrayList<Integer> x)
    {
        int sum = 0;
        for(int i : x)
            sum += i;
        return sum;
    }

    // Returns binomial coefficients of n, k
    public static BigInteger binomial_coefficients(BigInteger n, BigInteger k)
    {
        return factorial(n).divide((factorial(k)).multiply(factorial(n.subtract(k))));
    }

    // Converts char to int
    public static int charToInt(char c) { return Integer.parseInt(String.valueOf(c)); }

    // Converts int to char
    public static char intToChar(int n) { return String.valueOf(n).charAt(0); }

    // Returns list of alphabetical value of string s
    public static ArrayList<Integer> getABC (String s)
    {
        ArrayList<Integer> abc = new ArrayList<>();
        s = s.toUpperCase();
        for (char c : s.toCharArray())
            abc.add(c - ('A' - 1));
        return abc;
    }

    // Returns sum of alphabetical value of string s
    public static int sumOfABC (String s)
    {
        int sumOfABC = 0;
        s = s.toUpperCase();
        for (char c : s.toCharArray())
            sumOfABC += (c - ('A' - 1));
        return sumOfABC;
    }

    // Swaps two objects in a array
    public static void swap(int[]a, int x, int y)
    {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    // Returns the length of recurring decimals when dividing by d
    public static int multiplicativeOrder(int num)
    {
        ArrayList<Integer> n = new ArrayList<>();
        int A = 10;
        int count = 0;
        while(!n.contains(1)) {
            int remainder = A % num;
            n.add(remainder);
            count++;
            A = remainder * 10;
        }
        return count;
    }

    // Returns a primes with n range
    public static int quadraticPrime(int n, int a, int b)
    {
        return Math.abs(n*n + a*n + b);
    }

    // Returns sum of diagonal numbers in a spiral of n * n
    public static int spiralSum(int n)
    {
        int num = 1, factor = 2, sum = 1;

        while(factor < n)
        {
            for(int i = 1; i <= 4; i++)
            {
                num += factor;
                sum += num;
            }

            factor += 2;
        }

        return sum;
    }

    // Returns the sum of n digits factorial
    public static int digitFactorial(int n)
    {
        int length = String.valueOf(n).length(), sum = 0;

        for(int i = 0; i < length; i++)
            sum += fact(charToInt(String.valueOf(n).charAt(i)));

        return sum;
    }

    // Returns array of n circular
    public static ArrayList<Integer> circular(int n)
    {
        int length = String.valueOf(n).length();
        ArrayList<Integer> circular = new ArrayList<>();
        String s = String.valueOf(n);
        char c;
        int i = 0;

        while(i < length) {
            c = s.charAt(0);
            s = s.substring(1, length) + c;
            circular.add(Integer.parseInt(s));
            i++;
        }

        return circular;
    }

    // Returns int n reversed
    public static int reverseNum(int n)
    {
        int length = String.valueOf(n).length();
        String s = String.valueOf(n);
        StringBuilder tmp = new StringBuilder();

        for(int i = length-1; i >= 0; i--)
            tmp.append(s.charAt(i));

        return Integer.parseInt(tmp.toString());
    }

    public static BigInteger reverseNum(BigInteger n)
    {
        int length = n.toString().length();
        String s = n.toString();
        StringBuilder tmp = new StringBuilder();

        for(int i = length-1; i >= 0; i--)
            tmp.append(s.charAt(i));

        return new BigInteger(tmp.toString());
    }

    // Returns true if n is a palindrome
    public static boolean isPalindrome(BigInteger n)
    {
        int length = String.valueOf(n).length();
        String s = String.valueOf(n);

        for(int i = 0; i < length/2;)
            for (int j = length -1; j >= length/2; j--)
                if(s.charAt(i) == s.charAt(j))
                    i++;
                else
                    return false;

                return true;
    }

    // Returns true if n is a truncatable prime
    public static boolean isTruncatablePrime(int n)
    {
        String s = String.valueOf(n);
        int length = s.length();

        if(isPrime(n)) {
            for (int i = 0; i < length; i++) {
                String left = s.substring(i, length);
                if (!isPrime(Integer.parseInt(left)))
                    return false;
            }

            for(int i = length; i > 0; i--) {
                String right = s.substring(0, i);
                if(!isPrime(Integer.parseInt(right)))
                    return false;
            }
        }

        else
            return false;

        return true;
    }

    // Returns true if n is a pandigital number
    public static boolean isPandigital(int n)
    {
        String s = String.valueOf(n);
        StringBuilder x = new StringBuilder();
        int charsum = 0;
        byte[] b = s.getBytes();
        int csum = 0;

        // Create string of numbers 1 - length of n
        for(int i = 1; i <= String.valueOf(n).length(); i++)
            x.append(i);
        // Creates array of the ASCII values of the numbers 1 - length of n
        byte[] c = x.toString().getBytes();

        // Adds values of ASCII array to be compared to later
        for(int i : c)
            csum += i;

        // Filters out product with '0' digits
        if(!s.contains("0"))
            // Adds the ASCII value of each char in the number n
            for (int i : b)
                charsum += i;
            else
                return false;

        // Filters out numbers with reoccurring digits
        for(int i = 0; i < s.length(); i++)
            for(int j = i+1; j < s.length(); j++)
                if(s.charAt(i) == s.charAt(j))
                    return false;
                // Returns true of if the ASCII value of the number
                // given is equal to the ASCII value of 1 - length of n
                return(charsum == csum);
    }

    public static boolean isPandigital(BigInteger n)
    {
        String s = n.toString();
        StringBuilder x = new StringBuilder();
        int charsum = 0;
        byte[] b = s.getBytes();
        int csum = 0;

        if(s.length() < 10)
            for(int i = 1; i <= String.valueOf(n).length(); i++)
                x.append(i);
        else {
            for (int i = 1; i < 10; i++)
                x.append(i);
            x.append(0);
        }
        // Creates array of the ASCII values of the numbers 1 - length of n
        byte[] c = x.toString().getBytes();

        // Adds values of ASCII array to be compared to later
        for(int i : c)
            csum += i;

        // Filters out product with '0' digits
        //if(!s.contains("0"))
            // Adds the ASCII value of each char in the number n
            for (int i : b)
                charsum += i;

        // Filters out numbers with reoccurring digits
        for(int i = 0; i < s.length(); i++)
            for(int j = i+1; j < s.length(); j++)
                if(s.charAt(i) == s.charAt(j))
                    return false;
        // Returns true of if the ASCII value of the number
        // given is equal to the ASCII value of 1 - length of n
        return(charsum == csum);
    }

    // Returns array of solutions for a triangle of n perimeter
    public static ArrayList<String> getPythagorasABC(int n)
    {
        ArrayList<String> abc = new ArrayList<>();
        int[] arr, check;
        int c;

        for(int a = 1; a < n; a++)
            for(int b = 2; b < n; b++) {

                if(Math.sqrt(a*a + b*b) % 1 == 0) {
                    c = (int) Math.sqrt(a * a + b * b);

                    if (a * a + b * b == c * c && a + b + c == n) {
                        arr = new int[]{a, b, c};
                        check = new int[]{b, a, c};

                        if (!abc.contains(Arrays.toString(check)))
                            abc.add(Arrays.toString(arr));
                    }
                }
            }

            return abc;
    }

    // Returns the nth term of the sequence of triangle numbers
    public static int triangleNum(int n)
    {
        return (int) (0.5 * n * (n + 1.0));
    }

    // Returns true if n is a triangle number
    public static boolean isTriangleNum(int n) { return (Math.sqrt(8*(double)n+1)-1) / 2 % 1 == 0; }

    // Return true if n is divisible
    public static boolean isDivisible(int n)
    {
        for(int i = 2; i < n/2; i++)
            if(n % i == 0)
                return true;

            return false;
    }

    // Returns array of all permutation of 0-9
    public static String permutation(int n)
    {
        ArrayList<Integer> permutation = new ArrayList<>();
        int nums[] = {0,1,2,3,4,5,6,7,8,9};
        int length = nums.length;

        nums = getInts(permutation, nums, length, n);

        for(int i : nums)
            permutation.add(i);

        StringBuilder perm = new StringBuilder();
        for(int i : permutation)
            perm.append(Integer.toString(i));

        return perm.toString();
    }

    // Returns the mth permutation of the predefined array
    public static String permutation(int[] n, int m)
    {
        ArrayList<Integer> permutation = new ArrayList<>();
        int nums[] = n;
        int length = nums.length;
        // max is the factorial of length of n

        nums = getInts(permutation, nums, length, m);

        for(int i : nums)
            permutation.add(i);

        StringBuilder perm = new StringBuilder();
        for(int i : permutation)
            perm.append(Integer.toString(i));

        return perm.toString();
    }

    public static int[] getInts(ArrayList<Integer> permutation, int[] nums, int length, int mod) {
        for(int i = 1; i < length; i++){
            int j = mod / fact((length-i));
            mod %= fact((length-i));
            permutation.add(nums[j]);
            nums = ArrayUtils.removeElement(nums, nums[j]);
        }
        return nums;
    }

    // Returns the nth pentagon number of the pentagon number sequence
    public static int pentagonNum(int n)
    {
        return n*(3*n-1)/2;
    }

    // Returns true if n is a pentagon number
    public static boolean isPentagonNum(int n) { return (Math.sqrt(24*(double)n+1) + 1) / 6 % 1 == 0; }

    // Returns true if n is a hexagonal number
    public static boolean isHexagonal(int n) { return (Math.sqrt(8*(double)n + 1)+1) / 4 % 1 == 0;}

    // Returns array of prime divisors of n
    public static ArrayList<Integer> primeDivisors(int n)
    {
        ArrayList<Integer> divisors = new ArrayList<>();
        for(int i = 2; i <= n/2; i++){
            if(n == 1)
                break;
            if(n % i == 0 && isPrime(n/i)){
                divisors.add(n/i);
            }
        }

        return divisors;
    }

    // Returns true if n is a pandigital permutation of m
    public static boolean isPandigitalOf(int n, int m)
    {
        String sN = String.valueOf(n), sM = String.valueOf(m);
        byte [] bN = sN.getBytes(), bM = sM.getBytes();

        ArrayList<Integer> arrN = new ArrayList<>();
        ArrayList<Integer> arrM = new ArrayList<>();

        for(int i : bN)
            arrN.add(i);

        for(int i : bM)
            arrM.add(i);

        if(arrN.size() != arrM.size())
            return  false;

        for(int i : arrN)
            if(!arrM.contains(i))
                return false;

        return true;

    }

    // Returns the combinatorics of
    public static BigInteger combinatorics(int n, int r)
    {
        if(r <= n) return factorial(n).divide((factorial(r).multiply(factorial(n-r))));

        else return BigInteger.ZERO;
    }

    // Returns true if all int variables equals the expected variable
    public static boolean allEquals(int a, int b, int c, int d, int expected)
    {
        return (a == expected) && (b == expected) && (c == expected) && (d == expected);
    }

    public static boolean allEquals(int a, int b, int c, int expected)
    {
        return (a == expected) && (b == expected) && (c == expected);
    }

    public static boolean allEquals(int a, int b, int expected)
    {
        return (a == expected) && (b == expected);
    }

    // Returns true if n is a lychrel number
    public static boolean isLychrel(int n)
    {
        BigInteger num = BigInteger.valueOf(n);

        for(int i = 0; i < 50; i++){
            num = num.add(reverseNum(num));
            if(isPalindrome(num)) return false;
        }

        return true;
    }

    public static BigInteger findGCD(BigInteger number1, BigInteger number2) {
        if(number2.equals(BigInteger.ZERO)){
            return number1;
        }
        return findGCD(number2, number1.mod(number2));
    }

    public static int squareDigitChain(int n)
    {
        //int[] digits = new int[9999999];
        ArrayList<Integer> digits = new ArrayList<>();
        int sum = 0;
        String num = String.valueOf(n);

        for(int i = 0; i < num.length(); i++)
            digits.add((int)Math.pow((double)charToInt(num.charAt(i)), 2));

        for( int d : digits)
            sum += d;

        return sum;
    }


}
