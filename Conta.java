 public class Conta{
    
    //ATRIBUTOS
  private int numero_conta;
  private String nome_cliente;
  private double saldo;
  private boolean ativa;
  
  //CONSTRUTOR
  public Conta(int numero_conta, String nome_cliente){
      this.numero_conta = numero_conta;
      this.nome_cliente = nome_cliente;
      this.saldo = 0.0; //começa com o saldo 0
      this.ativa = true; //a conta começa sempre ativa
      
  }
  //METODOS
  //depositar
  public void depositar(double valor){
    if (valor > 0 && ativa){
        saldo += valor;
        System.out.println("Realizado com sucesso.");
    } else {
        System.out.println("Não podemos realizar esse deposito.");
    }
}
  //sacar  
 public void sacar(double valor){
     if (valor <= saldo && ativa){
         saldo -= valor;
         System.out.println("Valor sacado.");
     } else {
         System.out.println("Saque não sacado.");
     }
 }
 //desativar
 public void desativar(){
     if (ativa){
         ativa = false;
         System.out.println("Conta desativada.");
      } else {
          System.out.println("Conta ja estar desativada.");
      }
 }
 //ativar
 public void ativar(){
     if (!ativa){       // "!" significa NÃO no java
         ativa = true;
         System.out.println("Conta ativada!");
     } else {
         System.out.println("A conta ja estar ativada!");
     }
 }
 //exibir vai chama o toString
 public String toString(){
     return "Conta: " + numero_conta + "\nCliente: " + nome_cliente +
     "\n Saldo: R$ " + saldo + "\nAtiva: " + (ativa ? "Sim": "Não");
 }
 public void exibir(){
     System.out.println(toString());
 }
 //metodos gets e sets (encapsulamento)
 public int getNumero_Conta(){ return numero_conta; }
 public void setNumero_Conta(int numero_conta){ this.numero_conta = numero_conta;}
 
 public String getNome_Cliente(){ return nome_cliente; }
 public void setNome_Cliente(String nome_cliente){ this.nome_cliente = nome_cliente; }
 
 public double getSaldo(){ return saldo; }
 public void setSaldo(double saldo){ this.saldo = saldo; }
 
 public boolean getAtiva(){ return ativa; }
 public void setAtiva(boolean ativa){ this.ativa = ativa; }
 }
