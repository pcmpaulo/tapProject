/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tap;

import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author hyper
 */
public class TAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
        ArrayList<Motorista> motoristas = new ArrayList<Motorista>();        
        ArrayList<Encomenda> encomendas = new ArrayList<Encomenda>();        
        ArrayList<Roteiro> roteiros = new ArrayList<Roteiro>();

        
        int menuPrimario, menuSecundario;
        do{
            menuPrimario = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma Opção: \n"
                    + "1 - Veículos: \n"
                    + "2 - Motoristas: \n"
                    + "3 - Objetos: \n"
                    + "4 - Roteiros: \n"
                    + "0 - Sair:"));
            switch(menuPrimario){
                case 1:
                    do{
                        menuSecundario = Integer.parseInt(JOptionPane.showInputDialog(null, "Veículos - Escolha uma Opção: \n"
                            + "1 - Cadastrar: \n"
    //                      + "2 - Editar: \n"
    //                      + "3 - Excluir: \n"
                            + "4 - Listar: \n"
                            + "5 - Voltar"));
                        switch(menuSecundario){
                            case 1:
                                int status = 0;
                                int tipo = Integer.parseInt(JOptionPane.showInputDialog(null, "Tipo de Veículos - Escolha uma Opção: \n"
                                        + "1 - Carreta: \n"
                                        + "2 - Caminhão baú: \n"
                                        + "3 - Van:"));
                                TipoVeiculo tipoVeiculo = new TipoVeiculo(tipo);
                                String marca = JOptionPane.showInputDialog(null, "Marca do Veículo:");                        
                                String modelo = JOptionPane.showInputDialog(null, "Modelo do Veículo:");
                                int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Ano do Veículo:"));
                                String placa = JOptionPane.showInputDialog(null, "Placa do Veículo:");
                                Veiculo novo = new Veiculo(status, tipoVeiculo, marca, modelo, ano, placa);
                                veiculos.add(novo);
                                break;
                            case 4:
                                int index = 0;
                                String lista = "Veículos Cadastrados: \n";
                                for(Veiculo veiculo: veiculos ){
                                    lista += index + " - "
                                            + veiculo.getTipoVeiculo().getDescricao() + " | " 
                                            + veiculo.getMarca() + " | "
                                            + veiculo.getModelo() + " | "
                                            + veiculo.getAno() + " | "
                                            + veiculo.getPlaca() + " \n";
                                }
                                JOptionPane.showMessageDialog(null, lista);
                                break;
                        }
                    }while(menuSecundario != 5);
                    break;
                case 2:
                    do{
                        menuSecundario = Integer.parseInt(JOptionPane.showInputDialog(null, "Motoristas - Escolha uma Opção: \n"
                            + "1 - Cadastrar: \n"
    //                      + "2 - Editar: \n"
    //                      + "3 - Excluir: \n"
                            + "4 - Listar: \n"
                            + "5 - Voltar"));
                        switch(menuSecundario){
                            case 1:
                                String nome = JOptionPane.showInputDialog(null, "Nome do Motorista:");
                                String nascimento = JOptionPane.showInputDialog(null, "Data nascimento do Motorista:");
                                String cep = JOptionPane.showInputDialog(null, "Motorista - Endereço: CEP");
                                String uf = JOptionPane.showInputDialog(null, "Motorista - Endereço: UF");
                                String cidade = JOptionPane.showInputDialog(null, "Motorista - Endereço: Cidade");
                                String bairro = JOptionPane.showInputDialog(null, "Motorista - Endereço: Bairro");
                                String logradouro = JOptionPane.showInputDialog(null, "Motorista - Endereço: Logradouro");
                                String numero = JOptionPane.showInputDialog(null, "Motorista - Endereço: Numero");
                                String complemento = JOptionPane.showInputDialog(null, "Motorista - Endereço: Complemento");
                                Endereco endereco = new Endereco(logradouro, numero, complemento, bairro, uf, cep, cidade);
                                String tipoCNH = JOptionPane.showInputDialog(null, "Tipo CNH Motorista:");
                                int numeroCNH = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero CNH Motorista:"));
//                              Data de nascimento (Converter 01/01/0001 -> UnixTimeStamp);
                                Motorista novo = new Motorista(nome, endereco, nascimento, tipoCNH, numeroCNH);
                                motoristas.add(novo);
                                break;
                            case 4:
                                int index = 0;
                                String lista = "Motoristas Cadastrados: \n";
                                for(Motorista motorista: motoristas ){
                                    lista += index + " - "
                                            + motorista.getNome() + " | " 
                                            + motorista.getDataNascimento() + " | "
                                            + motorista.getTipoCNH() + " | "
                                            + motorista.getNumeroCNH() + " | \n";
                                }
                                JOptionPane.showMessageDialog(null, lista);
                                break;
                        }
                    }while(menuSecundario != 5);
                    break;
                case 3:
                    do{
                        menuSecundario = Integer.parseInt(JOptionPane.showInputDialog(null, "Objetos - Escolha uma Opção: \n"
                            + "1 - Cadastrar: \n"
    //                      + "2 - Editar: \n"
    //                      + "3 - Excluir: \n"
                            + "4 - Listar: \n"
                            + "5 - Voltar"));
                        switch(menuSecundario){
                            case 1:
                                String data = JOptionPane.showInputDialog(null, "Data de depósito:");
                                float peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Peso do pacote:"));
                                String localizador = JOptionPane.showInputDialog(null, "Codigo localizador:");
                                
                                String nomeRemetente = JOptionPane.showInputDialog(null, "Remetente - Nome:");
                                String cepRemetente = JOptionPane.showInputDialog(null, "Remetente - Endereço: CEP");
                                String ufRemetente = JOptionPane.showInputDialog(null, "Remetente - Endereço: UF");
                                String cidadeRemetente = JOptionPane.showInputDialog(null, "Remetente - Endereço: Cidade");
                                String bairroRemetente = JOptionPane.showInputDialog(null, "Remetente - Endereço: Bairro");
                                String logradouroRemetente = JOptionPane.showInputDialog(null, "Remetente - Endereço: Logradouro");
                                String numeroRemetente = JOptionPane.showInputDialog(null, "Remetente - Endereço: Numero");
                                String complementoRemetente = JOptionPane.showInputDialog(null, "Remetente - Endereço: Complemento");
                                Endereco enderecoRemetente = new Endereco(logradouroRemetente, numeroRemetente, complementoRemetente, bairroRemetente, ufRemetente, cepRemetente, cidadeRemetente);
                                Pessoa remetente = new Pessoa(nomeRemetente, enderecoRemetente);
                                
                                String nomeDestinatario = JOptionPane.showInputDialog(null, "Destinatário - Nome:");
                                String cepDestinatario = JOptionPane.showInputDialog(null, "Destinatario - Endereço: CEP");
                                String ufDestinatario = JOptionPane.showInputDialog(null, "Destinatario - Endereço: UF");
                                String cidadeDestinatario = JOptionPane.showInputDialog(null, "Destinatario - Endereço: Cidade");
                                String bairroDestinatario = JOptionPane.showInputDialog(null, "Destinatario - Endereço: Bairro");
                                String logradouroDestinatario = JOptionPane.showInputDialog(null, "Destinatario - Endereço: Logradouro");
                                String numeroDestinatario = JOptionPane.showInputDialog(null, "Destinatario - Endereço: Numero");
                                String complementoDestinatario = JOptionPane.showInputDialog(null, "Destinatario - Endereço: Complemento");
                                Endereco enderecoDestinatario = new Endereco(logradouroDestinatario, numeroDestinatario, complementoDestinatario, bairroDestinatario, ufDestinatario, cepDestinatario, cidadeDestinatario);
                                Pessoa destinatario = new Pessoa(nomeDestinatario, enderecoDestinatario);
                                
                                Encomenda novo = new Encomenda(data, peso, localizador, remetente, destinatario);
                                encomendas.add(novo);
                                break;
                            case 4:
                                int index = 0;
                                String lista = "Objetos Cadastrados: \n";
                                for(Encomenda encomenda: encomendas ){
                                    lista += index + " - "
                                            + encomenda.getRemetente().getNome()+ " | " 
                                            + encomenda.getDestinatario().getNome() + " | "
                                            + encomenda.getDataDeposito() + " | "
                                            + encomenda.getPeso() + " | "
                                            + encomenda.getCodigoLocalizador() + " | \n";
                                }
                                JOptionPane.showMessageDialog(null, lista);
                                break;
                        }
                    }while(menuSecundario != 5);
                    break;
                case 4:
                    do{
                        menuSecundario = Integer.parseInt(JOptionPane.showInputDialog(null, "Roteiros - Escolha uma Opção: \n"
                            + "1 - Gerar: \n"
    //                      + "2 - Editar: \n"
    //                      + "3 - Excluir: \n"
                            + "4 - Listar: "
                            + "5 - \n"
                            + "5 - Voltar"));
                        switch(menuSecundario){
                            case 1:
                                JOptionPane.showInputDialog(null, "Em implementação!");
                                break;
                            case 4:
                                JOptionPane.showInputDialog(null, "Em implementação!");
                                break;
                        }
                    }while(menuSecundario != 5);
                    break;
            }
        }while(menuPrimario != 0);
                
                
                
    }
    
}
