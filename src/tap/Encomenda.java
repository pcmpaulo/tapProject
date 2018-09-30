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
public class Encomenda {
    private int idEncomenda;
    private long dataDeposito;
    private float peso;
    private String codigoLocalizador;
    private Pessoa remetente;
    private Pessoa destinatario;
    
    Encomenda(long dataDeposito, float peso, String codigoLocalizador, Pessoa rementente, Pessoa destinatario){
        this.dataDeposito = dataDeposito;
        this.peso = peso;
        this.codigoLocalizador = codigoLocalizador;
        this.remetente = rementente;
        this.destinatario = destinatario;
    }

    public int getIdEncomenda() {
        return idEncomenda;
    }

    public void setIdEncomenda(int idEncomenda) {
        this.idEncomenda = idEncomenda;
    }

    public long getDataDeposito() {
        return dataDeposito;
    }

    public void setDataDeposito(long dataDeposito) {
        this.dataDeposito = dataDeposito;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getCodigoLocalizador() {
        return codigoLocalizador;
    }

    public void setCodigoLocalizador(String codigoLocalizador) {
        this.codigoLocalizador = codigoLocalizador;
    }

    public Pessoa getRemetente() {
        return remetente;
    }

    public void setRemetente(Pessoa remetente) {
        this.remetente = remetente;
    }

    public Pessoa getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Pessoa destinatario) {
        this.destinatario = destinatario;
    }
    
    
}
