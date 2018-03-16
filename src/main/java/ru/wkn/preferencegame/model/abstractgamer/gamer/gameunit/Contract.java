package ru.wkn.preferencegame.model.abstractgamer.gamer.gameunit;

import java.util.List;
import java.util.Objects;

public class Contract {

    private List<GamerContract> contract;

    public Contract(List<GamerContract> contract) {
        this.contract = contract;
    }

    public List<GamerContract> getContract() {
        return contract;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contract contract1 = (Contract) o;
        return Objects.equals(contract, contract1.contract);
    }

    @Override
    public int hashCode() {

        return Objects.hash(contract);
    }

    @Override
    public String toString() {
        return "ContractBribes{" +
                "contract=" + contract +
                '}';
    }
}
