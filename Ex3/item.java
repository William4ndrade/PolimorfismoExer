package Ex3;

import java.util.List;

public class item {


    private String titulo;
    private int tempoDuração;
    private List<String> comentarios;


    public item(String titulo, int tempoDuração, List<String> comentarios) {
        this.titulo = titulo;
        this.tempoDuração = tempoDuração;
        this.comentarios = comentarios;
    }

    public void print(){
        System.out.println("Titulo: " + titulo );
        System.out.println("TempoDuracao: " + tempoDuração );
        System.out.println("Comentarios: " + comentarios );
    }
}
