package com.codecool.sugarzott_novenyek;

import java.util.ArrayList;
import java.util.List;

public class Bolygo {

    private List<Noveny> novenyek = new ArrayList<>();
    private List<Noveny> halottNovenyek = new ArrayList<>();

    private int sugarzasAlfaIgeny = 0;
    private int sugarzasDeltaIgeny = 0;

    private Sugarzas napiSugarzas = Sugarzas.NONE;

    private int days;

    private static Bolygo instance = null;

    private Bolygo() {}

    public static Bolygo getInstance() {
        if (instance == null) {
            instance = new Bolygo();
        }
        return instance;
    }

    void setdays(int days) {
        this.days = days;
    }

    void addNoveny(Noveny noveny) {
        novenyek.add(noveny);
    }

    void addHalottNoveny(Noveny noveny) {
        halottNovenyek.add(noveny);
    }

    void changeAlfaSugarzasIgeny(int igeny) {
        sugarzasAlfaIgeny += igeny;
    }

    void changeDeltaSugarzasIgeny(int igeny) {
        sugarzasDeltaIgeny += igeny;
    }

    Sugarzas getNapiSugarzas() {
        if (sugarzasAlfaIgeny >= sugarzasDeltaIgeny + 3) {
            napiSugarzas = Sugarzas.ALFA;
        } else if (sugarzasDeltaIgeny >= sugarzasAlfaIgeny + 3) {
            napiSugarzas = Sugarzas.DELTA;
        } else {
            napiSugarzas = Sugarzas.NONE;
        }
        return napiSugarzas;
    }

    void removeNoveny(Noveny noveny) {
        novenyek.remove(noveny);
    }

    void simulate() {
        for (int i = 0; i < days; i++) {
            Sugarzas s = getNapiSugarzas();
            halottNovenyek.clear();
            System.out.println("A(z)" + (i+1) + ". nap sugárzása: " + s.toString() + ", mert alfa=" + sugarzasAlfaIgeny + ", delta=" + sugarzasDeltaIgeny + ".");
            for (Noveny n : novenyek) {
                System.out.println(n.toString());
                n.tapanyagValtozas(s);
            }
            for (Noveny hn : halottNovenyek) {
                System.out.println(hn + " Ezért sajnos elpusztult.");
            }
            novenyek.removeAll(halottNovenyek);
            System.out.println("A(z) " + (i+1) + ". nap véget ért.");
        }
    }

}
