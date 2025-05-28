package tarefa4.codigo;

public class AdministradorRede extends FuncionarioTI {
    
    public AdministradorRede(String nome, String matricula) {
        super(nome, matricula);
    }

    String certificacao;
    String sistemaOperacionalResponsavel;

    public void monitorarRede() {
        System.out.println(this.nome + "está monitorando a rede");
    }

    public void realizarBackup() {
        System.out.println(this.nome + "está fazendo Backup");
    }
}
