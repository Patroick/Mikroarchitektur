package ChainOfResponibility;

import ChainOfResponibility.Bearbeiter;
import ChainOfResponibility.KonkreterBearbeiter1;
import ChainOfResponibility.KonkreterBearbeiter2;

public class Main {

    public static void main(String args[]){

        Bearbeiter b = new KonkreterBearbeiter1(new KonkreterBearbeiter2(null));
        b.bearbeiten("EUR");
        b.bearbeiten("USD");
        b.bearbeiten("123");

    }
}
