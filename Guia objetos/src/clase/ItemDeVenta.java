package clase;

public class ItemDeVenta {
    private int Id;
    private String Descripcion;
    private int Cantidad;
    private float PrecioUnitario;

    public ItemDeVenta(int id, String descripcion, int cantidad, float precioUnitario) {
        this.Id = id;
        this.Descripcion = descripcion;
        this.Cantidad = cantidad;
        this.PrecioUnitario = precioUnitario;
    }

    public void MostrarItem (){
        System.out.println("-----------------------");
        System.out.println("Id del Item: " +this.Id);
        System.out.println("Descripcion: " + this.Descripcion);
        System.out.println("Cantidad: " + this.Cantidad);
        System.out.println("Precio Unitario: "+ this.PrecioUnitario);
        System.out.println("El precio total es de: " + ((float)this.Cantidad * this.PrecioUnitario));

        ///El precio total no es necesario que sea un atributo, puesto que solo es solicitado en la muestra
        ///Se calcula multiplicando la cantidad de items por el precio unitario.
        ///En caso de ser un atributo se deberia actualizar cada vez que uno de los dos atributos cambie.
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setPrecioUnitario(float precioUnitario) {
        PrecioUnitario = precioUnitario;
    }

    public float getPrecioUnitario() {
        return PrecioUnitario;
    }

    public int getId() {
        return Id;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public int getCantidad() {
        return Cantidad;
    }
}
