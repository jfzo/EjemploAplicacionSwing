import java.util.ArrayList;

public class EjemploColeccionNumeros {


    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        listaNumeros.add(6);
        listaNumeros.add(10);
        listaNumeros.add(29);
        listaNumeros.add(6);

        System.out.println(listaNumeros);
        for(int i=0; i < listaNumeros.size(); i++){
            System.out.print(i+":");
            System.out.println(listaNumeros.get(i));
        }

        // Se elimna el 3er elemento.
        listaNumeros.remove(2);
        // Se muestra y recorre la lista de nuevo!
        System.out.println(listaNumeros);
        for(int i=0; i < listaNumeros.size(); i++){
            System.out.print(i+":");
            System.out.println(listaNumeros.get(i));
        }
    }
}
