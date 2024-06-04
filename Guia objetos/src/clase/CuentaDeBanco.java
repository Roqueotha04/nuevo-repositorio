package clase;

public class CuentaDeBanco {
    private static int IdIncremento=0; /// se crean Ids autoincrementales con una variable de clase.
    private int ID;
    private String Nombre;
    private int Balance;

    public CuentaDeBanco(String nombre, int balance) {
        this.IdIncremento++; /// se incrementa la variable de clase
        this.ID = IdIncremento; ///se asigna el valor a la variable de instancia.
        this.Nombre = nombre;
        this.Balance = balance;
    }

    public int credito(int Cantidad){
        this.Balance += Cantidad;
        return Balance;
    }

    public int debito (int Cantidad){
        if ((this.Balance - Cantidad)<0 ) ///se debe verificar no bajar del limite.
            System.out.println("Saldo insuficiente");
        else {
            this.Balance -= Cantidad;
        }

        return Balance;
    }

    public void Mostrar (){
        System.out.println("ID: " + this.ID);
        System.out.println("Nombre: " + this.Nombre);
        System.out.println("Balance " + this.Balance);
    }

    public int getBalance() {
        return Balance;
    }

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
