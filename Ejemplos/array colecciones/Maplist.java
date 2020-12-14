import java.util.HashMap;
import java.util.Map;

public class Maplist {
    public static void main(String[] args) {
        Map<Integer, String> dni = new HashMap<>();
        Map<String, String> nombres = new HashMap<>();

        dni.put(34903574, "Cristian");
        dni.put(40448892, "Maria");

        nombres.put( "Goku", "Super sajajin dios");
        nombres.put("Naruto", "zorro");

        System.out.println(dni);
        System.out.println(nombres);

        System.out.println("el mejor personaje de dragon ball es "+ nombres.get("Goku"));
        System.out.println("este dni pertenece a "+ dni.get(34903574));

        nombres.remove("Naruto");
        dni.remove(40448892);
        System.out.println(dni);
        System.out.println(nombres);

        cargarMap(dni);
        //para recorrer o hacer for se le agrega la clase "Entry" en el entry es como un registro
        for (Map.Entry<Integer, String> numero: dni.entrySet()) {
            System.out.println("dni " + numero.getKey() + " nombre "+numero.getValue());//getKey es la clave del map- getvalue es el valor
        }
        //para mostrar solo las claves del map
        for (Integer clave:dni.keySet()) {
            System.out.println("dni "+ clave);
        }
        //para mostrar solo los valores
        for (String nombre : dni.values()) {
            System.out.println("los valores de los dni son: " + nombre);
        }
        //preguntar si la clave o el valor tiene el map
        System.out.println("tiene como clave el dni 1234567?? " + dni.containsKey(1234567));
        System.out.println("tiene como valor el dni 1234567?? " + dni.containsValue("1234567"));


    }

    private static void cargarMap(Map<Integer, String> dni) {
        dni.put(1234567, "de alguien");
        dni.put(9876543, "no se de quien");
        dni.put(9192837, "ouede ser tuyo");
    }
}
