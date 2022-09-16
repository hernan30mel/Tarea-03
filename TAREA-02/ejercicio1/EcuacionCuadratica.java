package ejercicio1;

import java.lang.Math;

public class EcuacionCuadratica {
    double a;
    double b;
    double c;
    double result1=0;
    double result2=0;
    public void establecerA(double numA)
    {
        a = numA;
    }
    public double obtenerA()
    {
        return a;
    }
    public void establecerB(double numB)
    {
        b = numB;
    }
    public double obtenerB()
    {
        return b;
    }
    public void establecarC(double numC)
    {
        c = numC;
    }
    public double obtenerC()
    {
        return c;
    }
    public double discriminante()
    {
        
        double expresion;
        expresion = Math.pow(obtenerB(), 2) - 4*obtenerA()*obtenerC();
        if (expresion > 0)
        {
            // Dos raices
            result1=(obtenerB()+Math.sqrt(expresion))/2*obtenerA();
            result2=(obtenerB()-Math.sqrt(expresion))/2*obtenerA();
            System.out.println(result1);
            System.out.println(result2);
        }
        else if (expresion == 0) 
        {
            result1=(obtenerB()+Math.sqrt(expresion))/2*obtenerA();
            result2=(obtenerB()-Math.sqrt(expresion))/2*obtenerA();
            System.out.println(result1);
            System.out.println(result2);
        }
        else /*(expresion < 0) */
        {
            System.out.println("no tiene solucion real");
        }
        return 0;
    }
}
