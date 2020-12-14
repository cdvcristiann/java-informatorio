import java.util.HashSet;
import java.util.Set;

public class HashSetE {
    public static void main(String[] args) {
        Set<Long> dni = new HashSet<>();
        Set<String> nombres = new HashSet<>();

        dni.add((long) 349035474);
        dni.add(Long.valueOf(40448892));

        nombres.add("Cristian");
        nombres.add("anonimo");
        nombres.add("anonimo");

        System.out.println(dni);
        System.out.println(nombres);
        System.out.println(dni.size());
        System.out.println(nombres.size());
        System.out.println(dni.size()==nombres.size());
        for (String nombre: nombres) {

            System.out.println(nombre);
        }
        for(Long dnii: dni){
            System.out.println(dnii);
        }
        nombres.remove("anonimo");
        for (String nombre: nombres) {

            System.out.println(nombre);
        }

    }
    
}
