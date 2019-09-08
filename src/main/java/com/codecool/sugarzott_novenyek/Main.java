package com.codecool.sugarzott_novenyek;

public class Main {

    private static final int puffancsSzam =2;
    private static final int deltafaSzam = 3;
    private static final int parabokorSzam = 4;

    public static void main(String[] args) {
        Bolygo bolygo = Bolygo.getInstance();
        bolygo.setdays(100);
        for ( int i = 0; i < puffancsSzam; i++) {
            bolygo.addNoveny(new Puffancs("Pufi#"+i, 9+i));
        }
        for ( int i = 0; i < deltafaSzam; i++) {
            bolygo.addNoveny(new Deltafa("Delta#"+i, 3+i));
        }
        for ( int i = 0; i < parabokorSzam; i++) {
            bolygo.addNoveny(new Parabokor("Pari#"+i, 1+i));
        }
        bolygo.simulate();
    }

}
