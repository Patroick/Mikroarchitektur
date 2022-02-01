package ChainOfResponibility;

import ChainOfResponibility.Bearbeiter;

public class KonkreterBearbeiter1 extends Bearbeiter {

    public KonkreterBearbeiter1(Bearbeiter naechsterBearbeiter) {
        super(naechsterBearbeiter);
    }

    public void bearbeiten(String waehrung){
        if(waehrung.equals("EUR")){
            System.out.println("Euro");
        } else {
            super.bearbeiten(waehrung);
        }
    }
}
