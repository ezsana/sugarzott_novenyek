package com.codecool.sugarzott_novenyek;

public class Puffancs extends Noveny {

    Puffancs() {}

    Puffancs(String nev, int tapanyagMennyiseg) {
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
        } else if (s == Sugarzas.ALFA) {
            tapanyagMennyiseg += 2;
        } else if (s == Sugarzas.DELTA) {
            tapanyagMennyiseg -= 2;
        }
        if (tapanyagMennyiseg > 10 || tapanyagMennyiseg <= 0) {
            bolygo.addHalottNoveny(this);
        } else {
            influenceNextDayAlfaSugarzas(10 - tapanyagMennyiseg);
        }
    }
}
