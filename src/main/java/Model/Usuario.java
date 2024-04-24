/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author mtsfs
 */
public class Usuario extends Pessoa {
    protected String senha;
    protected String nivelAcesso;

    public Usuario(int id, String nome,String senha) {
        super(id, nome);
        this.senha = senha;
    }

    public Usuario(int id, String nome, String senha, String nivelAcesso, String telefone, String email) {
        super(id, nome, telefone, email);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
}