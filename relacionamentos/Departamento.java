import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String descricao;
    private List<Professor> professores;

    public Departamento(String descricao) {
        this.descricao = descricao;
        this.professores = new ArrayList<Professor>();
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }
}  
