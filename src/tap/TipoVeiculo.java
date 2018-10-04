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
public class TipoVeiculo {
    private int id;
    private String descricao;
    private int capacidadeCarga;

    public TipoVeiculo(int tipoId) {
        switch(tipoId){
            case 1:
                this.descricao = "Carreta";
                this.capacidadeCarga = 10;
                break;
            case 2:
                this.descricao = "Caminhão baú";
                this.capacidadeCarga = 3;
                break;
            case 3:
                this.descricao = "Van";
                this.capacidadeCarga = 1;
                break;
        }
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
    
    
}
