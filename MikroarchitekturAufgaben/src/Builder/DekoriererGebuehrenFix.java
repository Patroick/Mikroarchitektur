package Builder;

public class DekoriererGebuehrenFix extends Dekorierer {
    public DekoriererGebuehrenFix(WR next) {
        super(next);
    }

    @Override
    public void ausgabe(String variante, double betrag) {
        System.out.println("Mit 5 EUR Gebühren");
        super.ausgabe(variante, betrag);
    }

    @Override
    public double umrechnen(String variante, double betrag) {

        if(variante.contains("EUR2")) {
            betrag -= 5;
            return super.umrechnen(variante, betrag);
        } else {
            System.out.println("Nur bei umrechenen von EUR zu Währung X möglich");
            return super.umrechnen(variante, betrag);
        }
    }
}
