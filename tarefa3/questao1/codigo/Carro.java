package questao1.codigo;

class Carro {
    private String marca;
    private String modelo;
    private Pessoa motoristaAtual;
    
    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.motoristaAtual = null;
    }
    
    public void dirigir() {
        System.out.println("O carro " + modelo + " está em movimento.");
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMotoristaAtual(Pessoa motorista) {
        this.motoristaAtual = motorista;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public Pessoa getMotoristaAtual() {
        return motoristaAtual;
    }
    
}
