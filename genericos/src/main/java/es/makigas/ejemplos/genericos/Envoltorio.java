package es.makigas.ejemplos.genericos;

public class Envoltorio<E> {
    
    private E envuelto;

    public Envoltorio(E envuelto) {
        this.envuelto = envuelto;
    }
    
    public E get() {
        return envuelto;
    }

    @Override
    public String toString() {
        return "Envolvemos [" + envuelto.toString() + "]";
    }
    
}
