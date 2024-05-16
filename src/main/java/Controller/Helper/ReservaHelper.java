/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import View.Reserva;
import java.util.ArrayList;
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
}