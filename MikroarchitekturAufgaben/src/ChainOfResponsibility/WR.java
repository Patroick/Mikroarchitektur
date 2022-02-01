package ChainOfResponsibility;

public abstract class WR implements IUmrechnen{

    private WR next;

    public WR(WR next){
        this.next = next;
    }

    @Override
    public double umrechnen(String variante, double betrag) {
        if(next != null){
            return next.umrechnen(variante, betrag);
        }
        return 0;
    }
}
