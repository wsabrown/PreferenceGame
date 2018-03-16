package ru.wkn.preferencegame.model;

import ru.wkn.preferencegame.model.abstractgamer.AbstractGamerImpl;
import ru.wkn.preferencegame.model.abstractgamer.IFactory;
import ru.wkn.preferencegame.model.abstractgamer.gamer.gameunit.Deck;
import ru.wkn.preferencegame.model.abstractgamer.gamer.gameunit.Desk;
import ru.wkn.preferencegame.model.abstractgamer.gamer.gameunit.GamerContract;
import ru.wkn.preferencegame.model.processes.EndGame;
import ru.wkn.preferencegame.model.processes.StartGame;
import ru.wkn.preferencegame.model.processes.Trade;

import java.util.List;
import java.util.Objects;

public class GameInitiator {

    private Desk desk;
    private Deck deck;
    private IFactory factory;

    public GameInitiator(Desk desk, Deck deck, IFactory factory) {
        this.desk = desk;
        this.deck = deck;
        this.factory = factory;
    }

    public Desk getDesk() {
        return desk;
    }

    public Deck getDeck() {
        return deck;
    }

    public IFactory getFactory() {
        return factory;
    }

    public void gameInitialize(List<AbstractGamerImpl> gamers) {
        desk.getGamers().add(factory.createGamer(0, gamers.get(0).getName(), null));
        desk.getGamers().add(factory.createGamer(1, gamers.get(1).getName(), new GamerContract(0, 0, 0, 0, 0, 0, 0, 0, false, false)));
        desk.getGamers().add(factory.createGamer(2, gamers.get(2).getName(), new GamerContract(0, 0, 0, 0, 0, 0, 0, 0, false, false)));
        desk.getGamers().add(factory.createGamer(3, gamers.get(3).getName(), new GamerContract(0, 0, 0, 0, 0, 0, 0, 0, false, false)));
    }

    public void processGame() {
        StartGame startGame = new StartGame();
        Trade trade = new Trade();
        EndGame endGame = new EndGame();
        startGame.setStartGame(deck, desk.getGamers());
        //
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameInitiator that = (GameInitiator) o;
        return Objects.equals(desk, that.desk) &&
                Objects.equals(deck, that.deck) &&
                Objects.equals(factory, that.factory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desk, deck, factory);
    }

    @Override
    public String toString() {
        return "GameInitiator{" +
                "desk=" + desk +
                ", deck=" + deck +
                ", factory=" + factory +
                '}';
    }
}
