/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tap;

/**
 *
 * @author hyper
 */
public class Pessoa {
    private int idPessoa;
    private String nome;
    private Endereco endereco;
//    private int cpf;
    
    Pessoa(String nome, Endereco endereco){
        this.nome = nome;
        this.endereco = endereco;
//        this.cpf = cpf;
    }
    
    public int getIdPessoa() {
        return idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

//    public int getCpf() {
//        return cpf;
//    }
//
//    public void setCpf(int cpf) {
//        this.cpf = cpf;
//    }
}
