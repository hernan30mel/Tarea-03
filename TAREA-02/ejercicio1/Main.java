package ejercicio1;

public class Main {

    public static void main(String args[])
    {

        EcuacionCuadratica ecuacion = new EcuacionCuadratica();
        ecuacion.establecerA(1);
        ecuacion.establecerB(-2);
        ecuacion.establecarC(-24);

        System.out.println("Valor A: "+ecuacion.obtenerA());
        System.out.println("Valor B: "+ecuacion.obtenerB());
        System.out.println("Valor C: "+ecuacion.obtenerC());

        ecuacion.discriminante();


    }
}
