package Decorator;

public abstract class Decorator implements Komponente{
    Komponente komponente;

    public Decorator(Komponente komponente){
        this.komponente = komponente;
    }

    public void operation(){
        System.out.println("Decorator");
    }

}
