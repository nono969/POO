public class Quadrado{
//atributos
    private int lado;

//construtor
    public Quadrado(int lado){
        this.lado = lado; 
  }
//metodos
  public int calcularArea(){
    return lado * lado;
}
public int calcularPerimentro(){
    return 4 * lado;
}

public void imprimir(){
    System.out.printf("lado: %d, Area: %d. perimentro: %d \n", lado, calcularArea(), calcularPerimentro());
}

}