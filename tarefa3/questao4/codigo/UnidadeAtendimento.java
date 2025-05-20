package questao4.codigo;

import java.util.ArrayList;
import java.util.List;

class UnidadeAtendimento {
    private String nome;
    private String tipo; // UPA, Pronto Socorro, Enfermaria, etc.
    private List<Medico> medicos; // Relação de agregação

    public UnidadeAtendimento(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.medicos = new ArrayList<>();
    }

    public void adicionarMedico(Medico medico) {
        medicos.add(medico);
        medico.adicionarUnidade(this); // Atualiza a relação bidirecional
    }

    public void removerMedico(Medico medico) {
        medicos.remove(medico);
        medico.removerUnidade(this); // Atualiza a relação bidirecional
    }

    public List<Medico> getMedicos() {
        return new ArrayList<>(medicos); // Retorna cópia para preservar encapsulamento
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }
}
