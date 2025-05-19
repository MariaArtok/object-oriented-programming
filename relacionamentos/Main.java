public class Main {
    public static void main(String[] args) {

        Universidade universidade = new Universidade("UNIFESSPA");
        universidade.adicionarDepartamento("Faculdade de Engenharia da Computação");
        universidade.adicionarDepartamento("Faculdade de Engenharia Elétrica");
        universidade.listarDepartamentos();

        System.out.println("-----------");

        Professor professor1 = new Professor("Adolfo Fernando Silva Cunha");
        Professor professor2 = new Professor("Lucas Oliveira");

    }   
}
