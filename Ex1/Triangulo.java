package Ex1;

public class Triangulo extends FormaBidimensional{

    public Triangulo(double a, double l) {
        super(a, l);
    }

    @Override
    public double ObterArea() {
        return (this.getA() * this.getL())/2;
    }
}
