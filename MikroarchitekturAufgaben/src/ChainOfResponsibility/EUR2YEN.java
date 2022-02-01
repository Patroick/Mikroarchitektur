package ChainOfResponsibility;

public class EUR2YEN extends WR{

    public EUR2YEN(WR next) {
        super(next);
    }

    @Override
    public double umrechnen(String variante, double betrag) {

        if(variante.equals("EUR2YEN")){
            System.out.println("Der zu berechnende Betrag: " + betrag);
            betrag = betrag*128.83;
            System.out.println("Der berechnete Betrag: " + betrag);
            return betrag;
        }
        return super.umrechnen(variante, betrag);

    }
}
