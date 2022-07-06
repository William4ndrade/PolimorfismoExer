package Ex3;

import java.util.List;

public class CD  extends  item{

    private String Artista;

    public CD(String titulo, int tempoDuração, List<String> comentarios, String artista) {
        super(titulo, tempoDuração, comentarios);
        Artista = artista;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Artista: " + Artista);
    }
}
