package com.codecool.sugarzott_novenyek;

public class Puffancs extends Noveny {

    Puffancs() {}

    Puffancs(String nev, int tapanyagMennyiseg) {
        this.nev = nev;
        this.tapanyagMennyiseg = tapanyagMennyiseg;
        if (tapanyagMennyiseg <= 0) {
            elo = false;
        }
    }

    @Override
    int tapanyagfelvetel() {
        return 0;
    }

    @Override
    void setSugarzasAlfa() {}

    @Override
    void setSugarzasDelta() {}
}
