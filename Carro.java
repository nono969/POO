public class Carro{
    private String fabricante;
    private String modelo; 
    private int ano;
    private float velocidade; 

    public Carro(String fabricante, String modelo, int ano){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
    }
    public String getFabricante(){
        return fabricante; 
    } 
    public void setFabricante (String fabricante){
        this.fabricante = fabricante; 
    }
    public void setModelo (String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return modelo;
    }
    public void setAno (int ano){
        this.ano = ano;
    }
    public int getAno(){
        return ano;
    }
    public float velocidade(){
        return velocidade;
    }
    public void setVelocidade(float velocidade){
        this.velocidade = velocidade; 
    }
    //metodo  
    public void acelerar(){ 
        if (velocidade < 110){
         velocidade = velocidade + 10;
        }
    }
    public void frear(){
        if (velocidade > 0){
            velocidade = velocidade - 10;
        }
    }
     }
