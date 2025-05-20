package questao2.codigo;
import java.util.List;
import java.util.ArrayList;

class Curso {
    private String nome;
    private int cargaHoraria;
    private String nivel;
    private String descricao;
    private List<Instrutor> instrutores;
    
    public Curso(String nome, int cargaHoraria, String nivel, String descricao) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.nivel = nivel;
        this.descricao = descricao;
        this.instrutores = new ArrayList<>();
    }
    
    public void adicionarInstrutor(Instrutor instrutor) {
        if (!instrutores.contains(instrutor)) {
            instrutores.add(instrutor);
            instrutor.adicionarCurso(this);
        }
    }
    
    public void removerInstrutor(Instrutor instrutor) {
        if (instrutores.remove(instrutor)) {
            instrutor.removerCurso(this);
        }
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    
    public String getNivel() {
        return nivel;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public List<Instrutor> getInstrutores() {
        return new ArrayList<>(instrutores);
    }
}