

public class Professor{
    private int matricula;
    private String nome;
    private String nome_departamento;

public Professor(int matricula, String nome, String nome_departamento){
        this.matricula = matricula;
        this.nome = nome;
        this.nome_departamento = nome_departamento;
    }

public int getMatricula(){
    return matricula;
}
public void setMatricula(int matricula){
    this.matricula = matricula;
}
public String getNome(){
    return nome;
}
public void setNome(String nome){
    this.nome = nome;
}
public String getNome_Departamento(){
    return nome_departamento;
}
public void setNome_Departamento(String nome_departamento){
    this.nome_departamento = nome_departamento;
}

public void imprimir(){
    System.out.println("a professora " + getNome() + " trabalha no departamento de " + getNome_Departamento() + " e possui a matricula " + getMatricula());
}
}
