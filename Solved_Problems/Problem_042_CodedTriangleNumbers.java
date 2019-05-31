package Solved_Problems;
import static Unsolved_Problems.EulerMethods.isTriangleNum;
import static Unsolved_Problems.EulerMethods.sumOfABC;
/*
The nth term of the sequence of triangle numbers is given by, tn = ½n(n+1); so the first ten triangle numbers are:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

By converting each letter in a word to a number corresponding to its alphabetical position and adding these values we form a word value. For example, the word value for SKY is 19 + 11 + 25 = 55 = t10. If the word value is a triangle number then we shall call the word a triangle word.

Using words.txt (right click and 'Save Link/Target As...'), a 16K text file containing nearly two-thousand common English words, how many are triangle words?
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Problem_042_CodedTriangleNumbers
{
    public static void main(String[] args) throws Exception
    {
        long start = System.nanoTime();
        int triangleWords = 0;

        File file = new File("D:\\Antonio\\Documents\\GitLab\\ProjectEuler-Java\\txt\\p042_words.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = br.readLine();

        String[] lines;

        lines = line.replace('\"',' ').split(",");
        for(int i = 0; i < lines.length; i++)
            lines[i] = lines[i].trim();

        ArrayList<String> words = new ArrayList<>(Arrays.asList(lines));

        for(String s : words)
            if(isTriangleNum(sumOfABC(s)))
                triangleWords++;

        System.out.println(triangleWords);
        long end = System.nanoTime();
        double ms = (double) (end - start) / 1000000.0;
        System.out.println(ms);
    }
}
