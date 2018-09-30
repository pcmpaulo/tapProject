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
public class Funcionario extends Pessoa {
    private long dataNascimento;

    public Funcionario(String nome, Endereco endereco, int cpf, long dataNascimento) {
        super(nome, endereco, cpf);
        this.dataNascimento = dataNascimento;
    }
}
