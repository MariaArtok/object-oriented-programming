package tarefa4.codigo;
import java.util.Scanner;

class FuncionarioTI {
    public String nome;
    public String matricula;

    public FuncionarioTI(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void exibirDados() {
        String dados = "\n== DADOS FUNCIONARIOTI ==\n" +
        "> Nome: " + this.nome + "\n" +
        "> Matrícula: " + this.matricula + "\n";

        System.out.println(dados);
    }

    public void atualizarCadastro() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("== ATUALIZANDO CADASTRO ==");
        System.out.println("NOME ANTERIOR: " + this.nome);
        System.out.println("NOME NOVO: ");

        this.nome = scanner.nextLine();

        System.out.println("MATRICULA ANTERIOR: " + this.matricula);
        System.out.println("MATRICULA NOVA: ");

        this.matricula = scanner.nextLine();
        scanner.close();
    }

    
}