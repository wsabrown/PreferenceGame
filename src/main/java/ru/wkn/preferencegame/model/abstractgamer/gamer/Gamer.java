package ru.wkn.preferencegame.model.abstractgamer.gamer;

import ru.wkn.preferencegame.model.abstractgamer.AbstractGamerImpl;
import ru.wkn.preferencegame.model.abstractgamer.gamer.gamerunit.Hand;
import ru.wkn.preferencegame.model.abstractgamer.gamer.gameunit.GamerContract;

import java.util.Objects;

public class Gamer extends AbstractGamerImpl {

    private Hand hand;
    private GamerContract gamerContract;

    public Gamer(int ID, String name, Hand hand, GamerContract gamerContract) {
        super(ID, name);
        this.hand = hand;
        this.gamerContract = gamerContract;
    }

    @Override
    public Hand getHand() {
        return hand;
    }

    public GamerContract getContract() {
        return gamerContract;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Gamer gamer = (Gamer) o;
        return Objects.equals(hand, gamer.hand) &&
                Objects.equals(gamerContract, gamer.gamerContract);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hand, gamerContract);
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "hand=" + hand +
                ", gamerContract=" + gamerContract +
                '}';
    }
}
