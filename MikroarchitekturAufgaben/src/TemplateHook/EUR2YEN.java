package TemplateHook;

public class EUR2YEN extends WR {

    public EUR2YEN(WR next) {
        super(next);
    }

    @Override
    public double umrechnen(String variante, double betrag) {

        if(variante.equals("EUR2YEN")){
            betrag = betrag*128.83;
            return betrag;
        }
        return super.umrechnen(variante, betrag);

    }
}
