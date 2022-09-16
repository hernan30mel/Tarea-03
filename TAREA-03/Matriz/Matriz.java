import java.util.Scanner;

public class Matriz {

    public int fila;
    public int columna;

    public Matriz(int fila, int columna) {
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
        Matriz matriz = new Matriz(2,2);
        Scanner scanner = new Scanner(System.in);
        int[][] datos = new int[matriz.getFila()][matriz.getColumna()];

        for (int i = 0; i < matriz.getFila(); i++) {
            for (int j = 0; j < matriz.getColumna(); j++) {
                System.out.println("Ingrese el indice[" + i + "][" + j + "]: ");
                datos[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < matriz.getFila(); i++) {
            for (int j = 0; j < matriz.getColumna(); j++) {
                System.out.print(datos[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}