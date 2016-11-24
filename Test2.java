
public class Test2 {
    public static void main(String[] args) {
        NodoBinario <Integer> n = null;
          ArbolBinario a= new ArbolBinario();
     
         n= new NodoBinario<Integer>(1);
         n.setNodoIzq(new NodoBinario<Integer>(2));
         n.setNodoDer(new NodoBinario<Integer>(3));
         n.getNodoIzq().setNodoIzq(new NodoBinario<Integer>(4));
         n.getNodoIzq().setNodoDer(new NodoBinario<Integer>(5));
         
      
         
         System.out.println("\nrecorrido INORDEN");
         a.Inorden(n); 
          System.out.println("\nrecorrido POSORDEN");
         a.posorden(n);
          System.out.println("\nrecorrido PREORDEN");
         a.preorden(n);
         
        
              System.out.println("metodo de busqueda: ");
              a.buscarPro(n, 4888);
        
         
         
     
    }
}
