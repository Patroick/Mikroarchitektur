package TemplateHook;

public class Main {

    public static void main(String[] args){
        WR kette = new EUR2Dollar(new EUR2YEN(null));
        kette.ausgabe("EUR2YEN", 10);
        System.out.println("");
        kette.ausgabe("EUR2Dollar", 10);
    }

}
