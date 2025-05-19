public class Professor {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void ministrarAula(Disciplina disciplina) {
        System.out.println(this.nome + " está ministrando a disciplina " + disciplina.getDescricao());
    }
}