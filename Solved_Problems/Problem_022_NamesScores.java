package Solved_Problems;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

class Problem_022_NamesScores
{
    /*
    Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.

    For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.

    What is the total of all the name scores in the file?
    */

    public static void main(String[] args) throws Exception
    {
        // File Reader
        File file = new File("D:\\Antonio\\Documents\\GitLab\\ProjectEuler-Java\\txt\\p022_names.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = br.readLine();

        // Initializing Array and List
        String[] lines;
        ArrayList<Integer> sum = new ArrayList<>();

        // Replacing, Splitting, Trimming and Sorting
        lines = line.replace('\"',' ').split(",");
        for(int i = 0; i < lines.length; i++)
            lines[i] = lines[i].trim();
        Arrays.sort(lines);

        // Array to List
        ArrayList<String> names = new ArrayList<>(Arrays.asList(lines));

        int namescore = 0, x = 0;

        // For-Loop to Convert Names to Alphabetical Value then Multiplying by its Index + 1
        for(String s : names) {
            for (char c : s.toCharArray())
                x += c - ('A' - 1);
            sum.add(x * (names.indexOf(s)+1)); // Added Parenthesis, Order of Operation
            x=0;
        }

        // Adding All Name Scores
        for(int i : sum)
            namescore += i;

        System.out.print(namescore);
    }
}

