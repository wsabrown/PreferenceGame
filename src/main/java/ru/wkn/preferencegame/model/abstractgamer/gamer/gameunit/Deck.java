package ru.wkn.preferencegame.model.abstractgamer.gamer.gameunit;

import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class Deck {

    private Stack<Card> deck;

    public Deck(Stack<Card> deck) {
        this.deck = deck;
    }

    public List<Card> getDeck() {
        return deck;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deck deck1 = (Deck) o;
        return Objects.equals(deck, deck1.deck);
    }

    @Override
    public int hashCode() {

        return Objects.hash(deck);
    }

    @Override
    public String toString() {
        return "Deck{" +
                "deck=" + deck +
                '}';
    }
}
