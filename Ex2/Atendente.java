package Ex2;

public class Atendente extends  Funcionario {


    private float comissao;
    private int numvendas;


    public Atendente(String nome, String cpf, String rg, int idade, int mat) {
        super(nome, cpf, rg, idade, mat);
        this.comissao = 0.45f;
        this.numvendas = 0;
    }


    public void computaVenda(){
        numvendas++;

    }

    public float calculaSalario(){
        return (salarioBase + numvendas*comissao);
    }
}
