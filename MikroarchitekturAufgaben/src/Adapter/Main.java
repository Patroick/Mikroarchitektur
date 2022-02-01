package Adapter;

public class Main {

    public static void main(String[] args){
        WR kette = new EUR2Dollar(new EUR2YEN(null));
        kette.ausgabe("EUR2YEN", 10);
        kette.ausgabe("EUR2Dollar", 10);

        WR ketteGebuehrenFix = new DekoriererGebuehrenFix(new EUR2Dollar(new EUR2YEN(null)));
        ketteGebuehrenFix.ausgabe("EUR2YEN", 10);
        ketteGebuehrenFix.ausgabe("EUR2Dollar", 10);

        WR ketteGebuehrenProzent = new DekoriererGebuehrenProzent(new EUR2Dollar(new EUR2YEN(null)));
        ketteGebuehrenProzent.ausgabe("EUR2YEN", 10);
        ketteGebuehrenProzent.ausgabe("EUR2Dollar", 10);
    }

}
