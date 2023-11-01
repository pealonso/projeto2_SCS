package com.unicsul.Projeto1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Config {

    @GetMapping("/")
    public String home(ModelMap model){
        return "home";
    }

    @GetMapping("/tamanho/{palavra}")
    public String tamanho(@PathVariable String palavra, ModelMap model){
        model.addAttribute("palavra", palavra);
        return "tamanho";
    }

    @GetMapping("/cubo/{lado}")
        public String cubo(@PathVariable double lado, ModelMap model){
        model.addAttribute("lado", lado);
        return "cubo";
    }

    @GetMapping("/saudacao/{hora}/{minuto}")
        public String saudacao(@PathVariable int hora, ModelMap model, @PathVariable int minuto, ModelMap m){
        model.addAttribute("hora", hora);
        m.addAttribute("minuto", minuto);
        return "saudacao";
    }
}