import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList
 */
public class ArrayListE {

    public static void main(String[] args) {
        List<Integer> dni = new ArrayList<>();
        List<String> nombres = new ArrayList<>();

        dni.add(34903574);
        dni.add(40448892);
        dni.add(35678902);

        nombres.add("Cristian");
        nombres.add("Maria");
        nombres.add("Melina");

        System.out.println(dni);
        System.out.println(nombres);
        //preguntar si tiene un elemnto la lista, con el contains devuelve un boleano
        System.out.println("existe Cristian en la lista? "+ nombres.contains("Cristian"));
        System.out.println("el dni de " + nombres.get(0) + " es " + dni.get(0) );
        System.out.println("el nombre contiene " + nombres.size() + " elemntos " + " y el dni tiene " + dni.size() + " elementos" );
        nombres.remove("Maria");
        nombres.remove(1);
        System.out.println(nombres);
        dni.remove(1);
        System.out.println(dni);

        cargarLista(nombres);
        System.out.println(nombres);

        
    }

    public static void cargarLista(List<String> nombres) {
        nombres.add("Marcelo");
        nombres.add("Cesar");
        nombres.add("Priscilla");
    }
}