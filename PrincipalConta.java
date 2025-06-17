public class PrincipalConta {
    public static void main(String[] args){
        
    //3 objetos conta
    Conta c1 = new Conta(202, "Gojo");
    Conta c2 = new Conta(203, "Geto");
    Conta c3 = new Conta(196, "Ino");
    
    //exibir estado inicial
    System.out.println("-----Estado inicial:-----");
    c1.exibir();
    c2.exibir();
    c3.exibir();
    
    //deposito em cada conta
    c1.depositar(500);
    c2.depositar(3000);
    c3.depositar(1000);
    
    //exibir o estado das contas pos deposito
    System.out.println("-----Após o deposito:-----");
    c1.exibir();
    c2.exibir();
    c3.exibir();
    
    //alterar o nome do cliente em cada conta
    c1.setNome_Cliente("Nami");
    c2.setNome_Cliente("Zoro");
    c3.setNome_Cliente("Tsunade");
    
    //realizar um saque em  cada conta
    c1.sacar(370);
    c2.sacar(2000);
    c3.sacar(100);
    
    //exibir o estado da conta 
    System.out.println("-----Depois do saque:-----");
    c1.exibir();
    c2.exibir();
    c3.exibir();
    
    //desativa duas contas
    c2.desativar();
    c3.desativar();
    
    //exibir o estado da conta 
    System.out.println("-----Estado Final:-----");
    c1.exibir();
    c2.exibir();
    c3.exibir();
    
    }
}
