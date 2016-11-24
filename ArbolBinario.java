
/**
 *
 * @author Armando1
 * @param <T>
 */
public class ArbolBinario<T extends Comparable<T>> {
    private NodoBinario<T> raiz;

    public ArbolBinario() {
        raiz = null;
    }

    //public NodoBinario<T> raiz;
    public NodoBinario<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoBinario<T> raiz) {
        this.raiz = raiz;
    }

    public void preorden(NodoBinario<T> raiz) {
        if (raiz != null) {
            System.out.print(raiz.getDato()+",");
            preorden(raiz.getNodoIzq());
            preorden(raiz.getNodoDer());
        }
    }

    public void Inorden(NodoBinario<T> raiz) {
        if (raiz != null) {
            Inorden(raiz.getNodoIzq());
            System.out.print(raiz.getDato()+",");
            Inorden(raiz.getNodoDer());
        }
    }

    /**
     *
     * @param raiz
     */
    public void posorden(NodoBinario<T> raiz) {
        if (raiz != null) {
            posorden(raiz.getNodoIzq());
            posorden(raiz.getNodoDer());
            System.out.print(raiz.getDato()+",");
        }
    }

      
/////////////////////////////////////////////////////////////////////////////////////////
 public void buscarPro(NodoBinario<T>raiz, T dato){
        if (raiz != null){
            if (dato.compareTo(raiz.getDato()) < 0){ // Vamos por la izquierda
                buscarPro(raiz.getNodoIzq(), dato);
            }else if (dato.compareTo(raiz.getDato()) > 0){ // Vamos por la derecha
                buscarPro(raiz.getNodoDer(), dato);
            }else{
                System.out.println("El objeto se encontro el en arbol: "+raiz.getDato());
            }
        }else{
            System.out.println("No se encontro el objeto!");
        }
    }


    private void _insertar(NodoBinario<T> nodo, T dato){
            if (dato.compareTo(nodo.getDato()) < 0){//nos vamos por la izquierda 
                if (nodo.getNodoIzq() == null){
                    nodo.setNodoIzq(new NodoBinario(dato));
                }else{
                    _insertar(nodo.getNodoIzq(), dato);
                }
            }else{
                if (dato.compareTo(nodo.getDato()) > 0){//vamos por la de derecha
                    if (nodo.getNodoDer() == null){
                        nodo.setNodoDer(new NodoBinario(dato));
                    }else{
                        _insertar(nodo.getNodoDer(), dato);
                    }
                }
            }
        
    }
    
    
    public Integer insertar(T dato){
        if (raiz == null){
            raiz = new NodoBinario<T>(dato);
        }else{
            _insertar(raiz, dato);
        }
        return 0;
    }
    
    
    public void encontrar(){
       Nododerecho(raiz);
    }
    int conta=0;
    private void Nododerecho(NodoBinario raiz){
     NodoBinario n=raiz;
     
     if(n.getNodoIzq()!=null&&conta<1){
        conta++;
        n=n.getNodoIzq(); 
        }
     if(n.getNodoDer()!=null){
        n=n.getNodoDer();
         Nododerecho(n);
        }
      else{
        System.out.println("El nodo es "+n.getDato());
        
        }
     
    }
//***************************************************************
    public void eliminaNodo(NodoBinario<T> nodo, Integer direccion) {
        NodoBinario<T> otro, aux, aux1;
        if (direccion == -1) {
            otro = nodo.getNodoIzq();
        } else {
            otro = nodo.getNodoDer();
        }
        if (otro.getNodoDer() == null) {
            if (direccion == -1) {
                nodo.setNodoIzq(otro.getNodoIzq());
            } else {
                nodo.setNodoDer(otro.getNodoIzq());
            }

        } else {
            if (otro.getNodoIzq() == null) {
                if (direccion == -1) {
                    nodo.setNodoIzq(otro.getNodoDer());
                } else {
                    nodo.setNodoDer(otro.getNodoDer());
                }
            } else {
                aux = otro.getNodoIzq();
                aux1 = aux;
                while (aux.getNodoDer() != null) {
                    aux1 = aux;
                    aux = aux.getNodoDer();
                }
                otro.setDato(aux.getDato());
                if (aux == aux1) {
                    otro.setNodoIzq(null);
                } else {
                    aux1.setNodoDer(null);
                }
            }
        }
    }

        public void eliminarR(NodoBinario<T> nodo, T dato) {
        NodoBinario<T> aux, otro;
        if (dato.compareTo(nodo.getDato()) < 0) {
            if (nodo.getNodoIzq() != null) {
                if (dato.compareTo(nodo.getNodoIzq().getDato()) == 0) {
                    // Este es el nodo
                    eliminaNodo(nodo, -1);

                } else {
                    eliminarR(nodo.getNodoIzq(), dato);
                }
            }

        } else {
            if (dato.compareTo(nodo.getDato()) > 0) {
                if (nodo.getNodoDer() != null) {
                    if (dato.compareTo(nodo.getNodoDer().getDato()) == 0) {
                        // Este es el nodo
                        eliminaNodo(nodo, 1);

                    } else {
                        eliminarR(nodo.getNodoDer(), dato);
                    }
                }

            }
        }
       }
}

        



