/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagerenciamentohospital;

/**
 *
 * @author silva
 */
class Convenio {
    private String cobertura;
    private double mensalidade;

    public Convenio() {
        this.cobertura = "Consultas mÃ©dicas";
        this.mensalidade = 100.0;
    }

    public String getCobertura() {
        return cobertura;
    }

    public double getMensalidade() {
        return mensalidade;
    }
}

class ConvenioComum {
    private String cobertura;
    private double mensalidade;

    public ConvenioComum() {
        this.cobertura = "Consultas mÃ©dicas, exames laboratoriais";
        this.mensalidade = 200.0;
    }

    public String getCobertura() {
        return cobertura;
    }

    public double getMensalidade() {
        return mensalidade;
    }
}

class ConvenioPremium {
    private String cobertura;
    private double mensalidade;

    public ConvenioPremium() {
        this.cobertura = "Consultas mÃ©dicas, exames laboratoriais, cirurgias";
        this.mensalidade = 300.0;
    }

    public String getCobertura() {
        return cobertura;
    }

    public double getMensalidade() {
        return mensalidade;
    }
}

