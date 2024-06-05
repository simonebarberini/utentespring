package com.example.utentespring.repository;

import org.springframework.stereotype.Repository;

import com.example.utentespring.model.Utente;

@Repository
public class UtenteRepository {
    
    public String getUtente(){
        return new Utente("Mirko", "Mirko123").toString();
    }

}
