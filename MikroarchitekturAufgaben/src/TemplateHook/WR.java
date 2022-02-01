package TemplateHook;

public abstract class WR implements IUmrechnen {

    private WR next;

    public WR(WR next){
        this.next = next;
    }

    public void ausgabe(String variante, double betrag){

        System.out.println("Der zu berechnende Betrag: " + betrag);

        betrag = umrechnen(variante, betrag);

        System.out.println("Der berechnete Betrag: " + betrag);

    }

    @Override
    public double umrechnen(String variante, double betrag) {
        if(next != null){
            return next.umrechnen(variante, betrag);
        }
        return 0;
    }
}
