package Ex1;

public class Cubo extends FormaTridimensional{

    public Cubo(double comprimento, double altura, double largura) {
        super(comprimento, altura, largura);
    }


    @Override
    public double ObterArea() {
        return 6*Math.pow(getComprimento(),2);
    }

    @Override
    public double ObterVolume() {
        return Math.pow(getComprimento(), 3);
    }
}


