public class Aluno{
//atributos
private String nome;
private int matricula;
private double nota1;
private double nota2;

//construtor
public Aluno(String nome, int matricula, double nota1, double nota2){
    this.nome = nome;
    this.matricula = matricula;
    this.nota1 = nota1;
    this.nota2 = nota2;
}
//gets e sets
public String getNome(){return nome;}
public void setNome(String nome){ this.nome = nome;}

public int getMatricula(){ return matricula; }
public void setMatricula(int matricula){ this.matricula = matricula; }

public double getNota1(){ return nota1; }
public void setNota1(double nota1){ this.nota1 = nota1; }

public double getNota2(){ return nota2; }
public void setNota2(double nota2){ this.nota2 = nota2; }

//metodos
public double calcularMedia(){
    return (nota1 + nota2) / 2;
}
public String situacao(){
    if (calcularMedia() >= 7.0) {
        return "aprovado";
    } 
    else{
        return "reprovado";

    }
}

public void exibirInfo(){
    System.out.println("aluno(a): " + nome + "\nmatricula: " + matricula +
    "\nnotas:  " + nota1 + ", " + nota2 + "\nmedias: " + calcularMedia() +
    "\nsituacao: " + situacao());
    
}
}