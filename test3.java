
public class test3 {

    public static void main(String[] args) {

        ArbolBinario<Integer> a = new ArbolBinario();
        NodoBinario<Integer> n;
        BTreePrinter b = new BTreePrinter();
        System.out.println("-------ELEMENTOS------");
        a.insertar(100);
        n = a.getRaiz();
        a.insertar(7);;;
        a.insertar(6);
        a.insertar(23);
        a.insertar(40);
        a.insertar(400);
        a.insertar(300);
        a.insertar(500);
        a.posorden(a.getRaiz());
        System.out.println("\n-------ARBOL ORDENADO------");
        BTreePrinter.printNode(a.getRaiz());
        System.out.println("-------METODO BUSCAR------");
        a.buscarPro(n, 500);
        a.eliminarR(n, 400);
        System.out.println("\n-------DESPUES DEL ELIMINAR------");
        BTreePrinter.printNode(a.getRaiz());

    }

}
