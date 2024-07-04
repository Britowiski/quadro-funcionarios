public class Funcionarios {
    private String nomeFuncionario;
    private String cargo;
    private double salario;

    public Funcionarios(){
    }

    public Funcionarios(String nome, String cargo, double salario){
        this.nomeFuncionario = nome;
        this.cargo = cargo;
        this.salario = salario;
    }



    public String getNome() {
        return nomeFuncionario;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setNome(String nome) {
        this.nomeFuncionario = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void exibirInfo(){
        System.out.println("Nome: " +nomeFuncionario);
        System.out.println("Cargo: " +cargo);
        System.out.println("Salário: " +salario);
    }
}
