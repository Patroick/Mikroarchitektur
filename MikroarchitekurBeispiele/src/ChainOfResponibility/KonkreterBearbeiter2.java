package ChainOfResponibility;

import ChainOfResponibility.Bearbeiter;

public class KonkreterBearbeiter2 extends Bearbeiter {

    public KonkreterBearbeiter2(Bearbeiter naechsterBearbeiter) {
        super(naechsterBearbeiter);
    }

    public void bearbeiten(String waehrung){
        if(waehrung.equals("USD")){
            System.out.println("US Dollar");
        } else {
            super.bearbeiten(waehrung);
        }
    }
}
