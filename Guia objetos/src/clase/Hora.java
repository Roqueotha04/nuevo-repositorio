package clase;

public class Hora {
    private int Horas;
    private int Minutos;
    private int Segundos;

    ///En este caso se admite el uso de set en el constructor.
    ///Esto debido a que son necesarias ciertas validaciones que se encuentran en el metodo.
    ///De esta manera se evita repetir codigo, aplicando reusabilidad.
    public Hora (int Horas, int Minutos, int Segundos){
        setHoras(Horas);
        setMinutos(Minutos);
        setSegundos(Segundos);
    }


    public void AdelantarUnSegundo (){
        if (this.Segundos == 59) {
            setSegundos(0);
            if (this.Minutos== 59){
                setMinutos(0);
                if (this.Horas ==23){
                    setHoras(0);
                }else{
                    this.Horas++;
                }
            }else{
                this.Minutos++;
            }
        }else{
            this.Segundos++;
        }
    }

    public void AtrasarUnSegundo (){

        if (this.Segundos==0){

            setSegundos(59);

            if (this.Minutos==0){
                setMinutos(59);

                if (this.Horas==0){
                    setHoras(23);
                }else{
                    this.Horas--;
                }

            }else{
                this.Minutos--;
            }

        }else{
            this.Segundos--;
        }
    }

    ///El uso de System.out.printf, permite ciertas funciones extra para la muestra de datos.
    public void DameLaHora (){
        System.out.printf("%02d:%02d:%02d", this.Horas,this.Minutos,this.Segundos);
        System.out.println("");
    }


    public int getHoras() {
        return Horas;
    }

    public int getMinutos() {
        return Minutos;
    }

    public int getSegundos() {
        return Segundos;
    }

    public void setHoras(int horas) {
        if (horas>23 || horas<0){
            System.out.println("Error");
        }else{
            this.Horas = horas;
        }

    }

    public void setMinutos(int minutos) {
        if (minutos>59 || minutos<0){
            System.out.println("Error");
        }else{
            this.Minutos = minutos;
        }
    }

    public void setSegundos(int segundos) {
        if (segundos>59 || segundos<0){
            System.out.println("Error");
        }else{
            this.Segundos = segundos;
        }
    }
}
