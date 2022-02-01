package Decorator;

public class KonkreterDekoriererA extends Decorator{

    public KonkreterDekoriererA(Komponente komponente) {
        super(komponente);
    }

    public void operation(){
        System.out.println("2");
        komponente.operation();
    }
}
