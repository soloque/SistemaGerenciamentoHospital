/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagerenciamentohospital;

/**
 *
 * @author silva
 */
class Mensalidade {
    private double valor;
    private String vencimento;

    public Mensalidade(double valor, String vencimento) {
        this.valor = valor;
        this.vencimento = vencimento;
    }

    public double getValor() {
        return valor;
    }

    public String getVencimento() {
        return vencimento;
    }
}