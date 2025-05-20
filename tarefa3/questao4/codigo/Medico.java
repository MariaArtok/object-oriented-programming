package questao4.codigo;

import java.util.ArrayList;
import java.util.List;

class Medico {
    private String nome;
    private String crm;
    private String especialidade;
    private List<UnidadeAtendimento> unidades; 
    private List<Consulta> consultas;

    public Medico(String nome, String crm, String especialidade) {
        this.nome = nome;
        this.crm = crm;
        this.especialidade = especialidade;
        this.unidades = new ArrayList<>();
        this.consultas = new ArrayList<>();
    }

    public void adicionarUnidade(UnidadeAtendimento unidade) {
        unidades.add(unidade);
    }

    public void removerUnidade(UnidadeAtendimento unidade) {
        unidades.remove(unidade);
    }

    public void adicionarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public List<UnidadeAtendimento> getUnidades() {
        return new ArrayList<>(unidades);
    }

    public List<Consulta> getConsultas() {
        return new ArrayList<>(consultas);
    }

    public String getNome() {
        return nome;
    }

    public String getCrm() {
        return crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}
