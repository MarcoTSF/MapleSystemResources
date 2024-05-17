/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Colaborador;
import Model.Reservas;
import Model.Servico;
import View.Reserva;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mtsfs
 */
public class ReservaHelper implements iHelper{
    
    private final Reserva view;

    public ReservaHelper(Reserva view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Model.Reservas> reservas) {
        DefaultTableModel tableModel = (DefaultTableModel) view.getjTableReserva().getModel();
        tableModel.setNumRows(0);
        
        for (Model.Reservas reserva : reservas) {
            tableModel.addRow(new Object[]{
                reserva.getId(),
                reserva.getColaborador().getNome(),
                reserva.getServico().getDescricao(),
                reserva.getDataReservaFormatada(),
                reserva.getDataEntregaFormatada(),
                reserva.getHoraEntregaFormatada(),
                reserva.getObservacao()
            });
        }
    }

    public void preencherColaboradores(ArrayList<Colaborador> colaboradores) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxColaborador().getModel();
        
        for (Colaborador colaborador : colaboradores) {
            comboBoxModel.addElement(colaborador);
        }
    }

    public void preencherServico(ArrayList<Servico> servicos) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxServico().getModel();
        
        for (Servico servico : servicos) {
            comboBoxModel.addElement(servico);
        }
    }
    
    public Colaborador obterColaborador(){
        return (Colaborador) view.getjComboBoxColaborador().getSelectedItem();
    }
    
    public Servico obterServico(){
        return (Servico) view.getjComboBoxServico().getSelectedItem();
    }

    @Override
    public Reservas obterModelo() {
        String idString = view.getTxfId().getText();
        int id = Integer.parseInt(idString);
        Colaborador colaborador = obterColaborador();
        Servico servico = obterServico();
        String dataReserva = view.getTxfDataReserva().getText();
        String dataEntrega = view.getTxfDataEntrega().getText();
        String hora = view.getTxfHora().getText();
        String dataHora = dataEntrega + " " + hora;
        String observacao = view.getjTxaObservacao().getText();
        
        Reservas reservas = new Reservas(id, colaborador, servico, dataReserva, dataHora, observacao);
        return reservas;
    }

    @Override
    public void limparTela() {
       view.getTxfId().setText("0");
       view.getTxfDataReserva().setText("");
       view.getTxfDataEntrega().setText("");
       view.getTxfHora().setText("");
       view.getjTxaObservacao().setText("");
    }
}