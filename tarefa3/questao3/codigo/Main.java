package questao3;

public class Main {
    public static void main(String[] args) {
        Computador computador1 = new Computador("Dell", "Inspiron 15", "Intel Core i5", "16GB DDR4");
        Computador computador2 = new Computador("HP", "Pavilion", "AMD Ryzen 7", "32GB DDR4");

        System.out.println(computador1.exibirInformacoesCompletas());
        System.out.println();
        System.out.println(computador2.exibirInformacoesCompletas());
        
        computador1.atualizarPlacaMae("Dell", "H470", 4, "DDR4");
        computador2.atualizarPlacaMae("HP", "B550", 2, "DDR4");
        
        System.out.println(computador1.exibirInformacoesCompletas());
        System.out.println();
        System.out.println(computador2.exibirInformacoesCompletas());
    }
}
