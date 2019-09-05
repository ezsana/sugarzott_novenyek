package com.codecool.sugarzott_novenyek;

import java.util.ArrayList;
import java.util.List;

public class Bolygo {

    List<Noveny> novenyek = new ArrayList<>();
    int sugarzasAlfa = 0;
    int sugarzasDelta = 0;
    Sugarzas napiSugarzas = Sugarzas.NONE; // ez a kezdőérték;

    void addNoveny(Noveny noveny) {
        novenyek.add(noveny);
    }

    void changeSugarzas() {
        if (sugarzasAlfa + 3 >= sugarzasDelta) {
            napiSugarzas = Sugarzas.ALFA;
        } else if (sugarzasDelta + 3 >= sugarzasAlfa) {
            napiSugarzas = Sugarzas.DELTA;
        } else {
            napiSugarzas = Sugarzas.NONE;
        }
    }

    void simulate() {}

}
