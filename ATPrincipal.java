
public class ATPrincipal{
    public static void main(String[] args){
//cria uma turma
    Turma turma = new Turma();

//3 ou mais alunos
    Aluno a1 = new Aluno("Joana Maria", 2024, 6.0, 2.5);
    Aluno a2 = new Aluno("José", 2022, 7.6, 6.6);
    Aluno a3 = new Aluno("Sanji", 2902, 9.5, 2.5);
    Aluno a4 = new Aluno("Robin", 2065, 10.0, 10.0);

    turma.adicionarAluno(a2);
    turma.adicionarAluno(a3);
    turma.adicionarAluno(a1);

//listar todos os alunos e as suass innformaçoesss
System.out.println("========== Alunos =========");
    turma.listarAlunos();

//buscar pela matricular
System.out.println("\n======== buscar matricula ========");
    Aluno encontrado = turma.buscarPorMatricula(2065);
    if(encontrado != null){
    encontrado.exibirInfor();
} else{
    System.out.println("Aluno não existe!");
}
 
}