package com.example.utentespring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.utentespring.Service.UtenteService;
import com.example.utentespring.model.Utente;
import com.example.utentespring.repository.UtenteRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("/utenti")
public class UtenteController {
    @Autowired
    private UtenteService utenteService;
    @Autowired
    private UtenteRepository utenteRepository;

    @GetMapping("/utente")
    @ResponseBody
    public String stampaUtente(){
        return utenteService.getUtente();
    }

    @PostMapping("/create")
    public Utente createUtente(@RequestBody Utente utente) {
        utenteRepository.save(utente);
        return utente;
    }

    @GetMapping("/getUtenti")
    public List<Utente> getAllUtenti() {
        return utenteRepository.findAll();
    }

}
