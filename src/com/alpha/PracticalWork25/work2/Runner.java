package com.alpha.PracticalWork25.work2;

import java.util.Arrays;

public class Runner {

    public void run() {

        Card[][] deck = new Card[Suit.values().length][Rank.values().length];
        Arrays.stream(Suit.values()).forEach(suit -> {
            Arrays.stream(Rank.values()).forEach(rank -> deck[suit.ordinal()][rank.ordinal()] = new Card(suit, rank));
        });

        Arrays.stream(Suit.values()).forEach(suit -> {
            Arrays.stream(Rank.values()).forEach(rank -> System.out.println(deck[suit.ordinal()][rank.ordinal()]));
        });
    };
}
