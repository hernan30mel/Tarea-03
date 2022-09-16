package ejercicio3;

public class CambioDeGrados {
    double GC;

    public void establecerGC(double GC) {GC = GCnum;}
    public double obtenerGC()
    {
        return GC;
    }

    public void operacion()
    {
        double F= (9/5)*obtenerGC()+32;
        double K= obtenerGC() +273;
        double R= (9/5)*obtenerGC()+492;
        String("el numero en grados centigrados es: "+GC+"convertidos a grados kelvin son"+K
                +"convertidos a grados Farenger son"+F+"convertidos a grados Rankine son"+R);
    }

}
