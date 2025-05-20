package questao1.codigo;

import java.util.ArrayList;
import java.util.List;

class Pessoa {
    private String nome;
    private List<Carro> carrosDirigidos;
    
    public Pessoa(String nome) {
        this.nome = nome;
        this.carrosDirigidos = new ArrayList<>();
    }
    
    public void usarCarro(Carro carro) {
        if (carro.getMotoristaAtual() != null) {
            carro.getMotoristaAtual().carrosDirigidos.remove(carro);
        }
        
        carro.setMotoristaAtual(this);

        if (!carrosDirigidos.contains(carro)) {
            carrosDirigidos.add(carro);
        }
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public List<Carro> getCarrosDirigidos() {
        return new ArrayList<>(carrosDirigidos); // Retorna cópia para evitar modificações externas
    }
}
