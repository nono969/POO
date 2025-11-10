public class ClienteRegular extends Cliente{    
//construtor
public ClienteRegular(String nome, double valorDaCompra){
    super(nome, valorDaCompra);
}
//implementação do metodo abstrato
public double calcularPagamento(){
    return getValorDaCompra(); //o cliente dessa classe nao tem desconto
}
public String toString(){
    return "ClienteRegular: " + nome + "Valor a pagar: R$" + calcularPagamento(); 
}
}