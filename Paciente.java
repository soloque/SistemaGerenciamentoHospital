package sistemagerenciamentohospital;

import java.util.List;

class Paciente {
    private String nome;
    private String tipoSanguineo;
    private String tipoConvenio;
    private List<String> outrasDoencas;
    private boolean alergiaSubstancias;
    private boolean alta;
     private int cadastrarMensalidade;

    public Paciente(String nome, String tipoSanguineo, String tipoConvenio, List<String> outrasDoencas, boolean alergiaSubstancias, boolean alta) {
        this.nome = nome;
        this.tipoSanguineo = tipoSanguineo;
        this.tipoConvenio = tipoConvenio;
        this.outrasDoencas = outrasDoencas;
        this.alergiaSubstancias = alergiaSubstancias;
        this.alta = alta;
        this.cadastrarMensalidade = cadastrarMensalidade;
    }

    public String getNome() {
        return nome;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }
    
    public boolean isAlergiaSubstancias() {
    return alergiaSubstancias;
}
    public void setTipoSanguineo(String tipoSanguineo) {
    this.tipoSanguineo = tipoSanguineo;
}

    public String getTipoConvenio() {
        return tipoConvenio;
    }

    public List<String> getOutrasDoencas() {
        return outrasDoencas;
    }

    public boolean hasAlergiaSubstancias() {
        return alergiaSubstancias;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }
    public void setAlergiaSubstancias(boolean novaAlergia) {
    this.alergiaSubstancias= alergiaSubstancias;
}
  
    public void setTipoConvenio(String novoTipoConvenio) {
    this.tipoConvenio= tipoConvenio;
}
    
    public void setOutrasDoencas(List<String> listaDoencas){
    this.outrasDoencas= outrasDoencas;
}

    public void cadastrarMensalidade(Mensalidade mensalidade) {
        this.cadastrarMensalidade = cadastrarMensalidade;
    }
    
 

  

 

  
    

    
}
