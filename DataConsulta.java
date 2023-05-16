/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagerenciamentohospital;

/**
 *
 * @author silva
 */
class DataConsulta {
    private String data;
    private Medico medico;

    public DataConsulta(String data, Medico medico) {
        this.data = data;
        this.medico = medico;
    }

    public String getData() {
        return data;
    }

    public Medico getMedico() {
        return medico;
    }
}
