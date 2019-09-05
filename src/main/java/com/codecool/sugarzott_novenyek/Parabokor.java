package com.codecool.sugarzott_novenyek;

public class Parabokor extends Noveny {

    Parabokor() {}

    Parabokor(String nev, int tapanyagMennyiseg) {
        this.nev = nev;
        this.tapanyagMennyiseg = tapanyagMennyiseg;
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
