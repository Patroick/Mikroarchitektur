package ChainOfResponsibility;

public class EUR2Dollar extends WR {

    public EUR2Dollar(WR next) {
        super(next);
    }

    @Override
    public double umrechnen(String variante, double betrag) {
        if(variante.equals("EUR2Dollar")){
            System.out.println("Der zu berechnende Betrag: " + betrag);
            betrag = betrag*1.13;
            System.out.println("Der berechnete Betrag: " + betrag);
            return betrag;
        }
        return super.umrechnen(variante, betrag);

    }
}
