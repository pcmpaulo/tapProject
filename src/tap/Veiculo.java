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
public class Veiculo {
    private int idVeiculo;
    private int status;
    private String tipoVeiculo;
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private int capacidadeCarga;

    Veiculo(String tipoVeiculo, String marca, String modelo, int ano, String placa, int capacidadeCarga){
        this.tipoVeiculo = tipoVeiculo;
        this.marca= marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.capacidadeCarga = capacidadeCarga;
    }
    
    public int getIdVeiculo() {
        return idVeiculo;
    }
    
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }    
}
