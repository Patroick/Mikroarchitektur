package ChainOfResponibility;

public abstract class Bearbeiter {

    private Bearbeiter naechsterBearbeiter;

    public Bearbeiter(Bearbeiter naechsterBearbeiter) {
        this.naechsterBearbeiter = naechsterBearbeiter;
    }

    public void bearbeiten(String waehrung){
        if(naechsterBearbeiter != null){
            naechsterBearbeiter.bearbeiten(waehrung);
        }

    }
}
