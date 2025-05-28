package tarefa4.codigo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<FuncionarioTI> funcionarios = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean executando = true;

        while (executando) {
            System.out.println("\n== MENU PRINCIPAL ==");
            System.out.println("[1] Cadastrar Desenvolvedor");
            System.out.println("[2] Cadastrar Administrador de Redes");
            System.out.println("[3] Listar Funcionários");
            System.out.println("[4] Sair");
            System.out.print("> Escolha uma opção: ");

            try {
                int opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {
                    case 1:
                        cadastrarDesenvolvedor();
                        break;
                    case 2:
                        cadastrarAdministradorRede();
                        break;
                    case 3:
                        listarFuncionarios();
                        break;
                    case 4:
                        executando = false;
                        System.out.println("Encerrando o programa...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite um número válido.");
            }
        }
        scanner.close();
    }

    private static void cadastrarDesenvolvedor() {
        System.out.println("\n== CADASTRO DE DESENVOLVEDOR ==");
        
        System.out.print(">> Nome: ");
        String nome = scanner.nextLine();

        System.out.print(">> Matrícula: ");
        String matricula = scanner.nextLine();

        System.out.print(">> Linguagem Principal: ");
        String linguagemPrincipal = scanner.nextLine();

        System.out.print(">> Nível (Júnior/Pleno/Sênior): ");
        String nivel = scanner.nextLine();

        Desenvolvedor dev = new Desenvolvedor(nome, matricula);
        dev.linguagemPrincipal = linguagemPrincipal;
        dev.nivel = nivel;

        funcionarios.add(dev);
        System.out.println("Desenvolvedor cadastrado com sucesso!");
    }

    private static void cadastrarAdministradorRede() {
        System.out.println("\n== CADASTRO DE ADMINISTRADOR DE REDES ==");
        
        System.out.print(">> Nome: ");
        String nome = scanner.nextLine();

        System.out.print(">> Matrícula: ");
        String matricula = scanner.nextLine();

        System.out.print(">> Certificação: ");
        String certificacao = scanner.nextLine();

        System.out.print(">> Sistema Operacional Responsável: ");
        String sistemaOperacional = scanner.nextLine();

        AdministradorRede admin = new AdministradorRede(nome, matricula);
        admin.certificacao = certificacao;
        admin.sistemaOperacionalResponsavel = sistemaOperacional;

        funcionarios.add(admin);
        System.out.println("Administrador de Redes cadastrado com sucesso!");
    }

    private static void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("\nNenhum funcionário cadastrado.");
            return;
        }

        System.out.println("\n== LISTA DE FUNCIONÁRIOS ==");
        for (FuncionarioTI func : funcionarios) {
            System.out.println(func);
            System.out.println("----------------------");
        }
    }
}