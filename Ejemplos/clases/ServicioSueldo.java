/**
 * ServicioSueldo
 */
public class ServicioSueldo {

    public static void main(String[] args) {
        Empleado empl = new EmpleadoEfectivo(3498764, "Cristian", "Villordo", 700000, 4);
        empl.setApellido("Villor");
        Empleado empl2 = new EmpleadoJornada(3345789, "Juan", "Benitez", 8, 600);
        System.out.println(empl.calcularSueldo());
        System.out.println(empl2.calcularSueldo());
    }
}