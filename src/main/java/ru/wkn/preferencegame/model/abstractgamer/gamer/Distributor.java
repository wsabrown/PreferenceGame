package ru.wkn.preferencegame.model.abstractgamer.gamer;

import ru.wkn.preferencegame.model.abstractgamer.AbstractGamerImpl;
import ru.wkn.preferencegame.model.abstractgamer.gamer.gamerunit.Hand;
import ru.wkn.preferencegame.model.abstractgamer.gamer.gameunit.Deck;

import java.util.Objects;

public class Distributor extends AbstractGamerImpl {

    private Hand stock;
    private Deck deck;

    public Distributor(int ID, String name, Hand stock, Deck deck) {
        super(ID, name);
        this.stock = stock;
        this.deck = deck;
    }

    @Override
    public Hand getHand() {
        return stock;
    }

    public void setStock(Hand stock) {
        this.stock = stock;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Distributor that = (Distributor) o;
        return Objects.equals(stock, that.stock) &&
                Objects.equals(deck, that.deck);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), stock, deck);
    }

    @Override
    public String toString() {
        return super.toString() +
                " + Distributor{" +
                "stock=" + stock +
                ", deck=" + deck +
                '}';
    }
}
