package com.example.controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import com.example.data.Connection;
import com.example.models.Usuario;

@ManagedBean(name = "usuarioBean")
@RequestScoped
public class UsuarioBean{
    private Usuario usuario = new Usuario();

    public void salvar(){
        Connection.getConnection().getTransaction().begin();
        Connection.getConnection().persist(usuario);
        Connection.getConnection().getTransaction().commit();
    }


    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}