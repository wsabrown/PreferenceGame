package ru.wkn.preferencegame.model.abstractgamer.gamer.abstractstrategy.strategies;

import ru.wkn.preferencegame.model.abstractgamer.IGamer;
import ru.wkn.preferencegame.model.abstractgamer.gamer.Gamer;
import ru.wkn.preferencegame.model.abstractgamer.gamer.abstractstrategy.GameStrategy;
import ru.wkn.preferencegame.model.abstractgamer.gamer.gameunit.Card;

import java.util.List;

public class Passing implements GameStrategy {

    @Override
    public List<String> run(List<IGamer> gamers, List<String> sequenceOfSteps) {
        return null;
    }

    @Override
    public void comparisonCards(List<Card> cards, List<Gamer> gamers) {
        //
    }
}
