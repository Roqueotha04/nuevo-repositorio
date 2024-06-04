package clase;

public class Empleado {
    private String Nombre;
    private String Apellido;
    private String Dni;
    private float SalarioMensual;

    public Empleado(String nombre, String apellido, String dni, float salarioMensual) {
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Dni = dni;
        this.SalarioMensual = salarioMensual;
    }

    ///Se calcula el salario anual sin modificar datos.
    public void CalcularSalarioAnual (){
        System.out.println("El salario anual es de: " + this.SalarioMensual * 12);
    }

    ///Se modifica el atributo trabajando con el mismo desde dentro de la clase.
    public void AumentarSalarioPorcentaje(float porcentaje){
        this.SalarioMensual = this.SalarioMensual * (1+(porcentaje/100));
    }

    public void MostrarEmpleado (){
        System.out.println("-----------------------------");
        System.out.println("Nombre y Apellido: " + this.Nombre + this.Apellido);
        System.out.println("Dni: " + this.Dni);
        System.out.println("Salario Mensual: " + this.SalarioMensual);
    }



    public void setApellido(String apellido) {
        Apellido = apellido;
    }


    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setSalarioMensual(float salarioMensual) {
        SalarioMensual = salarioMensual;
    }

    public float getSalarioMensual() {
        return SalarioMensual;
    }


    public String getApellido() {
        return Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }
}
