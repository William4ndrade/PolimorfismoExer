package Ex1;

public class Circulo extends FormaBidimensional{

    private double r;

    @Override
    public double ObterArea() {
        return Math.PI * Math.pow(r, 2);
    }

    public Circulo(double r) {
        this.r = r;
    }


}
