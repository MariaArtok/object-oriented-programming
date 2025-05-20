package questao1.codigo;

public class Main {
    public static void main(String[] args) {

        Pessoa joao = new Pessoa("João");
        Pessoa maria = new Pessoa("Maria-chan");
        
        Carro gol = new Carro("Volkswagen", "Gol");
        Carro hb20 = new Carro("Hyundai", "HB20");
        Carro uno = new Carro("Fiat", "Uno");
        
        joao.usarCarro(gol);
        joao.usarCarro(hb20);
        
        maria.usarCarro(uno);
        maria.usarCarro(gol); 
        
        System.out.println("João dirigiu: ");
        for (Carro carro : joao.getCarrosDirigidos()) {
            System.out.println(carro.getModelo());
        }

        System.out.println("\nMotorista atual do Gol:");
        System.out.println(gol.getMotoristaAtual().getNome());
    }
}