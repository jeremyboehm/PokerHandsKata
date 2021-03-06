package com.jboehm.pokerhands.ranks;

import com.jboehm.pokerhands.cards.Card;

public abstract class Rank implements Comparable<Rank> {

    private final int priority;
    private final Card highestCard;

    public Rank(int priority, Card highestCard) {

        this.priority = priority;
        this.highestCard = highestCard;
    }

    public static Rank highCard(Card highestCard) {
        return new HighCard(1, highestCard);
    }

    public static Rank pair(Card firstCard, Card secondCard, Card kicker) {
        return new Pair(2, firstCard, secondCard, kicker);
    }

    @Override
    public int compareTo(Rank other) {
        return Integer.compare(priority, other.priority);
    }
}
