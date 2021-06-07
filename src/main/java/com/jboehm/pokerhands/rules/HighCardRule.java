package com.jboehm.pokerhands.rules;

import com.jboehm.pokerhands.Hand;
import com.jboehm.pokerhands.ranks.Rank;

public class HighCardRule implements Rule {
    @Override
    public boolean canApply(Hand hand) {
        return true;
    }

    @Override
    public Rank apply(Hand hand) {
        return Rank.highCard(hand.highestCard());
    }
}
