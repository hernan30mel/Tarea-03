package ejercicio2;

public class CambioDeBase {
    int N;
    int Base;
    int Inv;
    int Numero;
    int Salida;
    public void establecerNum(int numN)
    {
        N = numN;
    }
    public int obtenerNum()
    {
        return N;
    }
    public void establecerBase(int numBase)
    {
        Base = numBase;
    }
    public int obtenerBase()
    {
        return Base;
    }
    public String operacion() {

        String Salida="";
        Numero=obtenerNum();
        while (Numero>0)
        {
            Inv =(Numero % obtenerBase());
            Numero = Numero / obtenerBase();
            Salida= Inv+Salida;
        }
        System.out.println(Salida);
        return Salida;
    }

}
