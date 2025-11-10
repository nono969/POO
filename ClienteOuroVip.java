public class ClienteOuroVip extends ClienteVip{
    private String endereco;
//construtor
public ClienteOuroVip(String nome, double valorDaCompra, String numeroCartao, String endereco){
    super(nome, valorDaCompra, numeroCartao);
    this.endereco = endereco;
}
//metodos
public double calcularPagamento(){
    return getValorDaCompra() * 0.85; //15% desconto
}
public String getEndereco(){
    return endereco;
}
public String toString(){
    return "ClienteOuroVip: " + super.toString() + "endereco: " + endereco + "valor a paga: R$" + valorDaCompra();
}
}