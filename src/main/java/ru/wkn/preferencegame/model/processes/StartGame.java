package ru.wkn.preferencegame.model.processes;

import ru.wkn.preferencegame.model.abstractgamer.AbstractGamerImpl;
import ru.wkn.preferencegame.model.abstractgamer.gamer.gameunit.Deck;

import java.util.Collections;
import java.util.List;

public class StartGame {

    public void setStartGame(Deck deck, List<AbstractGamerImpl> gamers) {
        Collections.shuffle(deck.getDeck());
        for (int i = 0; i < 10; i++) {
            gamers.get(1).getHand().getHand().add(deck.getDeck().get(i));
        }
        for (int i = 10; i < 20; i++) {
            gamers.get(2).getHand().getHand().add(deck.getDeck().get(i));
        }
        for (int i = 20; i < 30; i++) {
            gamers.get(3).getHand().getHand().add(deck.getDeck().get(i));
        }
        for (int i = 30; i < 32; i++) {
            gamers.get(0).getHand().getHand().add(deck.getDeck().get(i));
        }
    }
}
