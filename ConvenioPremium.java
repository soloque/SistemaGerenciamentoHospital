/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagerenciamentohospital;

/**
 *
 * @author silva
 */
class ConvenioPremium {
    private String cobertura;
    private double mensalidade;

    public ConvenioPremium() {
        this.cobertura = "Consultas médicas, exames laboratoriais, cirurgias";
        this.mensalidade = 300.0;
    }

    public String getCobertura() {
        return cobertura;
    }

    public double getMensalidade() {
        return mensalidade;
    }
}
