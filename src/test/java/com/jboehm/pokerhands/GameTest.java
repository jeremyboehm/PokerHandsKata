package com.jboehm.pokerhands;

import com.jboehm.pokerhands.ranks.Rank;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import static com.jboehm.pokerhands.cards.CardBuilder.*;
import static com.jboehm.pokerhands.cards.Suit.*;

public class GameTest {

    private final Game game = new Game();

    @Test
    public void should_report_a_high_card_rule() {
        Hand hand = new Hand(nineOf(SPADES), threeOf(CLUBS), kingOf(HEARTS), fourOf(DIAMONDS), eightOf(HEARTS));
        Rank result = Rank.highCard(kingOf(HEARTS));
        Assertions.assertThat(result).isEqualTo(game.detectBestRuleToBeApplied(hand));
    }
}
