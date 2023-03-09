public class Main {
    public static void main(String[] args) {

        //Primera parte: uso de la funcion, impresion por pantalla
        int num1 = 15;
        int num2 = 3;
        int num3 = 9;

        var  respSuma = SumaTres(num1, num2, num3);

        System.out.println("Resultado de la suma de tres números "+ respSuma);




        //Segunda Parte: crea un Objeto coche, se añade una puerta y se muestra el numero de puertas.
        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();
        System.out.println("Número de puertas del coche" + " " + miCoche.numPuertas);
    }

    //Primera parte, funcion sumar tres valores
    public static int SumaTres(int a, int b, int c){

        return a+b+c;

    }

}

//Segunda parte: Creando la clase Coche
class Coche{
    public int numPuertas = 0;

    public void AgregarPuerta()
    {
        this.numPuertas++;
    }
}