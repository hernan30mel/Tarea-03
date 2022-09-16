class Ecuacion{
    public int a;
    public int b;
    public int c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Ecuacion(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        Ecuacion ecuacion = new Ecuacion(1, 2, 1);
        int a = ecuacion.getA();
        int b = ecuacion.getB();
        int c = ecuacion.getC();
        double discriminante = Math.pow(b, 2) - (4 * a * c);
        if (discriminante < 0){
            System.out.println("No tiene solucion real");
        } else if (discriminante == 0) {
            double respuesta = -b / (2 * a);
            System.out.println("Una solucion doble: " + respuesta);
        }else{
            double respuesta1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            double respuesta2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            System.out.println("Respuesta: " + respuesta1 + " | " + respuesta2);
        }
    }

}
