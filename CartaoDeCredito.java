public class CartaoDeCredito extends Pagamento{
    private int quantidadeParcelas;

//costrutor
public CartaoDeCredito(String nomeCliente, double valor, int quantidadeParcelas){
    this.nomeCliente = nomeCliente;
    this.valor = valor;
    this.quantidadeParcelas = quantidadeParcelas;
}
//metodos
public double processarPagamento(){
    return (valor + (valor * quantidadeParcelas / 100)) ;
}
}