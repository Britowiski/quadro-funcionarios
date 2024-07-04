public class QuadroFuncionarios extends Gerentes{
    public static void main(String args[]){
        Gerentes manegerTeste1 = new Gerentes("teste teste",
                "Gerente",
                5000.0,
                "teste",
                3,
                "teste teste",
                "Estágiario",
                2000.0);
        manegerTeste1.exibirInfo();

        System.out.println("\n");

        Gerentes mangerTeste2 = new Gerentes(
                "teste teste",
                "Gerente",
                7000.0,
                "teste teste",
                2,
                "teste teste",
                "Programador Junior",
                3500.0
        );
        mangerTeste2.exibirInfo();
    }
}
