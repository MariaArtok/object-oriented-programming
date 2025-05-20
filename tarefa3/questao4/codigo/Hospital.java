package questao4.codigo;

import java.util.ArrayList;
import java.util.List;


public class Hospital {
    private String nome;
    private List<UnidadeAtendimento> unidades;

    public Hospital(String nome) {
        this.nome = nome;
        this.unidades = new ArrayList<>();
    }

    public void adicionarUnidade(UnidadeAtendimento unidade) {
        unidades.add(unidade);
    }

    public void removerUnidade(UnidadeAtendimento unidade) {
        unidades.remove(unidade);
    }

    public List<UnidadeAtendimento> getUnidades() {
        return new ArrayList<>(unidades);
    }

    public String getNome() {
        return nome;
    }
}