/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.etecriopardo.contatos;

/**
 *
 * @author Etec
 */
public class Contato {
 
 private String nome;
 private String sobrenome;
 private String telefone;
 private String email;
 private String categoria;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
 @Override
 
 public String toString(){
 return "Nome:"+this.getNome()+"\t Sobenome:"+this.getSobrenome()+"\n"+
         "Telefone:"+this.getTelefone()+"\t Email:"+this.getEmail()+"\n"+
         "Categoria:"+this.getCategoria();
 }
 }
     
     
 
        
 
    

