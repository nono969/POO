public abstract class Cliente{
//atributos
private String nome;
private double valorDaCompra;
//construtor 
public Cliente(String nome, double valorDaCompra){
    this.nome = nome;
    this.valorDaCompra = valorDaCompra;
}
//metodo
public abstract double calcularPagamento();

public String getNome(){
    return nome;
}
public double getValorDaCompra(){
    return valorDaCompra;
}

//imprimir
public String toString(){
    return "nome: " + nome + "valor da compra:  R$" + valorDaCompra;
 }
}