




package operaciones;

public class Resta extends Operacion {

    public Resta(int a, int b) {
        super(a, b);
    }

    public int calcular() {
        resultado = a - b;
        return resultado;
    }
}