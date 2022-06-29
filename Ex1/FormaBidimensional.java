package Ex1;

public abstract class FormaBidimensional  extends Forma{

    private double a;
    private double l;


    public double getA() {
        return a;
    }

    public double getL() {
        return l;
    }

    public FormaBidimensional(double a, double l) {
        this.a = a;
        this.l = l;
    }

    public FormaBidimensional() {
    }

    public abstract double ObterArea();



}
