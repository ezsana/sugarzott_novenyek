package com.codecool.sugarzott_novenyek;

public abstract class Noveny {

    String nev;
    int tapanyagMennyiseg;
    Bolygo bolygo = Bolygo.getInstance();

    abstract void tapanyagValtozas(Sugarzas s);

    void influenceNextDayAlfaSugarzas(int alfaEgyseg) {
        bolygo.changeAlfaSugarzasIgeny(alfaEgyseg);
    }

    void influenceNextDayDeltaSugarzas(int deltaEgyseg) {
        bolygo.changeDeltaSugarzasIgeny(deltaEgyseg);
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getTapanyagMennyiseg() {
        return this.tapanyagMennyiseg;
    }

    public void setTapanyagMennyiseg(int tapanyagMennyiseg) {
        this.tapanyagMennyiseg = tapanyagMennyiseg;
    }

    @Override
    public String toString() {
        return "A növény neve: " + this.getNev() + ", tápanyaga: " + this.getTapanyagMennyiseg() + " egység.";
    }
}
