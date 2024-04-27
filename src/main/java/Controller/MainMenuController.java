/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Reserva;
import View.MainMenu;

/**
 *
 * @author user
 */
public class MainMenuController {
    private final MainMenu view;

    public MainMenuController(MainMenu view) {
        this.view = view;
    }
    
    public void abrirReservas(){
        Reserva reservas = new Reserva();
        reservas.setVisible(true);
    }
}