public class Turma{
//atributos
    private Aluno[] aluno = new Aluno [5];
    private int qtde = 0;

//metodos
public void adicionarAluno(Aluno novoAluno){
    if(qtde < aluno.length){
        aluno[qtde] = novoAluno;
        qtde++;
    } else {
        System.out.println("turma lotada!");
    }
}
public void listarAlunos(){
    for(int i = 0; i < qtde; i++){
        aluno[i].exibirInfo();
    }
}
public Aluno buscarPorMatricula(int matricula){
    for(int i = 0; i < qtde; i++){
        if(aluno[i].getMatricula() == matricula){
        return aluno[i];
    }
}
 return null;
}