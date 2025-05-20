package questao4.codigo;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("Hospital Geral");
   
        UnidadeAtendimento prontoSocorro = new UnidadeAtendimento("Pronto Socorro 24h", "Pronto Socorro");
        UnidadeAtendimento enfermaria = new UnidadeAtendimento("Enfermaria A", "Enfermaria");
        
        hospital.adicionarUnidade(prontoSocorro);
        hospital.adicionarUnidade(enfermaria);

        Medico drSilva = new Medico("Dr. Silva", "CRM/SP 12345", "Cardiologista");
        Medico draSantos = new Medico("Dra. Santos", "CRM/SP 54321", "Pediatra");
        
        prontoSocorro.adicionarMedico(drSilva);
        prontoSocorro.adicionarMedico(draSantos);
        enfermaria.adicionarMedico(drSilva);
        
        Paciente paciente1 = new Paciente("João da Silva", "123.456.789-00");
        Paciente paciente2 = new Paciente("Maria Oliveira", "987.654.321-00");
        
        Consulta consulta1 = new Consulta(drSilva, paciente1, "2023-05-20", "14:30");
        consulta1.setDiagnostico("Hipertensão arterial");
        
        Consulta consulta2 = new Consulta(draSantos, paciente2, "2023-05-21", "10:00");
   
        System.out.println("Hospital: " + hospital.getNome());
        System.out.println("Unidades:");
        for (UnidadeAtendimento unidade : hospital.getUnidades()) {
            System.out.println(" - " + unidade.getNome() + " (" + unidade.getTipo() + ")");
            System.out.println("   Médicos:");
            for (Medico medico : unidade.getMedicos()) {
                System.out.println("   * " + medico.getNome() + " - " + medico.getEspecialidade());
            }
        }
    }
}
