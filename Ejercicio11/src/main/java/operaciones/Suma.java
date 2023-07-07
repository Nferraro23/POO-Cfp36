




package operaciones;

public class Suma extends Operacion {

    public Suma(int a, int b) {
        super(a, b);
    }

    public int calcular() {
        resultado = a + b;
        return resultado;
    }
}
