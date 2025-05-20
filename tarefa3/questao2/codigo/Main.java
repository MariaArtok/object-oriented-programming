package questao2.codigo;

public class Main {
    public static void main(String[] args) {

        Instrutor instrutor1 = new Instrutor("Ana Silva", "Ciência da Computação", "ana.silva@email.com", 5);
        Instrutor instrutor2 = new Instrutor("Carlos Oliveira", "Engenharia de Software", "carlos.oliveira@email.com", 8);
        Instrutor instrutor3 = new Instrutor("Mariana Costa", "Sistemas de Informação", "mariana.costa@email.com", 3);
        
        Curso curso1 = new Curso("Java Básico", 40, "Iniciante", "Curso de Exatas");
        curso1.adicionarInstrutor(instrutor1);
        curso1.adicionarInstrutor(instrutor2);
        
        Curso curso2 = new Curso("Java Avançado", 60, "Avançado", "Java");
        curso2.adicionarInstrutor(instrutor2);
        curso2.adicionarInstrutor(instrutor3);
    
    }
}
