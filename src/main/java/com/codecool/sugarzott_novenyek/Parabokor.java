package com.codecool.sugarzott_novenyek;

public class Parabokor extends Noveny {

    Parabokor() {}

    Parabokor(String nev, int tapanyagMennyiseg) {
        this.nev = nev;
        this.tapanyagMennyiseg = tapanyagMennyiseg;
        if (tapanyagMennyiseg <= 0) {
            bolygo.addHalottNoveny(this);
        }
    }

    @Override
    void tapanyagValtozas(Sugarzas s) {
        if (s == Sugarzas.NONE) {
            tapanyagMennyiseg -= 1;
        } else if (s == Sugarzas.ALFA || s == Sugarzas.DELTA) {
            tapanyagMennyiseg += 1;
        }
        if (tapanyagMennyiseg <= 0) {
            bolygo.addHalottNoveny(this);
        }
    }
}
