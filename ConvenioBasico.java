/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagerenciamentohospital;

/**
 *
 * @author silva
 */
class ConvenioBasico {
    private String cobertura;
    private double mensalidade;

    public ConvenioBasico() {
        this.cobertura = "Consultas médicas";
        this.mensalidade = 100.0;
    }

    public String getCobertura() {
        return cobertura;
    }

    public double getMensalidade() {
        return mensalidade;
    }
}
