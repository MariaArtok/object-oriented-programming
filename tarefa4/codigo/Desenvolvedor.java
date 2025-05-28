package tarefa4.codigo;

public class Desenvolvedor extends FuncionarioTI {
    
    public Desenvolvedor(String nome, String matricula){
        super(nome, matricula);
    }

    String linguagemPrincipal;
    String nivel;

    public void exibirDados() {
        String dados = "\n== DADOS DESENVOLVEDOR ==\n" +
        "> Nome: " + this.nome + "\n" +
        "> Matrícula: " + this.matricula + "\n" +
        "> Linguagem Principal: " + this.linguagemPrincipal +
        "> Nível: " + this.nivel;

        System.out.println(dados);
    }

    public void desenvolverProjeto() {
        System.out.println(this.nome + " está desenvolvendo o projeto");
    }

    public void atualizarProjeto() {
        System.out.println(this.nome + " está atualizando o projeto");
    }
}


