package ru.wkn.preferencegame.model.abstractgamer.gamer.gamerunit;

import ru.wkn.preferencegame.model.abstractgamer.gamer.gameunit.Card;

import java.util.Objects;
import java.util.Stack;

public class Hand {

    private Stack<Card> hand;

    public Hand(Stack<Card> hand) {
        this.hand = hand;
    }

    public Stack<Card> getHand() {
        return hand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hand hand1 = (Hand) o;
        return Objects.equals(hand, hand1.hand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hand);
    }

    @Override
    public String toString() {
        return "Hand{" +
                "hand=" + hand +
                '}';
    }
}
