package Ex1;

public abstract class FormaTridimensional extends Forma{

    private double comprimento;
    private double altura;
    private double largura;

    public double getComprimento() {
        return comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public FormaTridimensional() {
    }

    public FormaTridimensional(double comprimento, double altura, double largura) {
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
    }

    public abstract double ObterArea();

    public abstract double ObterVolume();

}
