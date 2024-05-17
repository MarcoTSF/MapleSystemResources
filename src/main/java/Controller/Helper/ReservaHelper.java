/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Colaborador;
import Model.Servico;
import View.Reserva;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mtsfs
 */
public class ReservaHelper {
    
    private final Reserva view;

    public ReservaHelper(Reserva view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Model.Reserva> reservas) {
        DefaultTableModel tableModel = (DefaultTableModel) view.getjTableReserva().getModel();
        tableModel.setNumRows(0);
        
        for (Model.Reserva reserva : reservas) {
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
}