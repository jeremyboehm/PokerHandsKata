package com.jboehm.pokerhands;

import com.jboehm.pokerhands.ranks.Rank;
import com.jboehm.pokerhands.rules.HighCardRule;
import com.jboehm.pokerhands.rules.Rule;

import java.util.List;

import static java.util.Arrays.asList;

public class Game {

    private final List<Rule> rules = asList(
            new HighCardRule()
    );

    public Rank detectBestRuleToBeApplied(Hand hand) {
        return rules.stream()
                .filter(rule -> rule.canApply(hand))
                .map(rule -> rule.apply(hand))
                .max(Rank::compareTo)
                .orElse(null);
    }
}
