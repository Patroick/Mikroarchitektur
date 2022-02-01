package Decorator;

public class EUR2Dollar extends WR {

    public EUR2Dollar(WR next) {
        super(next);
    }

    @Override
    public double umrechnen(String variante, double betrag) {
        if(variante.equals("EUR2Dollar")){
            betrag = betrag*1.13;
            return betrag;
        }
        return super.umrechnen(variante, betrag);

    }
}
