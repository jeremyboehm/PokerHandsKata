package com.jboehm.pokerhands.rules;

import com.jboehm.pokerhands.Hand;
import com.jboehm.pokerhands.ranks.Rank;

public interface Rule {
    boolean canApply(Hand hand);

    Rank apply(Hand hand);
}
