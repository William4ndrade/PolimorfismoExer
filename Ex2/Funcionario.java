package Ex2;

public class Funcionario extends Pessoa{

    protected int matricula;
    protected float  salarioBase;

    public Funcionario(String nome, String cpf, String rg, int idade, int mat) {
        super(nome, cpf, rg, idade);
        matricula = mat;
        salarioBase = 100;
    }

    public float calculaSalario(){
        return salarioBase;

    }
}
