package Ex2;

public class Piloto extends Funcionario {

    private int numhoras;


    public Piloto(String nome, String cpf, String rg, int idade, int mat, int nh) {
        super(nome, cpf, rg, idade, mat);
        numhoras = nh;
    }

    public float calculaSalario(){
        return (salarioBase + numhoras*4);
    }
}
