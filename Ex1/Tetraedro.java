package Ex1;

public class Tetraedro extends FormaTridimensional{


    public Tetraedro(double comprimento, double altura, double largura) {
        super(comprimento, altura, largura);
    }

    @Override
    public double ObterArea() {
        return (getComprimento() * getComprimento()) * Math.sqrt(3)  ;
    }

    @Override
    public double ObterVolume() {
        return (1/3)*getComprimento() * getAltura();
    }
}
