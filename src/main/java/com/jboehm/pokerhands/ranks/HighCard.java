package com.jboehm.pokerhands.ranks;

import com.jboehm.pokerhands.cards.Card;

import java.util.Objects;

public class HighCard extends Rank {
    private final Card highestCard;

    public HighCard(int priority, Card highestCard) {
        super(priority, highestCard);
        this.highestCard = highestCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HighCard highCard = (HighCard) o;
        return Objects.equals(highestCard, highCard.highestCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(highestCard);
    }
}
