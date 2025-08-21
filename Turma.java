public class Turma{
//atributos
    private Aluno[] aluno = new Aluno [5];
    private int qtde = 0;

//metodos
public void adicionarAluno(Aluno aluno){
    if(qtde < alunos.length){
        alunos[qtde] = aluno;
        qtde++;
    } else {
        system.out.println("turma lotada!");
    }
}
public void listarAlunos(){
    for(int i = 0, i < aluno.length; i++){
        System.out.println(Aluno[i]);
    }
}
public Aluno buscarPorMatricula(int matricula){
    return matricula;
}
}