package com.jboehm.pokerhands.rules;

import com.jboehm.pokerhands.Hand;
import com.jboehm.pokerhands.cards.Card;
import com.jboehm.pokerhands.ranks.Rank;

import java.util.List;

public class PairRule implements Rule {
    @Override
    public boolean canApply(Hand hand) {
        return hand.hasTwoCardsWithTheSameValue();
    }

    @Override
    public Rank apply(Hand hand) {
        List<Card> twoCardsWithTheSameValue = hand.selectTwoCardsWithTheSameValue();
        List<Card> kickers = hand.allCardsExcept(twoCardsWithTheSameValue.get(0), twoCardsWithTheSameValue.get(1));
        Card highestKicker = kickers.stream().max(Card::compareTo).get();
        return Rank.pair(twoCardsWithTheSameValue.get(0), twoCardsWithTheSameValue.get(1), highestKicker);
    }
}
