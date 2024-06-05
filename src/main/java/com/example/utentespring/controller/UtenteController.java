package com.example.utentespring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.utentespring.Service.UtenteService;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ResponseBody;


@RestController
public class UtenteController {
    @Autowired
    private UtenteService utenteService;

    @GetMapping("/utente")
    @ResponseBody
    public String stampaUtente(){
        return utenteService.getUtente();
    }

    


}
