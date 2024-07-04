public class Gerentes extends Funcionarios{
    private String nomeGerente;
    int numFuncionarios;
    private String nomeEncarregado;
    private String cargoEncarregado;
    private double salarioEncarregado;


    public Gerentes(String nomeGerente){
        this.nomeGerente = nomeGerente;
    }

    public Gerentes(){

    }

    public String getNomeGerente() {
        return nomeGerente;
    }


    public Gerentes(String nomeFuncionario, String cargo, double salario, String nomeGerente, int numFuncionarios, String nomeEncarregado, String cargoEncarregado,double salarioEncarregado ){
        super(nomeFuncionario, cargo, salario);
        this.nomeGerente = nomeGerente;
        this.numFuncionarios = numFuncionarios;
        this.nomeEncarregado = nomeEncarregado;
        this.cargoEncarregado = cargoEncarregado;
        this.salarioEncarregado = salarioEncarregado;

    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();

        System.out.println("Numero de funcionários: " +numFuncionarios);
        System.out.println("\n");

        System.out.println("Funcionário : " +nomeEncarregado);
        System.out.println("Cargo: " +cargoEncarregado);
        System.out.println("Salário: " +salarioEncarregado);

    }
}
