package questao3.codigo;

class PlacaMae {
    private String fabricante;
    private String chipset;
    private int numeroSlots;
    private String tipoMemoria;
    
    public PlacaMae() {
        
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    public void setChipset(String chipset) {
        this.chipset = chipset;
    }
    
    public void setNumeroSlots(int numeroSlots) {
        this.numeroSlots = numeroSlots;
    }

    public void setTipoMemoria(String tipoMemoria) {
        this.tipoMemoria = tipoMemoria;
    }

    
    public String getFabricante() {
        return fabricante;
    }
    
    public String getChipset() {
        return chipset;
    }
    
    public int getNumeroSlots() {
        return numeroSlots;
    }
    
    public String getTipoMemoria() {
        return tipoMemoria;
    }
    
}
