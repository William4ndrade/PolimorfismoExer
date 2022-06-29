package Ex1;

public class Quadrado extends FormaBidimensional{

    @Override
    public double ObterArea() {
        return this.getA() * this.getL();
    }

    public Quadrado(double a, double l) {
        super(a, l);
    }
}
