/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mtsfs
 */
public class Reserva {
    private int id;
    private Colaborador colaborador;
    private Servico servico;
    private Date dataReserva;
    private Date dataEntrega;
    private String observacao;

    public Reserva(int id, Colaborador colaborador, Servico servico, String dataReserva, String dataEntrega) {
        this.id = id;
        this.colaborador = colaborador;
        this.servico = servico;
        try {
            this.dataReserva = new SimpleDateFormat("dd/MM/yyyy").parse(dataReserva);
        } catch (ParseException ex) {
            Logger.getLogger(Reserva.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.dataEntrega = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(dataEntrega);
        } catch (ParseException ex) {
            Logger.getLogger(Reserva.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Date getDataReserva() {
        return dataReserva;
    }
    
    public String getDataReservaFormatada(){
        return new SimpleDateFormat("dd/MM/yyyy").format(dataReserva);
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }
    
    public String getDataEntregaFormatada(){
        return new SimpleDateFormat("dd/MM/yyyy").format(dataEntrega);
    }
    
    public String getHoraEntregaFormatada(){
        return new SimpleDateFormat("HH:mm").format(dataEntrega);
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}