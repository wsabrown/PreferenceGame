package ru.wkn.preferencegame.model.abstractgamer;

import ru.wkn.preferencegame.model.abstractgamer.gamer.gamerunit.Hand;

import java.util.Objects;

public abstract class AbstractGamerImpl implements IGamer {

    private int ID;
    private String name;

    public AbstractGamerImpl(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public abstract Hand getHand();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractGamerImpl that = (AbstractGamerImpl) o;
        return ID == that.ID &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name);
    }

    @Override
    public String toString() {
        return "AbstractGamerImpl{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }
}
