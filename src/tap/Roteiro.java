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
public class Roteiro {
    private int idRoteiro;
    private Encomenda[] listaEncomendas;
    private Veiculo veiculo;
    
    Roteiro(){
    }

    public int getIdRoteiro() {
        return idRoteiro;
    }

    public void setIdRoteiro(int idRoteiro) {
        this.idRoteiro = idRoteiro;
    }

    public Encomenda[] getListaEncomendas() {
        return listaEncomendas;
    }

    public void setListaEncomendas(Encomenda[] listaEncomendas) {
        this.listaEncomendas = listaEncomendas;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}
