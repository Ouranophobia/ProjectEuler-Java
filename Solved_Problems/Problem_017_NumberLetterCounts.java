package Solved_Problems;

class Problem_017_NumberLetterCounts {

    /*

    If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

    If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?

    NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.

*/

    public static void main(String[] args)
    {
        int letterSum = 0;
        for(int i = 1; i <= 1000; i++)
        {
            letterSum += toWord(i).length();
        }
        System.out.println(letterSum);
    }

    private static String toWord(int x)
    {
        String word = Integer.toString(x);
        String W = "";

        String[] single_digits = { "", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"};

        String[] two_digits = {"ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

        String[] tens_multiple = {"", "", "twenty", "thirty", "forty", "fifty",
            "sixty", "seventy", "eighty", "ninety"};

        String[] tens_power = {"hundred", "thousand"};

        // Resolves thousands
        if(word.length() == 4){
            W = single_digits[Integer.parseInt(String.valueOf(word.charAt(0)))] + tens_power[1];
            if(intOf(word.charAt(1)) != 0)
                W += single_digits[Integer.parseInt(String.valueOf(word.charAt(1)))] + tens_power[0];
            if(intOf(word.charAt(2)) == 1)
                W += "and" + two_digits[Integer.parseInt(String.valueOf(word.charAt(3)))];
            if(intOf(word.charAt(2)) != 1 && intOf(word.charAt(2)) != 0)
                W += "and" + tens_multiple[intOf(word.charAt(2))] + single_digits[intOf(word.charAt(3))];
            if(intOf(word.charAt(2)) == 0 && intOf(word.charAt(3)) != 0)
                W += "and" + single_digits[intOf(word.charAt(3))];
        }

        // Resolves hundreds
        if(word.length() == 3)
        {
            W += single_digits[Integer.parseInt(String.valueOf(word.charAt(0)))] + tens_power[0];
            if(intOf(word.charAt(1)) == 1)
                W += "and" + two_digits[Integer.parseInt(String.valueOf(word.charAt(2)))];
            if(intOf(word.charAt(1)) != 1 && intOf(word.charAt(1))!=0)
                W += "and" + tens_multiple[intOf(word.charAt(1))] + single_digits[intOf(word.charAt(2))];


            if(intOf(word.charAt(1)) == 0 && intOf(word.charAt(2)) != 0)
                W += "and" + single_digits[intOf(word.charAt(2))];
        }

        // Resolves tens
        if(word.length() == 2)
        {
            if(intOf(word.charAt(0)) == 1)
                W += two_digits[Integer.parseInt(String.valueOf(word.charAt(1)))];
            else
                W += tens_multiple[intOf(word.charAt(0))] + single_digits[intOf(word.charAt(1))];
        }

        // Resolves singles
        if(word.length() == 1)
        {
            W += single_digits[intOf(word.charAt(0))];
        }

        return W;
    }

    private static int intOf(char c)
    {
        return Integer.parseInt(String.valueOf(c));
    }
}
