package ru.wkn.preferencegame.model.abstractgamer.gamer.gameunit;

import java.util.Objects;

public class Card {

    private String value;
    private String suit;

    public Card(String value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public String getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(value, card.value) &&
                Objects.equals(suit, card.suit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, suit);
    }

    @Override
    public String toString() {
        return "Card{" +
                "value='" + value + '\'' +
                ", suit='" + suit + '\'' +
                '}';
    }
}
