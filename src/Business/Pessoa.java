/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author anderson
 */
public class Pessoa {
    
    public int idPessoa;
    public String Nome;
    public int Endereco;
    public String eMail;
    public String Observacao;

    public Pessoa(int idPessoa, String Nome, int Endereco, String eMail, String Observacao) {
        this.idPessoa = idPessoa;
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.eMail = eMail;
        this.Observacao = Observacao;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getEndereco() {
        return Endereco;
    }

    public void setEndereco(int Endereco) {
        this.Endereco = Endereco;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getObservacao() {
        return Observacao;
    }

    public void setObservacao(String Observacao) {
        this.Observacao = Observacao;
    }
    
}

