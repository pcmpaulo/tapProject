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
public class Motorista extends Funcionario {
    
    private int idMotorista;
    private char tipoCNH;
    private int numeroCNH;
    //Veículo
    
    public Motorista(String nome, Endereco endereco, int cpf, long dataNascimento, char tipoCNH, int numeroCNH) {
        super(nome, endereco, cpf, dataNascimento);
        this.tipoCNH = tipoCNH;
        this.numeroCNH = numeroCNH;
    }

    public int getIdMotorista() {
        return idMotorista;
    }

    public void setIdMotorista(int idMotorista) {
        this.idMotorista = idMotorista;
    }

    public char getTipoCNH() {
        return tipoCNH;
    }

    public void setTipoCNH(char tipoCNH) {
        this.tipoCNH = tipoCNH;
    }

    public int getNumeroCNH() {
        return numeroCNH;
    }

    public void setNumeroCNH(int numeroCNH) {
        this.numeroCNH = numeroCNH;
    }
    
    
    
}
