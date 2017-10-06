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
public class PessoaFisica extends Pessoa implements Endereco, Telefone{

    /**
     *
     * @param idPessoa
     * @param Nome
     * @param Endereco
     * @param eMail
     * @param Observacao
     * @param CPF
     * @param Telefone
     */
    public PessoaFisica(int idPessoa, String Nome, int Endereco, String eMail, String Observacao, String CPF, String Telefone) {
        super(idPessoa, Nome, Endereco, eMail, Observacao);
    }
//    public String Nome;
//    public int Endereco;
//    public String eMail;
//    public String Observacao;
    
    public String CPF;
    public String Telefone;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }   
}