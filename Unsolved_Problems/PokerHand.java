package Unsolved_Problems;

import java.util.ArrayList;
import java.util.Collections;

import static Unsolved_Problems.EulerMethods.allEquals;
import static Unsolved_Problems.EulerMethods.charToInt;

public class PokerHand
{
    // Returns value of poker hand
    public static int pokerHand(String hand)
    {
        int handValue = 0;
        String pokerHand = hand.replace(" ", "");

        ArrayList<Character> suits = new ArrayList<>();
        ArrayList<Character> value = new ArrayList<>();

        String order = "A23456789TJQKA";

        int T=10, J=11, Q=12, K=13, A=14;

        int royalFlush = 200, straightFlush = 130, fourOfAKind = 105, fullHouse = 90, flush = 75,
                straight = 60, threeOfAKind = 45, twoPairs = 30, onePair = 15;

        String card1 = pokerHand.substring(0,2);
        String card2 = pokerHand.substring(2,4);
        String card3 = pokerHand.substring(4,6);
        String card4 = pokerHand.substring(6,8);
        String card5 = pokerHand.substring(8,10);

        suits.add(card1.charAt(1));
        suits.add(card2.charAt(1));
        suits.add(card3.charAt(1));
        suits.add(card4.charAt(1));
        suits.add(card5.charAt(1));

        value.add((card1.charAt(0)));
        value.add((card2.charAt(0)));
        value.add((card3.charAt(0)));
        value.add((card4.charAt(0)));
        value.add((card5.charAt(0)));


        if (allEquals(card1.charAt(1), card2.charAt(1), card3.charAt(1), card4.charAt(1), card5.charAt(1)))
            if (value.contains('T') && value.contains('J') && value.contains('Q') && value.contains('K') && value.contains('A'))
                return royalFlush;

        if (allEquals(card1.charAt(1), card2.charAt(1), card3.charAt(1), card4.charAt(1), card5.charAt(1)))
            for(int i = 0; i < order.length()-4; i++)
                if(value.contains(order.charAt(i))  && value.contains(order.charAt(i+1))  && value.contains(order.charAt(i+2))  &&
                        value.contains(order.charAt(i+3))  && value.contains(order.charAt(i+4)))
                    for(int j = order.length()-1; j >= 0; j--)
                        if(value.contains(order.charAt(j)))
                            if(order.charAt(j) == 'A')
                                return straightFlush + A;
                            else if (order.charAt(j) == 'K')
                                return straightFlush + K;
                            else if (order.charAt(j) == 'Q')
                                return straightFlush + Q;
                            else if (order.charAt(j) == 'J')
                                return straightFlush + J;
                            else if (order.charAt(j) == 'T')
                                return straightFlush + T;
                            else
                                return straightFlush + charToInt(order.charAt(j));

        if (Collections.frequency(value, card1.charAt(0)) == 4)
            if(card1.charAt(0) == 'A')
                return fourOfAKind + A;
            else if(card1.charAt(0) == 'K')
                return fourOfAKind + K;
            else if(card1.charAt(0) == 'Q')
                return fourOfAKind + Q;
            else if(card1.charAt(0) == 'J')
                return fourOfAKind + J;
            else if(card1.charAt(0) == 'T')
                return fourOfAKind + T;
            else
                return fourOfAKind + charToInt(card1.charAt(0));

        if (Collections.frequency(value, card2.charAt(0)) == 4)
            if(card2.charAt(0) == 'A')
                return fourOfAKind + A;
            else if(card2.charAt(0) == 'K')
                return fourOfAKind + K;
            else if(card2.charAt(0) == 'Q')
                return fourOfAKind + Q;
            else if(card2.charAt(0) == 'J')
                return fourOfAKind + J;
            else if(card2.charAt(0) == 'T')
                return fourOfAKind + T;
            else
                return fourOfAKind + charToInt(card2.charAt(0));

        if (Collections.frequency(value, card1.charAt(0)) == 3)
            if(Collections.frequency(value, card1.charAt(0)) == 2 || Collections.frequency(value, card2.charAt(0)) == 2
                    || Collections.frequency(value, card3.charAt(0)) == 2 || Collections.frequency(value, card4.charAt(0)) == 2)
                if(card1.charAt(0) == 'A')
                    return fullHouse + A;
                else if(card1.charAt(0) == 'K')
                    return fullHouse + K;
                else if(card1.charAt(0) == 'Q')
                    return fullHouse + Q;
                else if(card1.charAt(0) == 'J')
                    return fullHouse + J;
                else if(card1.charAt(0) == 'T')
                    return fullHouse + T;
                else
                    return fullHouse + charToInt(card1.charAt(0));

        if (Collections.frequency(value, card2.charAt(0)) == 3)
            if(Collections.frequency(value, card1.charAt(0)) == 2 || Collections.frequency(value, card2.charAt(0)) == 2
                    || Collections.frequency(value, card3.charAt(0)) == 2 || Collections.frequency(value, card4.charAt(0)) == 2)
                if(card2.charAt(0) == 'A')
                    return fullHouse + A;
                else if(card2.charAt(0) == 'K')
                    return fullHouse + K;
                else if(card2.charAt(0) == 'Q')
                    return fullHouse + Q;
                else if(card2.charAt(0) == 'J')
                    return fullHouse + J;
                else if(card2.charAt(0) == 'T')
                    return fullHouse + T;
                else
                    return fullHouse + charToInt(card2.charAt(0));

        if (Collections.frequency(value, card3.charAt(0)) == 3)
            if(Collections.frequency(value, card1.charAt(0)) == 2 || Collections.frequency(value, card2.charAt(0)) == 2
                    || Collections.frequency(value, card3.charAt(0)) == 2 || Collections.frequency(value, card4.charAt(0)) == 2)
                if(card3.charAt(0) == 'A')
                    return fullHouse + A;
                else if(card3.charAt(0) == 'K')
                    return fullHouse + K;
                else if(card3.charAt(0) == 'Q')
                    return fullHouse + Q;
                else if(card3.charAt(0) == 'J')
                    return fullHouse + J;
                else if(card3.charAt(0) == 'T')
                    return fullHouse + T;
                else
                    return fullHouse + charToInt(card3.charAt(0));


        if (Collections.frequency(suits, card1.charAt(1)) == 5)
            for(int i = order.length()-1; i >= 0; i--)
                if(value.contains(order.charAt(i)))
                    if(order.charAt(i) == 'A')
                        return flush + A;
                    else if(order.charAt(i) == 'K')
                        return flush + K;
                    else if(order.charAt(i) == 'Q')
                        return flush + Q;
                    else if(order.charAt(i) == 'J')
                        return flush + J;
                    else if(order.charAt(i) == 'T')
                        return flush + T;
                    else
                        return flush + charToInt(order.charAt(i));

        for(int i = 0; i < order.length()-4; i++)
            if(value.contains(order.charAt(i))  && value.contains(order.charAt(i+1))  && value.contains(order.charAt(i+2))  &&
                    value.contains(order.charAt(i+3))  && value.contains(order.charAt(i+4)))
                for(int j = order.length()-1; j >= 0; j--)
                    if(value.contains(order.charAt(j)))
                        if(order.charAt(j) == 'A')
                            return straight + A;
                        else if (order.charAt(j) == 'K')
                            return straight + K;
                        else if (order.charAt(j) == 'Q')
                            return straight + Q;
                        else if (order.charAt(j) == 'J')
                            return straight + J;
                        else if (order.charAt(j) == 'T')
                            return straight + T;
                        else
                            return straight + charToInt(order.charAt(j));

        if (Collections.frequency(value, card1.charAt(0)) == 3)
            if(card1.charAt(0) == 'A')
                return threeOfAKind + A;
            else if(card1.charAt(0) == 'K')
                return threeOfAKind + K;
            else if(card1.charAt(0) == 'Q')
                return threeOfAKind + Q;
            else if(card1.charAt(0) == 'J')
                return threeOfAKind + J;
            else if(card1.charAt(0) == 'T')
                return threeOfAKind + T;
            else
                return threeOfAKind + charToInt(card1.charAt(0));

        if (Collections.frequency(value, card2.charAt(0)) == 3)
            if(card2.charAt(0) == 'A')
                return threeOfAKind + A;
            else if(card2.charAt(0) == 'K')
                return threeOfAKind + K;
            else if(card2.charAt(0) == 'Q')
                return threeOfAKind + Q;
            else if(card2.charAt(0) == 'J')
                return threeOfAKind + J;
            else if(card2.charAt(0) == 'T')
                return threeOfAKind + T;
            else
                return threeOfAKind + charToInt(card2.charAt(0));

        if (Collections.frequency(value, card3.charAt(0)) == 3)
            if(card3.charAt(0) == 'A')
                return threeOfAKind + A;
            else if(card3.charAt(0) == 'K')
                return threeOfAKind + K;
            else if(card3.charAt(0) == 'Q')
                return threeOfAKind + Q;
            else if(card3.charAt(0) == 'J')
                return threeOfAKind + J;
            else if(card3.charAt(0) == 'T')
                return threeOfAKind + T;
            else
                return threeOfAKind + charToInt(card3.charAt(0));


        ArrayList<Integer> frequency = new ArrayList<>();
        frequency.add(Collections.frequency(value, card1.charAt(0)));
        frequency.add(Collections.frequency(value, card2.charAt(0)));
        frequency.add(Collections.frequency(value, card3.charAt(0)));
        frequency.add(Collections.frequency(value, card4.charAt(0)));
        frequency.add(Collections.frequency(value, card5.charAt(0)));
        if (Collections.frequency(frequency, 2) == 4)
            for(int i = order.length()-1; i >= 0; i--)
                if(value.contains(order.charAt(i)) && Collections.frequency(value, order.charAt(i)) == 2)
                    if(order.charAt(i) == 'A')
                        return twoPairs + A;
                    else if(order.charAt(i) == 'K')
                        return twoPairs + K;
                    else if(order.charAt(i) == 'Q')
                        return twoPairs + Q;
                    else if(order.charAt(i) == 'J')
                        return twoPairs + J;
                    else if(order.charAt(i) == 'T')
                        return twoPairs + T;
                    else
                        return twoPairs + charToInt(order.charAt(i));

        if (Collections.frequency(value, card1.charAt(0)) == 2)
            for(int i = order.length()-1; i >= 0; i--)
                if(value.contains(order.charAt(i)))
                    if(order.charAt(i) == 'A')
                        return onePair + A;
                    else if(order.charAt(i) == 'K')
                        return onePair + K;
                    else if(order.charAt(i) == 'Q')
                        return onePair + Q;
                    else if(order.charAt(i) == 'J')
                        return onePair + J;
                    else if(order.charAt(i) == 'T')
                        return onePair + T;
                    else
                        return onePair + charToInt(order.charAt(i));

        if (Collections.frequency(value, card2.charAt(0)) == 2)
            for(int i = order.length()-1; i >= 0; i--)
                if(value.contains(order.charAt(i)))
                    if(order.charAt(i) == 'A')
                        return onePair + A;
                    else if(order.charAt(i) == 'K')
                        return onePair + K;
                    else if(order.charAt(i) == 'Q')
                        return onePair + Q;
                    else if(order.charAt(i) == 'J')
                        return onePair + J;
                    else if(order.charAt(i) == 'T')
                        return onePair + T;
                    else
                        return onePair + charToInt(order.charAt(i));

        if (Collections.frequency(value, card3.charAt(0)) == 2)
            for(int i = order.length()-1; i >= 0; i--)
                if(value.contains(order.charAt(i)))
                    if(order.charAt(i) == 'A')
                        return onePair + A;
                    else if(order.charAt(i) == 'K')
                        return onePair + K;
                    else if(order.charAt(i) == 'Q')
                        return onePair + Q;
                    else if(order.charAt(i) == 'J')
                        return onePair + J;
                    else if(order.charAt(i) == 'T')
                        return onePair + T;
                    else
                        return onePair + charToInt(order.charAt(i));

        if (Collections.frequency(value, card4.charAt(0)) == 2)
            for(int i = order.length()-1; i >= 0; i--)
                if(value.contains(order.charAt(i)))
                    if(order.charAt(i) == 'A')
                        return onePair + A;
                    else if(order.charAt(i) == 'K')
                        return onePair + K;
                    else if(order.charAt(i) == 'Q')
                        return onePair + Q;
                    else if(order.charAt(i) == 'J')
                        return onePair + J;
                    else if(order.charAt(i) == 'T')
                        return onePair + T;
                    else
                        return onePair + charToInt(order.charAt(i));


        // Returns high card
        for(int i = order.length() - 1; i >= 0; i--)
            if(value.contains(order.charAt(i)))
                if(order.charAt(i) == 'A')
                    return A;
                else if(order.charAt(i) == 'K')
                    return K;
                else if(order.charAt(i) == 'Q')
                    return Q;
                else if(order.charAt(i) == 'J')
                    return J;
                else if(order.charAt(i) == 'T')
                    return T;
                else
                    return charToInt(order.charAt(i));

        return handValue;

    }
}
