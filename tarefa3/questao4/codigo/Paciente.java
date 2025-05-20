package questao4.codigo;

import java.util.ArrayList;
import java.util.List;

class Paciente {
    private String nome;
    private String cpf;
    private List<Consulta> consultas;

    public Paciente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.consultas = new ArrayList<>();
    }

    public void adicionarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public List<Consulta> getConsultas() {
        return new ArrayList<>(consultas);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}

