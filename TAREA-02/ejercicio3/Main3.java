package ejercicio3;

public class Main3 {

    public static void main(String[] args)
    {


        CambioDeGrados cambio = new CambioDeGrados();
        cambio.establecerGC(1);

        System.out.println("el numero en grados centigrados es: "+cambio.obtenerGC());


        cambio.operacion();


    }
}
