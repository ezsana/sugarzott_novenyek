package com.codecool.sugarzott_novenyek;

public class Main {

    private static final int puffancsSzam = 5;
    private static final int deltafaSzam = 3;
    private static final int parabokorSzam = 2;

    public static void main(String[] args) {
        Bolygo bolygo = new Bolygo();
        for ( int i = 0; i < puffancsSzam; i++) {
            bolygo.addNoveny(new Puffancs("Pufi#"+i, 3+i));
        }
        for ( int i = 0; i < deltafaSzam; i++) {
            bolygo.addNoveny(new Deltafa("Delta#"+i, 1+i));
        }
        for ( int i = 0; i < parabokorSzam; i++) {
            bolygo.addNoveny(new Parabokor("Pari#"+i, 7+i));
        }
        bolygo.simulate();
    }

}
