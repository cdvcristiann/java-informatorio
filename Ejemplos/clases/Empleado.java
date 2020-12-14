public abstract class Empleado {
    private int dni;
    private String nombre;
    private String apellido;

    public Empleado(int dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract int calcularSueldo();

    @Override
    public String toString() {
        return String.valueOf(this.dni) + "-" +  this.nombre + "-" + this.apellido;
    }
}
