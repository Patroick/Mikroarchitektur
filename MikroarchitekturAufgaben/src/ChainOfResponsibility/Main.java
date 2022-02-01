package ChainOfResponsibility;

public class Main {

    public static void main(String[] args){
        WR kette = new EUR2Dollar(new EUR2YEN(null));
        kette.umrechnen("EUR2YEN", 10);
        System.out.println("");
        kette.umrechnen("EUR2Dollar", 10);
    }

}
