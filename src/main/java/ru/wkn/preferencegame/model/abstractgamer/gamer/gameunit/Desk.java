package ru.wkn.preferencegame.model.abstractgamer.gamer.gameunit;

import ru.wkn.preferencegame.model.abstractgamer.AbstractGamerImpl;
import ru.wkn.preferencegame.model.abstractgamer.IGamer;
import ru.wkn.preferencegame.model.abstractgamer.gamer.abstractstrategy.GameStrategy;

import java.util.List;
import java.util.Objects;

public class Desk {

    private List<AbstractGamerImpl> gamers;
    private Contract contract;
    private GameStrategy gameStrategy;

    public Desk(List<AbstractGamerImpl> gamers, Contract contract, GameStrategy gameStrategy) {
        this.gamers = gamers;
        this.contract = contract;
        this.gameStrategy = gameStrategy;
    }

    public List<AbstractGamerImpl> getGamers() {
        return gamers;
    }

    public Contract getContract() {
        return contract;
    }

    public GameStrategy getGameStrategy() {
        return gameStrategy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Desk desk = (Desk) o;
        return Objects.equals(gamers, desk.gamers) &&
                Objects.equals(contract, desk.contract) &&
                Objects.equals(gameStrategy, desk.gameStrategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gamers, contract, gameStrategy);
    }

    @Override
    public String toString() {
        return "Desk{" +
                "gamers=" + gamers +
                ", contract=" + contract +
                ", gameStrategy=" + gameStrategy +
                '}';
    }
}
