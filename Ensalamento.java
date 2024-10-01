import java.util.List;
import java.util.ArrayList;
public class Ensalamento {
    public void realizarEnsalamento(){
        Curso cursoTI = new Curso("TI");
        Curso cursoADM = new Curso("ADM");

        Disciplina poo = new Disciplina("POO", cursoTI);
        Disciplina estruturaDeDados = new Disciplina("Estrutura de Dados", cursoTI);
        Disciplina bi = new Disciplina("BI", cursoADM);

        Professor profMia = new Professor("Mia", poo);
        Professor profSaulo = new Professor("Saulo", estruturaDeDados);
        Professor profPaula = new Professor("Paula", bi);

        List<Aluno> alunos = List.of(
                new Aluno("Alfredo", cursoTI),
                new Aluno("Amélia", cursoTI),
                new Aluno("Ana", cursoADM),
                new Aluno("Bruno", cursoTI),
                new Aluno("Bentinho", cursoADM),
                new Aluno("Capitú", cursoTI),
                new Aluno("Debra", cursoTI),
                new Aluno("Ian", cursoADM),
                new Aluno("Iracema", cursoTI),
                new Aluno("Joelmir", cursoADM),
                new Aluno("Julieta", cursoTI),
                new Aluno("Luana", cursoADM),
                new Aluno("Luciana", cursoTI),
                new Aluno("Majô", cursoADM),
                new Aluno("Maria", cursoADM),
                new Aluno("Norberto", cursoTI),
                new Aluno("Paulo", cursoADM),
                new Aluno("Romeu", cursoADM),
                new Aluno("Wendel", cursoTI),
                new Aluno("Zoey", cursoTI)

        );

        Turma turmaPOO = new Turma(profMia, poo);
        Turma turmaEstruturaDeDados = new Turma(profSaulo, estruturaDeDados);
        Turma turmaBI = new Turma(profPaula, bi);
        for (Aluno aluno : alunos) {
            if (aluno.getCurso().getNome().equals("TI")) {  // Verifica o nome do curso
                if (aluno.getNome().equals("Bruno") || aluno.getNome().equals("Norberto")) {
                    turmaEstruturaDeDados.adicionarAluno(aluno);
                } else {
                    turmaPOO.adicionarAluno(aluno);
                }
            } else if (aluno.getCurso().getNome().equals("ADM")) {  // Verifica o nome do curso
                turmaBI.adicionarAluno(aluno);
            }
        }
        turmaPOO.exibirTurma();
        turmaEstruturaDeDados.exibirTurma();
        turmaBI.exibirTurma();
    }
}
