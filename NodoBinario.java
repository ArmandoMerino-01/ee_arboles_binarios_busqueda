

/**
 *
 * @author Armando1
 * @param <T>
 */
public class NodoBinario<T> {

 
       T dato;
       NodoBinario<T> nodoIzq;
       NodoBinario<T> nodoDer;
     
    public NodoBinario(T dato) {
        this.dato = dato;
        nodoIzq=null;
        nodoDer=null;
    }

    
     public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }
    public NodoBinario<T> getNodoIzq() {
        return nodoIzq;
    }

    public void setNodoIzq(NodoBinario<T> nodoIzq) {
        this.nodoIzq = nodoIzq;
    }

    public NodoBinario<T> getNodoDer() {
        return nodoDer;
    }

    public void setNodoDer(NodoBinario<T> nodoDer) {
        this.nodoDer = nodoDer;
    }



   

 

    
}
