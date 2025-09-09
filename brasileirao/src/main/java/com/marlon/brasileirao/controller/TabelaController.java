package com.marlon.brasileirao.controller;

import com.marlon.brasileirao.model.Clube;
import com.marlon.brasileirao.service.TabelaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tabela")
public class TabelaController {

    private final TabelaService tabelaService;

    public TabelaController(TabelaService tabelaService) { this.tabelaService = tabelaService; }

    @GetMapping
    public String verTabela(Model model) {
        model.addAttribute("clubes", tabelaService.listarClubes());
        return "tabela";
    }

    @PostMapping("/adicionar")
    public String adicionarClube(@RequestParam String nome,
                                 @RequestParam int jogos,
                                 @RequestParam int vitorias,
                                 @RequestParam int empates,
                                 @RequestParam int derrotas,
                                 @RequestParam int golsPro,
                                 @RequestParam int golsContra,
                                 @RequestParam String escudoUrl) {
        tabelaService.adicionarClube(new Clube(nome, jogos, vitorias, empates, derrotas, golsPro, golsContra, escudoUrl));
        return "redirect:/tabela";
    }

    @PostMapping("/remover")
    public String removerClube(@RequestParam String nome) {
        tabelaService.removerClube(nome);
        return "redirect:/tabela";
    }
}