/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Reservas;
import Model.Colaborador;
import Model.Servico;
import Model.Usuario;
import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author mtsfs
 */
public class Banco {
    
    public static ArrayList<Usuario> usuario;
    public static ArrayList<Colaborador> colaborador;
    public static ArrayList<Servico> servico;
    public static ArrayList<Reservas> reservar;
    
    
    public static void inicia() throws ParseException{
    
        //Instancia os Objetos
        usuario = new ArrayList<Usuario>();
        colaborador = new ArrayList<Colaborador>();
        servico = new ArrayList<Servico>();
        reservar = new ArrayList<Reservas>();
        
        //criando elementos
        
        Usuario usuario1 = new Usuario(1, "Marco Tulio Salvador", "adm1", "administrador", "31990905050", "adm1@alunouna.com");
        Usuario usuario2 = new Usuario(2, "Daniel Jones", "func1", "funcionario", "31980804040", "func1@alunouna.com");
        
        Colaborador colaborador1 = new Colaborador(1, "Alan Figueiredo", "31950506060", "alan@test.com", "Engenharia do Produto");
        Colaborador colaborador2 = new Colaborador(2, "Judite Oliveira", "31980807070", "judite@test.com", "Produção");
        Colaborador colaborador3 = new Colaborador(3, "Pedro Ramos", "31940406060", "pedro@test.com", "Montagem Final");
        Colaborador colaborador4 = new Colaborador(4, "Chico Moedas", "31990804050", "chico@tentei.com", "Tentativa");
        
        Servico servico1 = new Servico(1, "Projetor");
        Servico servico2 = new Servico(2, "Tela para Projetor");
        Servico servico3 = new Servico(3, "Mouse e Teclado");
        Servico servico4 = new Servico(4, "Sala de Reunião");
        Servico servico5 = new Servico(5, "Monitor");
        Servico servico6 = new Servico(6, "Impressora");

        Reservas reservar1 = new Reservas(1, colaborador1, servico2, "26/04/2024", "29/04/2024 08:30");
        Reservas reservar2 = new Reservas(2, colaborador3, servico4, "26/04/2024", "29/04/2024 10:30");
        Reservas reservar3 = new Reservas(3, colaborador4, servico1, "26/04/2024", "29/04/2024 13:00");
        
        //Adiciona Elementos na lista
        usuario.add(usuario1);
        usuario.add(usuario2);
        
        colaborador.add(colaborador1);
        colaborador.add(colaborador2);
        colaborador.add(colaborador3);
        colaborador.add(colaborador4);
        
        servico.add(servico1);
        servico.add(servico2);
        servico.add(servico3);
        servico.add(servico4);
        servico.add(servico5);
        servico.add(servico6);
        
        reservar.add(reservar1);
        reservar.add(reservar2);
        reservar.add(reservar3);
    }
}