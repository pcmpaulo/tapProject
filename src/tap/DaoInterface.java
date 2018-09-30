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
public interface DaoInterface<T> {
    public int conectar();
    public int desconectar();
    public int inserir(T dado);
    public int atualizar(T dado);
    public int deletar(T dado);
    public T procurar(T dado);
    public T[] procurarTodos();
}
