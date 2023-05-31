package sistemagerenciamentohospital;

import java.util.ArrayList;
import java.util.List;

public class DataConsulta {
    private String data;
    private Medico medico;
    private List<Paciente> pacientesAgendados;

    public DataConsulta(String data, Medico medico) {
        this.data = data;
        this.medico = medico;
        this.pacientesAgendados = new ArrayList<>();
    }

    public String getData() {
        return data;
    }

    public Medico getMedico() {
        return medico;
    }

    public List<Paciente> getPacientesAgendados() {
        return pacientesAgendados;
    }

    public void marcarConsulta(Paciente paciente) {
        pacientesAgendados.add(paciente);
        System.out.println("Consulta marcada para o paciente " + paciente.getNome() + " na data " + data);
    }

    public void desmarcarConsulta(Paciente paciente) {
        pacientesAgendados.remove(paciente);
        System.out.println("Consulta desmarcada para o paciente " + paciente.getNome() + " na data " + data);
    }
}
