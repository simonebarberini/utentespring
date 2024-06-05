package com.example.utentespring.model;

public class Utente{
    private String username;
    private String password;

    public Utente(String username, String password){
        this.username = username;
        this.password = password;
    }

    
    public String getUsername() {
        return this.username;
    }

    
    public String getPassword() {
        return this.password;
    }

    @Override
    public String toString() {
        return "Utente = {" +
                "username =" + this.username +
                ", password='" + this.password+"}";
    }
}

    



