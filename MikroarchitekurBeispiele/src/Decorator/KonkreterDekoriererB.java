package Decorator;

public class KonkreterDekoriererB extends Decorator{

    public KonkreterDekoriererB(Komponente komponente) {
        super(komponente);
    }

    private String string = "KronkreterDekoriererB";

    public void operation(){
        System.out.println(string);
        komponente.operation();
    }
}
