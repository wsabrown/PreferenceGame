package ru.wkn.preferencegame.model.abstractgamer.gamer.gameunit;

import java.util.Objects;

public class GamerContract {

    private int vista;
    private int rightVista;
    private int leftVista;
    private int hill;
    private int bullet;
    private int bribe;
    private int valueContract;
    private int colorContract;
    private boolean isContractor;
    private boolean isMiser;

    public GamerContract(int vista, int rightVista, int leftVista, int hill, int bullet, int bribe, int valueContract, int colorContract, boolean isContractor, boolean isMiser) {
        this.vista = vista;
        this.rightVista = rightVista;
        this.leftVista = leftVista;
        this.hill = hill;
        this.bullet = bullet;
        this.bribe = bribe;
        this.valueContract = valueContract;
        this.colorContract = colorContract;
        this.isContractor = isContractor;
        this.isMiser = isMiser;
    }

    public int getVista() {
        return vista;
    }

    public void setVista(int vista) {
        this.vista = vista;
    }

    public int getRightVista() {
        return rightVista;
    }

    public void setRightVista(int rightVista) {
        this.rightVista = rightVista;
    }

    public int getLeftVista() {
        return leftVista;
    }

    public void setLeftVista(int leftVista) {
        this.leftVista = leftVista;
    }

    public int getHill() {
        return hill;
    }

    public void setHill(int hill) {
        this.hill = hill;
    }

    public int getBullet() {
        return bullet;
    }

    public void setBullet(int bullet) {
        this.bullet = bullet;
    }

    public int getBribe() {
        return bribe;
    }

    public void setBribe(int bribe) {
        this.bribe = bribe;
    }

    public int getValueContract() {
        return valueContract;
    }

    public void setValueContract(int valueContract) {
        this.valueContract = valueContract;
    }

    public int getColorContract() {
        return colorContract;
    }

    public void setColorContract(int colorContract) {
        this.colorContract = colorContract;
    }

    public boolean isContractor() {
        return isContractor;
    }

    public void setContractor(boolean contractor) {
        isContractor = contractor;
    }

    public boolean isMiser() {
        return isMiser;
    }

    public void setMiser(boolean miser) {
        isMiser = miser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GamerContract that = (GamerContract) o;
        return vista == that.vista &&
                rightVista == that.rightVista &&
                leftVista == that.leftVista &&
                hill == that.hill &&
                bullet == that.bullet &&
                bribe == that.bribe &&
                valueContract == that.valueContract &&
                colorContract == that.colorContract &&
                isContractor == that.isContractor &&
                isMiser == that.isMiser;
    }

    @Override
    public int hashCode() {
        return Objects.hash(vista, rightVista, leftVista, hill, bullet, bribe, valueContract, colorContract, isContractor, isMiser);
    }

    @Override
    public String toString() {
        return "GamerContract{" +
                "vista=" + vista +
                ", rightVista=" + rightVista +
                ", leftVista=" + leftVista +
                ", hill=" + hill +
                ", bullet=" + bullet +
                ", bribe=" + bribe +
                ", valueContract=" + valueContract +
                ", colorContract=" + colorContract +
                ", isContractor=" + isContractor +
                ", isMiser=" + isMiser +
                '}';
    }
}
