import clase.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      
        Scanner numerito= new Scanner(System.in);
        System.out.println("Que punto desea ver?");
        int Ejercicio= numerito.nextInt();
        switch (Ejercicio) {
            case 1:
                System.out.println("Punto 1");


                Rectangulo rectangulo1 = new Rectangulo(5,8);
                 rectangulo1.MostrarValores();
                 rectangulo1.PerimetroYArea();
                 rectangulo1.setAlto(3);
                 rectangulo1.setAncho(9);
                 ///Se utiliza el set debido a que los atributos son privados
                 ///rectangulo1.ancho =8; no es posible esta linea de codigo por los modificadores de acceso.


                 rectangulo1.PerimetroYArea();

                Rectangulo rectangulo2 = new Rectangulo();
                rectangulo2.MostrarValores();

                break;
            case 2:

                System.out.println("Punto 2");
                Empleado trabajador1 = new Empleado("Carlos", "Gutierrez", "23456345", 25000);
                Empleado trabajador2 = new Empleado("Ana", "Sanchez", "34234123", 27500);

                trabajador1.MostrarEmpleado();
                trabajador2.MostrarEmpleado();

                trabajador1.AumentarSalarioPorcentaje(15);
                ///trabajador1.MostrarEmpleado();
                System.out.println("\nSalario anual de Carlos ");
                trabajador1.CalcularSalarioAnual();
                break;
            case 3:
                System.out.println("Punto 3");

                ItemDeVenta item1 = new ItemDeVenta(4,"Muy bueno",5,67);

                item1.MostrarItem();

                break;
            case 4:
                CuentaDeBanco cuentita= new CuentaDeBanco("Carlos Perez", 15000);
                CuentaDeBanco cuentita2= new CuentaDeBanco("Carlos Perez", 15000);
                CuentaDeBanco cuentita3= new CuentaDeBanco("Carlos Perez", 15000);
                cuentita.credito(2500);
                cuentita.debito(1500);
                cuentita.debito(30000);
                cuentita.Mostrar();
                cuentita2.Mostrar();
                cuentita3.Mostrar();
                break;
            case 5:
                Hora horita = new Hora(16,3,1);
                horita.DameLaHora();
                horita.AdelantarUnSegundo();
                horita.DameLaHora();
                break;

        }
    }
}