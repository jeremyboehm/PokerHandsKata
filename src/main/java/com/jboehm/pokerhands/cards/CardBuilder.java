package com.jboehm.pokerhands.cards;

import static com.jboehm.pokerhands.cards.CardValue.*;

public class CardBuilder {

    public static Card twoOf(Suit suit) {
        return new Card(TWO, suit);
    }

    public static Card threeOf(Suit suit) {
        return new Card(THREE, suit);
    }

    public static Card fourOf(Suit suit) {
        return new Card(FOUR, suit);
    }

    public static Card fiveOf(Suit suit) {
        return new Card(FIVE, suit);
    }

    public static Card sixOf(Suit suit) {
        return new Card(SIX, suit);
    }

    public static Card sevenOf(Suit suit) {
        return new Card(SEVEN, suit);
    }

    public static Card eightOf(Suit suit) {
        return new Card(EIGHT, suit);
    }

    public static Card nineOf(Suit suit) {
        return new Card(NINE, suit);
    }

    public static Card tenOf(Suit suit) {
        return new Card(TEN, suit);
    }

    public static Card jackOf(Suit suit) {
        return new Card(JACK, suit);
    }

    public static Card queenOf(Suit suit) {
        return new Card(QUEEN, suit);
    }

    public static Card kingOf(Suit suit) {
        return new Card(KING, suit);
    }

    public static Card aceOf(Suit suit) {
        return new Card(ACE, suit);
    }

}
