package com.jboehm.pokerhands.ranks;

import com.jboehm.pokerhands.cards.Card;

import java.util.Objects;

public class Pair extends Rank {
    private final Card firstCard;
    private final Card secondCard;
    private final Card kicker;

    public Pair(int priority, Card firstCard, Card secondCard, Card kicker) {
        super(priority, firstCard);
        this.firstCard = firstCard;
        this.secondCard = secondCard;
        this.kicker = kicker;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return Objects.equals(firstCard, pair.firstCard) &&
                Objects.equals(secondCard, pair.secondCard) &&
                Objects.equals(kicker, pair.kicker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstCard, secondCard, kicker);
    }
}
