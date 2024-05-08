public class Division {
    // Variables para los valores y el resultado de la división
    private double a, b, r;

    // Método para obtener el valor 'a'
    public double getA() {
        return a;
    }

    // Método para establecer el valor 'a'
    public void setA(double a) {
        this.a = a;
    }

    // Método para obtener el valor 'b'
    public double getB() {
        return b;
    }

    // Método para establecer el valor 'b'
    public void setB(double b) {
        this.b = b;
    }

    // Método para obtener el resultado de la división
    public double getR() {
        return r;
    }

    // Método para realizar la división de 'a' entre 'b'
    public void dividir() {
        this.r = a / b;
    }

    // Método toString para representar la información de la división
    @Override
    public String toString() {
        return "Division [a=" + a + ", b=" + b + ", r=" + r + "]";
    }
}
