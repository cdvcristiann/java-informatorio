public class EmpleadoJornada extends Empleado{
    private int horasTrabajadas;
    private  int ValorPorHora;
    
    public EmpleadoJornada(int dni, String nombre, String apellido, int horasTrabajadas, int ValorPorHora){
        super(dni, nombre, apellido);
        this.horasTrabajadas = horasTrabajadas;
        this.ValorPorHora = ValorPorHora;
        
    }

    @Override
    public int calcularSueldo() {
        return this.horasTrabajadas * this.ValorPorHora;
    }

    
}
