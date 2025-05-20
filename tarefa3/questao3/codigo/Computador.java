package questao3;

class Computador {
    private String marca;
    private String modelo;
    private String processador;
    private String memoriaRAM;
    private PlacaMae placaMae;  // Relação de composição
    
    public Computador(String marca, String modelo, String processador, String memoriaRAM) {
        this.marca = marca;
        this.modelo = modelo;
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.placaMae = new PlacaMae();  // Placa-mãe é criada junto com o computador
    }
    
    public void atualizarPlacaMae(String fabricante, String chipset, int numeroSlots, String tipoMemoria) {
        this.placaMae.setFabricante(fabricante);
        this.placaMae.setChipset(chipset);
        this.placaMae.setNumeroSlots(numeroSlots);
        this.placaMae.setTipoMemoria(tipoMemoria);
    }
    
    public String exibirInformacoesCompletas() {
        return "COMPUTADOR: " + marca + " " + modelo + "\n" +
               "Processador: " + processador + "\n" +
               "Memória RAM: " + memoriaRAM + "\n" +
               "PLACA-MÃE:\n" +
               "  Fabricante: " + placaMae.getFabricante() + "\n" +
               "  Chipset: " + placaMae.getChipset() + "\n" +
               "  Número de slots: " + placaMae.getNumeroSlots() + "\n" +
               "  Tipo de memória suportada: " + placaMae.getTipoMemoria();
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void setProcessador(String processador) {
        this.processador = processador;
    }

    
    public void setMemoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }


    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public String getProcessador() {
        return processador;
    }
    
    public String getMemoriaRAM() {
        return memoriaRAM;
    }
    
    public PlacaMae getPlacaMae() {
        return placaMae;
    }
    
}