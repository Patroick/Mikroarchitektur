package Decorator;

public class DekoriererGebuehrenProzent extends Dekorierer {

    public DekoriererGebuehrenProzent(WR next) {
        super(next);
    }

    @Override
    public void ausgabe(String variante, double betrag) {
        System.out.println("Mit 5 Prozent Gebühren");
        super.ausgabe(variante, betrag);
    }

    @Override
    public double umrechnen(String variante, double betrag) {
        betrag -= betrag * 0.05;
        return super.umrechnen(variante, betrag);
    }
}
