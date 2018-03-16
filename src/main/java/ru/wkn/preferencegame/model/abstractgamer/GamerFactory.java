package ru.wkn.preferencegame.model.abstractgamer;

import ru.wkn.preferencegame.model.abstractgamer.gamer.Distributor;
import ru.wkn.preferencegame.model.abstractgamer.gamer.Gamer;
import ru.wkn.preferencegame.model.abstractgamer.gamer.gameunit.Card;
import ru.wkn.preferencegame.model.abstractgamer.gamer.gameunit.GamerContract;

import java.util.Stack;

public class GamerFactory implements IFactory {

    private Stack<Card> deck;

    public GamerFactory(Stack<Card> deck) {
        this.deck = deck;
    }

    @Override
    public AbstractGamerImpl createGamer(int ID, String name, GamerContract gamerContract) {
        Stack<Card> stockOrHand = new Stack<>();
        if (ID == 0) {
            for (int i = 0; i < 2; i++) {
                stockOrHand.add(this.deck.pop());
            }
            return new Distributor(ID, name, null, null);
        }
        else {
            for (int i = 0; i < 10; i++) {
                stockOrHand.add(this.deck.pop());
            }
            return new Gamer(ID, name, null, gamerContract);
        }
    }
}
