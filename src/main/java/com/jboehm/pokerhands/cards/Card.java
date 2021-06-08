package com.jboehm.pokerhands.cards;

import java.util.Objects;

public class Card implements Comparable<Card> {
    private final CardValue cardValue;
    private final Suit suit;

    public Card(CardValue cardValue, Suit suit) {
        this.cardValue = cardValue;
        this.suit = suit;
    }

    public CardValue getCardValue() {
        return cardValue;
    }

    @Override
    public int compareTo(Card cardToCompare) {
        return cardValue.getAssociatedValue().compareTo(cardToCompare.cardValue.getAssociatedValue());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return cardValue == card.cardValue &&
                suit == card.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardValue, suit);
    }

}
