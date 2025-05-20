package questao2.codigo;
import java.util.List;
import java.util.ArrayList;


class Instrutor {
    private String nome;
    private String formacao;
    private String email;
    private int anosExperiencia;
    private List<Curso> cursos;
    
    public Instrutor(String nome, String formacao, String email, int anosExperiencia) {
        this.nome = nome;
        this.formacao = formacao;
        this.email = email;
        this.anosExperiencia = anosExperiencia;
        this.cursos = new ArrayList<>();
    }
    

    public void adicionarCurso(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
        }
    }
    
    public void removerCurso(Curso curso) {
        cursos.remove(curso);
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public String getNome() {
        return nome;
    }
    
    public String getFormacao() {
        return formacao;
    }
    
    public String getEmail() {
        return email;
    }
    
    public int getAnosExperiencia() {
        return anosExperiencia;
    }
    
    public List<Curso> getCursos() {
        return new ArrayList<>(cursos); // Retorna cópia para evitar modificações externas
    }
}
