package com.example.utentespring.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.utentespring.model.Utente;

@Repository
public class UtenteRepository {

    private List<Utente> utenti = new ArrayList<>();
    
    public String getUtente(){
        return new Utente("Mirko", "Mirko123").toString();
    }

    public void save(Utente utente) {
        utenti.add(utente);
    }

    public List<Utente> findAll() {
        return utenti;
    }

}
