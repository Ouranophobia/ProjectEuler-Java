package Solved_Problems;

class Problem_019_CountingSundays {
    /*


You are given the following information, but you may prefer to do some research for yourself.

    1 Jan 1900 was a Monday.
    Thirty days has September,
    April, June and November.
    All the rest have thirty-one,
    Saving February alone,
    Which has twenty-eight, rain or shine.
    And on leap years, twenty-nine.
    A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.

How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?

     */

    public static void main(String[] args)
    {
        int[][][] year = new int[100][12][31];
        int c = 2, sunday = 0;

        for (int i = 0, j = 0; i <= 99; i++) {
                for (int jan = 1; jan <= 31; jan++)
                {
                    year[i][j][jan-1] = jan;
                    if (c == 7){
                        if(year[i][j][jan-1]==1)
                            sunday++;
                        c=0;
                    }
                    c++;
                }
                if ( (i+1) % 4 == 0) {
                    for (int feb = 1; feb <= 29; feb++) {
                        year[i][j + 1][feb - 1] = feb;
                        if (c == 7) {
                            if (year[i][j + 1][feb - 1] == 1)
                                sunday++;
                            c = 0;
                        }
                        c++;
                    }
                }
                else {
                    for (int feb = 1; feb <= 28; feb++) {
                        year[i][j + 1][feb - 1] = feb;
                        if (c == 7) {
                            if (year[i][j + 1][feb - 1] == 1)
                                sunday++;
                            c = 0;
                        }
                        c++;
                }
                }


                for (int mar = 1; mar <= 31; mar++) {
                    year[i][j+2][mar-1] = mar;
                    if (c == 7){
                        if(year[i][j+2][mar-1]==1)
                            sunday++;
                        c=0;
                    }
                    c++;
                }

                for (int apr = 1; apr <= 30; apr++) {
                    year[i][j+3][apr-1] = apr;
                    if (c == 7){
                        if(year[i][j+3][apr-1]==1)
                            sunday++;
                        c=0;
                    }
                    c++;
                }

                for (int may = 1; may <= 31; may++) {
                    year[i][j+4][may-1] = may;
                    if (c == 7){
                        if(year[i][j+4][may-1]==1)
                            sunday++;
                        c=0;
                    }
                    c++;
                }

                for (int jun = 1; jun <= 30; jun++) {
                    year[i][j+5][jun-1] = jun;
                    if (c == 7){
                        if(year[i][j+5][jun-1]==1)
                            sunday++;
                        c=0;
                    }
                    c++;
                }

                for (int jul = 1; jul <= 31; jul++) {
                    year[i][j+6][jul-1] = jul;
                    if (c == 7){
                        if(year[i][j+6][jul-1]==1)
                            sunday++;
                        c=0;
                    }
                    c++;
                }

                for (int aug = 1; aug <= 31; aug++) {
                    year[i][j+7][aug-1] = aug;
                    if (c == 7){
                        if(year[i][j+7][aug-1]==1)
                            sunday++;
                        c=0;
                    }
                    c++;
                }

                for (int sep = 1; sep <= 30; sep++) {
                    year[i][j+8][sep-1] = sep;
                    if (c == 7){
                        if(year[i][j+8][sep-1]==1)
                            sunday++;
                        c=0;
                    }
                    c++;
                }

                for (int oct = 1; oct <= 31; oct++) {
                    year[i][j+9][oct-1] = oct;
                    if (c == 7){
                        if(year[i][j+9][oct-1]==1)
                            sunday++;
                        c=0;
                    }
                    c++;
                }

                for (int nov = 1; nov <= 30; nov++) {
                    year[i][j+10][nov-1] = nov;
                    if (c == 7){
                        if(year[i][j+10][nov-1]==1)
                            sunday++;
                        c=0;
                    }
                    c++;
                }

                for (int dec = 1; dec <= 31; dec++) {
                    year[i][j+11][dec-1] = dec;
                    if (c == 7){
                        if(year[i][j+11][dec-1]==1)
                            sunday++;
                        c=0;
                    }
                    c++;
                }

        }

        System.out.println(sunday);

    }
}
