package ejercicio2;

public class Main2 {

    public static void main(String args[])
    {


        CambioDeBase cambio = new CambioDeBase();
        cambio.establecerNum(1000);
        cambio.establecerBase(8);


        System.out.println("el numero elegido: "+cambio.obtenerNum());
        System.out.println("el cambio de base: "+cambio.obtenerBase());


        cambio.operacion();


    }
}
