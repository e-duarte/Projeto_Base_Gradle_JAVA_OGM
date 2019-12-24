package com.example.models;

// import java.util.List;

import javax.persistence.Column;
// import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.GeneratedValue;

@Entity
public class Usuario{
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "_id")
    private String id;
    private String username;
    private String password;

    // @ElementCollection
    // List<Usuario> amigos;

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // public List<Usuario> getAmigos() {
    //     return this.amigos;
    // }

    // public void setAmigos(List<Usuario> amigos) {
    //     this.amigos = amigos;
    // }

    @Override
    public String toString(){
        return "Usuario{\n username: " + this.username + "\n password: " + this.password + "\n}";
    }
}