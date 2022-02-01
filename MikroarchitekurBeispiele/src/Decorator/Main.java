package Decorator;

public class Main {

    public static void main (String args[]){

        Komponente k1 = new KonkreterDekoriererB(new KonkreteKomponente());
        Komponente k2 = new KonkreterDekoriererA(new KonkreteKomponente());

        k1.operation();
        k2.operation();

    }
}
