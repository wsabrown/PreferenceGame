package ru.wkn.preferencegame.model.processes;

import ru.wkn.preferencegame.model.abstractgamer.gamer.Gamer;

import java.util.Arrays;

public class EndGame {

    public void refreshBribes(Gamer gamer1, Gamer gamer2, Gamer gamer3) {
        gamer1.getContract().setBribe(0);
        gamer2.getContract().setBribe(0);
        gamer3.getContract().setBribe(0);
    }

    public void countVistaForBots(Gamer gamer1, Gamer gamer2, Gamer gamer3) {
        int[] arrayHills = {gamer1.getContract().getHill(), gamer2.getContract().getHill(), gamer3.getContract().getHill()};
        int minHill = Arrays.stream(arrayHills).min().getAsInt();
        if (gamer1.getContract().getHill() == minHill) {
            countVista(gamer1, gamer2, gamer3);
        }
        if (gamer2.getContract().getHill() == minHill) {
            countVista(gamer2, gamer1, gamer3);
        }
        if (gamer3.getContract().getHill() == minHill) {
            countVista(gamer3, gamer1, gamer2);
        }

    }

    private void countVista(Gamer gamerWithMinHill, Gamer gamer2, Gamer gamer3) {
        gamer2.getContract().setHill(gamer2.getContract().getHill() - gamerWithMinHill.getContract().getHill());
        gamer3.getContract().setHill(gamer3.getContract().getHill() - gamerWithMinHill.getContract().getHill());
        int leftVista = (gamer2.getContract().getHill() * 10) / 3;
        int rightVista = (gamer3.getContract().getHill() * 10) / 3;
        gamerWithMinHill.getContract().setLeftVista(leftVista);
        gamer3.getContract().setLeftVista(leftVista);
        gamerWithMinHill.getContract().setRightVista(rightVista);
        gamer2.getContract().setLeftVista(rightVista);
        count(gamerWithMinHill, gamer3, gamer2, rightVista, leftVista);
        count(gamerWithMinHill, gamer2, gamer3, leftVista, rightVista);
    }

    private void count(Gamer gamerWithMinHill, Gamer gamer2, Gamer gamer3, int leftVista, int rightVista) {
        if (rightVista > leftVista) {
            int difference = rightVista - leftVista;
            gamer2.getContract().setVista(difference);
            gamer3.getContract().setVista(-difference);
            gamerWithMinHill.getContract().setVista(gamerWithMinHill.getContract().getLeftVista() + gamerWithMinHill.getContract().getRightVista());
        }
    }
}
