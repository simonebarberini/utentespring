package com.example.utentespring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.utentespring.repository.UtenteRepository;

@Service
public class UtenteService{
    @Autowired
    private UtenteRepository utenteRepository;
    
    public String getUtente(){
        return utenteRepository.getUtente();
    }
}
