package questao4.codigo;

class Consulta {
    private Medico medico;
    private Paciente paciente;
    private String data;
    private String horario;
    private String diagnostico;

    public Consulta(Medico medico, Paciente paciente, String data, String horario) {
        this.medico = medico;
        this.paciente = paciente;
        this.data = data;
        this.horario = horario;
        this.medico.adicionarConsulta(this); 
        this.paciente.adicionarConsulta(this); 
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public String getData() {
        return data;
    }

    public String getHorario() {
        return horario;
    }

    public String getDiagnostico() {
        return diagnostico;
    }
}