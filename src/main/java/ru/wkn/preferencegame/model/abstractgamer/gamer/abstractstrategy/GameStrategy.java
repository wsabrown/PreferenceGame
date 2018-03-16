package ru.wkn.preferencegame.model.abstractgamer.gamer.abstractstrategy;

import ru.wkn.preferencegame.model.abstractgamer.IGamer;
import ru.wkn.preferencegame.model.abstractgamer.gamer.Gamer;
import ru.wkn.preferencegame.model.abstractgamer.gamer.gameunit.Card;

import java.util.List;

public interface GameStrategy {

    List<String> run(List<IGamer> gamers, List<String> sequenceOfSteps);

    void comparisonCards(List<Card> cards, List<Gamer> gamers);
}
