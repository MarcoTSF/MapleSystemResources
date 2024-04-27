/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Colaborador;
import java.util.ArrayList;

/**
 *
 * @author mtsfs
 */
public class ColaboradorDAO {
    
    
    /**
     * Insere um cliente dentro do banco de dados
     * @param colaborador exige que seja passado um objeto do tipo cliente
     */
    public void insert(Colaborador colaborador){
        Banco.colaborador.add(colaborador);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param colaborador
     * @return 
     */
    public boolean update(Colaborador colaborador){
        
        for (int i = 0; i < Banco.colaborador.size(); i++) {
            if(idSaoIguais(Banco.colaborador.get(i),colaborador)){
                Banco.colaborador.set(i, colaborador);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do cliente passado
     * @param colaborador
     * @return 
     */
    public boolean delete(Colaborador colaborador){
        for (Colaborador colaboradorLista : Banco.colaborador) {
            if(idSaoIguais(colaboradorLista,colaborador)){
                Banco.colaborador.remove(colaboradorLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os clientes do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Colaborador> selectAll(){
        return Banco.colaborador;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param colaborador
     * @param colaboradorAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Colaborador colaborador, Colaborador colaboradorAComparar) {
        return colaborador.getId() ==  colaboradorAComparar.getId();
    }
}