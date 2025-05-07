//class
public class Pessoa{ 
    //atributos
    private String nome;
    private int idade;

    //construtor
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    //metodo  
    public void falar(){
        System.out.println("Ola Mundo Novo!");
    }
        
}