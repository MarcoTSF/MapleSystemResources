/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author mtsfs
 */
public class Colaborador extends Pessoa {
    protected String setor;

    public Colaborador(int id, String nome, String telefone, String email, String setor) {
        super(id, nome, telefone, email);
        this.setor = setor;
    }

    public Colaborador(int id, String nome, String setor) {
        super(id, nome);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    @Override
    public String toString(){
        return getNome();
    }
}