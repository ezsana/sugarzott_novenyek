package com.codecool.sugarzott_novenyek;

public class Deltafa extends Noveny {

    Deltafa() {}

    Deltafa(String nev, int tapanyagMennyiseg) {
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
