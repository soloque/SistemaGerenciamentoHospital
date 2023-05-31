/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagerenciamentohospital;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author silva
 */
class Medico {

    static void add(Medico medico) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String nome;
    private String especialidade;
    private List<DataConsulta> datasConsultas;
    private boolean isDisponivel;
    private String nomeMedico;
    private String especialidadeMedico;

    public Medico(String nome, String especialidade, boolean isDisponivel) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.datasConsultas = new ArrayList<>();
        this.isDisponivel =isDisponivel;
    }

    Medico(String nomeMedico, String especialidadeMedico) {
        this.nomeMedico=nomeMedico;
        this.especialidadeMedico=especialidadeMedico;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public List<DataConsulta> getDatasConsultas() {
        return datasConsultas;
    }

    public void marcarConsulta(DataConsulta dataConsulta) {
        datasConsultas.add(dataConsulta);
        System.out.println("Consulta marcada com sucesso!");
    }

    public boolean isDisponivel() {
       
        return isDisponivel;
    }
}
