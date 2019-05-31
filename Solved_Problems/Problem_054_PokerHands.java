package Solved_Problems;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import static Unsolved_Problems.PokerHand.pokerHand;

public class Problem_054_PokerHands
{
    public static void main(String[] args) throws Exception
    {
        File file = new File("D:\\Antonio\\Documents\\GitLab\\ProjectEuler-Java\\txt\\p054_poker.txt");
        Scanner scnr = new Scanner(file);

        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();

        int p1Wins = 0;

        ArrayList<String> lines = new ArrayList<>();

        while(scnr.hasNext()){
            lines.add(scnr.nextLine());
        }

        for (String line : lines) {
            player1.add(line.substring(0, 14));
            player2.add(line.substring(15, 29));
        }

        for(int i = 0; i < player1.size(); i++)
            if(pokerHand(player1.get(i)) < pokerHand(player2.get(i)))
                System.out.println(player1.get(i) + " " + player2.get(i));

        System.out.println(p1Wins);
    }
}
