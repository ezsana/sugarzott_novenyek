package com.codecool.sugarzott_novenyek;

public abstract class Noveny {

    String nev;
    int tapanyagMennyiseg;
    boolean elo = true;
    Bolygo bolygo = new Bolygo();

    abstract int tapanyagfelvetel();

    abstract void setSugarzasAlfa();

    abstract void setSugarzasDelta();

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public boolean getElo() {
        return this.elo;
    }


    public int getTapanyagMennyiseg() {
        if (tapanyagMennyiseg <= 0) {
            elo = false;
        }
        return this.tapanyagMennyiseg;
    }

    public void setTapanyagMennyiseg(int tapanyagMennyiseg) {
        if (tapanyagMennyiseg < 0) {
            elo = false;
        }
        this.tapanyagMennyiseg = tapanyagMennyiseg;
    }



}
