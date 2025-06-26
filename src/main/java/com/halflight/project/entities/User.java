package com.halflight.project.entities;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
    //criando as variaveis;
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String email;
    private String telefone;
    private String senha;
    private int number;
    public User(){
    }
 // criando o construtor;
    public User(Long id, String name, String email, String telefone, String senha) {
        this.email = email;
        this.id = id;
        this.name = name;
        this.telefone= telefone;
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(getId(), user.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

}
