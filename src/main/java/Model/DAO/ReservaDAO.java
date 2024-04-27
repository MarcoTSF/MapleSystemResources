/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Reserva;
import java.util.ArrayList;

/**
 *
 * @author mtsfs
 */
public class ReservaDAO {
    
    /**
     * Insere uma reserva dentro do banco de dados
     * @param reservar
     */
    public void insert(Reserva reservar){
          
        if(reservar.getId() == 0){
            reservar.setId(proximoId());
            Banco.reservar.add(reservar);
        }
        
        
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param reservar
     * @return 
     */
    public boolean update(Reserva reservar){
        
        for (int i = 0; i < Banco.reservar.size(); i++) {
            if(idSaoIguais(Banco.reservar.get(i),reservar)){
                Banco.reservar.set(i, reservar);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do agendamento passado
     * @param reservar
     * @return 
     */
    public boolean delete(Reserva reservar){
        for (Reserva reservaLista : Banco.reservar) {
            if(idSaoIguais(reservaLista,reservar)){
                Banco.reservar.remove(reservaLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os agendamentos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Reserva> selectAll(){
        return Banco.reservar;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param reservar
     * @param reservaAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Reserva reservar, Reserva reservaAComparar) {
        return reservar.getId() ==  reservaAComparar.getId();
    }
    
    private int proximoId(){
        
        int maiorId = 0;
        
        for (Reserva reservar : Banco.reservar) {           
           int id = reservar.getId();
            
            if(maiorId < id){
                maiorId = id;
            }
        }
        return maiorId + 1;
    }
}
