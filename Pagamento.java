public class abstract Pagamento{
   private  String nomeCliente;
   private double valor;

public Pagamento(String nomeCliente, double valor){
    this.nomeCliente = nomeCliente;
    this.valor = valor;
}
// método abstrato  
public abstract boolean processarPagamento();

}

