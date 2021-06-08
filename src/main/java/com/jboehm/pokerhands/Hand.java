package com.jboehm.pokerhands;

import com.jboehm.pokerhands.cards.Card;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

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

    public boolean hasTwoCardsWithTheSameValue() {
        List<Card> cards = cardsToList(card1, card2, card3, card4, card5);

        return IntStream.range(0, cards.size())
                .anyMatch(i -> IntStream.range(i + 1, cards.size())
                        .anyMatch(j -> cards.get(i).getCardValue().getAssociatedValue()
                                .equals(cards.get(j).getCardValue().getAssociatedValue())
                        )
                );
    }

    public List<Card> selectTwoCardsWithTheSameValue() {
        List<Card> cards = cardsToList(card1, card2, card3, card4, card5);
        for (int i = 0; i < cards.size(); i++) {
            for (int j = i+1; j < cards.size(); j++) {
                if (cards.get(i).getCardValue().getAssociatedValue().equals(cards.get(j).getCardValue().getAssociatedValue())) {
                    return Arrays.asList(cards.get(i), cards.get(j));
                }
            }
        }
        return Collections.emptyList();
    }

    public List<Card> allCardsExcept(Card... cardsToExclude) {
        List<Card> cards = cardsToList(card1, card2, card3, card4, card5);
        return cards.stream()
                .filter(card -> !asList(cardsToExclude).contains(card))
                .collect(toList());
    }

    private List<Card> cardsToList(Card card1, Card card2, Card card3, Card card4, Card card5) {
        return Arrays.asList(card1, card2, card3, card4, card5);
    }

}
