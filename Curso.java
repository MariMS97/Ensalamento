import java.util.List;
import java.util.ArrayList;
public class Curso {
    private String nome;
    private List<Disciplina> disciplinas;

    public Curso(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    public List<Disciplina> getDisciplinas(){
        return disciplinas;
    }

    public void adicionarDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }
}
