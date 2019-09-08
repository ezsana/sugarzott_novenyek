package com.codecool.sugarzott_novenyek;

public class Deltafa extends Noveny {

    Deltafa() {}

    Deltafa(String nev, int tapanyagMennyiseg) {
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
            tapanyagMennyiseg -= 3;
        } else if (s == Sugarzas.DELTA) {
            tapanyagMennyiseg += 4;
        }
        if (tapanyagMennyiseg > 0 && tapanyagMennyiseg < 5) {
            influenceNextDayDeltaSugarzas(4);
        } else if (tapanyagMennyiseg >= 5 && tapanyagMennyiseg < 10) {
            influenceNextDayDeltaSugarzas(1);
        } else if (tapanyagMennyiseg > 10) {
            influenceNextDayDeltaSugarzas(0);
        } else if (tapanyagMennyiseg <= 0){
            bolygo.addHalottNoveny(this);
        }
    }
}