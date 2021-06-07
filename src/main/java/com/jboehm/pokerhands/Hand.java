package com.jboehm.pokerhands;

import com.jboehm.pokerhands.cards.Card;

import java.util.Arrays;
import java.util.List;

public class Hand {

    private final Card card1;
    private final Card card2;
    private final Card card3;
    private final Card card4;
    private final Card card5;

    public Hand(Card card1, Card card2, Card card3, Card card4, Card card5) {
        this.card1 = card1;
        this.card2 = card2;
        this.card3 = card3;
        this.card4 = card4;
        this.card5 = card5;
    }

    public Card highestCard() {
        List<Card> cards = cardsToList(card1, card2, card3, card4, card5);
        return cards.stream().max(Card::compareTo).get();
    }

    private List<Card> cardsToList(Card card1, Card card2, Card card3, Card card4, Card card5) {
        return Arrays.asList(card1, card2, card3, card4, card5);
    }

}
