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
public class Motorista extends Pessoa {
    
    private int idMotorista;
    private String tipoCNH;
    private int numeroCNH;
    private String dataNascimento;
    
    public Motorista(String nome, Endereco endereco, String dataNascimento, String tipoCNH, int numeroCNH) {
        super(nome, endereco);
        this.dataNascimento = dataNascimento;
        this.tipoCNH = tipoCNH;
        this.numeroCNH = numeroCNH;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getIdMotorista() {
        return idMotorista;
    }

    public void setIdMotorista(int idMotorista) {
        this.idMotorista = idMotorista;
    }

    public String getTipoCNH() {
        return tipoCNH;
    }

    public void setTipoCNH(String tipoCNH) {
        this.tipoCNH = tipoCNH;
    }

    public int getNumeroCNH() {
        return numeroCNH;
    }

    public void setNumeroCNH(int numeroCNH) {
        this.numeroCNH = numeroCNH;
    }
    
    
    
}
