package Ex3;

import java.util.List;

public class DVD extends item{

    private String diretor;

    public DVD(String titulo, int tempoDuração, List<String> comentarios, String diretor) {
        super(titulo, tempoDuração, comentarios);
        this.diretor = diretor;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Diretor: " + diretor);
    }
}
