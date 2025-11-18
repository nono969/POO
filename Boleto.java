public class Boleto extends Pagamento{
    private String linhaDigitavel;

//cinstrutor
public Boleto(String nomeCliente, double valor, String linhaDigitavel){
    this.nomeCliente = nomeCliente;
    this.valor = valor;
    this.linhaDigitavel = linhaDigitavel;
}

//metodos
public double processarPagamento(){
    return valor + (valor * 0.015);//o entre parenteses é para calcular o valor da taxa
}
}