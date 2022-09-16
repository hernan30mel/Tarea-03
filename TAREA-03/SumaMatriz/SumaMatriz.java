import java.util.Scanner;

public class SumaMatriz {
    public int fila;
    public int columna;

    public SumaMatriz(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public static void main(String[] args) {
        SumaMatriz matriz1 = new SumaMatriz(2,3);
        int[][] datos1 = new int[matriz1.getFila()][matriz1.getColumna()];

        SumaMatriz matriz2 = new SumaMatriz(2,2);
        int[][] datos2 = new int[matriz2.getFila()][matriz2.getColumna()];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar datos del primer matriz");
        for (int i = 0; i < matriz1.getFila(); i++) {
            for (int j = 0; j < matriz1.getColumna(); j++) {
                System.out.println("Ingrese el indice[" + i + "][" + j + "]: ");
                datos1[i][j] = scanner.nextInt();
            }
        }

        // muestra la matriz
        System.out.println("Mostrando el primer matriz");
        for (int x = 0; x < matriz1.getFila(); x++) {
            for (int y = 0; y < matriz1.getColumna(); y++) {
                System.out.print(datos1[x][y] + "\t");;
            }
            System.out.println("");
        }


        System.out.println("Ingresar datos del segundo matriz");
        for (int i = 0; i < matriz2.getFila(); i++) {
            for (int j = 0; j < matriz2.getColumna(); j++) {
                System.out.println("Ingrese el indice[" + i + "][" + j + "]: ");
                datos2[i][j] = scanner.nextInt();
            }
        }

        // muestra de matriz
        System.out.println("Mostrando el segundo matriz");
        for (int x = 0; x < matriz2.getFila(); x++) {
            for (int y = 0; y < matriz2.getColumna(); y++) {
                System.out.print(datos2[x][y] + "\t");;
            }
            System.out.println("");
        }

        if (matriz1.getFila() == matriz2.getFila() && matriz1.getColumna() == matriz2.getColumna()) {
            int[][] resultado = new int[matriz1.getFila()][matriz1.getColumna()];
            for (int x = 0; x < matriz2.getFila(); x++) {
                for (int y = 0; y < matriz2.getColumna(); y++) {
                    resultado[x][y] = datos1[x][y] + datos2[x][y];
                }
            }

            System.out.println("Resultado de la suma de matriz");
            for (int x = 0; x < matriz2.getFila(); x++) {
                for (int y = 0; y < matriz2.getColumna(); y++) {
                    System.out.print(resultado[x][y] + "\t");;
                }
                System.out.println("");
            }

        }else{
            System.out.println("No se puede sumar estas matrizes");
        }
    }
}