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
    private Veiculo[] listaVeiculos;
    private Entrega[] listaEntregas;
    private long data;
    
    
    Roteiro(Encomenda[] listaEncomendas, Veiculo[] listaVeiculos){
        this.listaEncomendas = listaEncomendas;
        this.listaVeiculos = listaVeiculos;
    }

    public int getIdRoteiro() {
        return idRoteiro;
    }

    public Encomenda[] getListaEncomendas() {
        return listaEncomendas;
    }

    public Veiculo[] getVeiculo() {
        return listaVeiculos;
    }
  }
