public class Pix extends Pagamento{
private String chave;

//construtor
public Pix(String nomeCliente, double valor, String chave){
    this.nomeCliente = nomeCliente;
    this.valor = valor;
    this.chave = chave;
}
//metodo
public double processarPagamento(){
    return valor; //retornar o valor do pagamento sem taxas.
}
}