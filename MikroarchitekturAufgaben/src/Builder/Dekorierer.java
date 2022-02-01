package Builder;

public abstract class Dekorierer extends WR {

    private WR rechner;

    public Dekorierer(WR next) {
        super(next);
        rechner = next;
    }


}
