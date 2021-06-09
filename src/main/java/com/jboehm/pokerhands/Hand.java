package com.jboehm.pokerhands;

import com.jboehm.pokerhands.cards.Card;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class Hand {

    private final List<Card> cards;

    public Hand(Card card1, Card card2, Card card3, Card card4, Card card5) {
        this.cards = asList(card1, card2, card3, card4, card5);
    }

    public Card highestCard() {
        return cards.stream().max(Card::compareTo).get();
    }

    public boolean hasTwoCardsWithTheSameValue() {

        return IntStream.range(0, cards.size())
                .anyMatch(i -> IntStream.range(i + 1, cards.size())
                        .anyMatch(j -> cards.get(i).getCardValue().getAssociatedValue()
                                .equals(cards.get(j).getCardValue().getAssociatedValue())
                        )
                );
    }

    public List<Card> selectTwoCardsWithTheSameValue() {
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
        return cards.stream()
                .filter(card -> !asList(cardsToExclude).contains(card))
                .collect(toList());
    }

}
