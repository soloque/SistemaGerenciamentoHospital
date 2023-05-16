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
    private String nome;
    private String especialidade;
    private List<DataConsulta> datasConsultas;

    public Medico(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.datasConsultas = new ArrayList<>();
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

    boolean isDisponivel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
