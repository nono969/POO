public class ClienteVip extends Cliente{
    private String numeroCartao;
//construtor
public ClienteVip(String nome, double valorDaCompra, String numeroCartao){
    super(nome, valorDaCompra);
    this.numeroCartao = numeroCartao;
}
//metodos
public double calcularPagamento(){
    return getValorDaCompra() * 0.90; //VIP 10% DE DESCONTO
}
public String getNumeroCartao(){
    return numeroCartao;
}
public String toString(){
    return "ClienteVip: " + super.toString() + "Cartao: " + numeroCartao + "Valor a pagar: R$" + valorDaCompra();
}
}