package ru.wkn.preferencegame.model.abstractgamer;

import ru.wkn.preferencegame.model.abstractgamer.gamer.gameunit.GamerContract;

public interface IFactory {

    AbstractGamerImpl createGamer(int ID, String name, GamerContract gamerContract);
}
