package clase;

public class Rectangulo {
    //los atributos se declaran por privados generalmente para conservar el encapsulamiento de las clases
    private double ancho;
    private  double alto;

    //Dentro de la misma clase no se usan setters ni getters propios de la misma, salvo en casos especificos.
    ///En este caso, los valores por defecto se asignan en el constructor sin parametros
    public Rectangulo (){
       this.alto=1;
       this.ancho=1;
    }

    ///se crea un segundo constructor
    public Rectangulo (double ancho, double alto){
        this.ancho=ancho;
        this.alto=alto;
    }

    public void MostrarValores () {
        System.out.println("El alto es de: " + this.alto);
        System.out.println("El ancho es de: " + this.ancho);
    }

    public void PerimetroYArea(){
        double perimetro, area;
        perimetro= this.ancho * 2 + this.alto*2;
        area= this.ancho*this.alto;
        System.out.println("Perimetro del rectangulo: " + perimetro);
        System.out.println("Area del rectangulo: " + area);
    }


    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }
}
