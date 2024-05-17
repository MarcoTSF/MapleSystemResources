/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.ReservaHelper;
import Model.Colaborador;
import Model.DAO.ColaboradorDAO;
import Model.DAO.ReservaDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
import View.Reserva;
import java.util.ArrayList;

/**
 *
 * @author mtsfs
 */
public class ReservaController {
    private final Reserva view;
    private final ReservaHelper helper;

    public ReservaController(Reserva view) {
        this.view = view;
        this.helper = new ReservaHelper(view);
    }
    
    public void atualizaTabela(){
    
        ReservaDAO reservaDAO = new ReservaDAO();
        ArrayList<Model.Reserva> reservas = reservaDAO.selectAll();
        
        helper.preencherTabela(reservas);
    }
    
    public void atualizaColaborador(){
        
        ColaboradorDAO colaboradorDAO = new ColaboradorDAO();   
        ArrayList<Colaborador> colaboradores = colaboradorDAO.selectAll();
        
        helper.preencherColaboradores(colaboradores);
    }
    
    public void atualizaServico(){
        
        ServicoDAO servicoDAO = new ServicoDAO();   
        ArrayList<Servico> servicos = servicoDAO.selectAll();
        
        helper.preencherServico(servicos);
    }
}