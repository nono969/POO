public class PrincipalFuncionario{
    public static void main(String[] args){
        Funcionario funcionario1 = new Funcionario( 1, "Rhilary", "123.456.789-00", "Rua das stay, 987", "(11) 9863-0839", 17, 38000f);
        System.out.println(funcionario1);
        System.out.println("Salário Líquido: R$" + funcionario1.calculaSalarioLiquido());
    }
}