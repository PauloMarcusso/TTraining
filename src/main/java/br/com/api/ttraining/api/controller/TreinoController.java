package br.com.api.ttraining.api.controller;

import br.com.api.ttraining.domain.model.Treino;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/treinos")
public class TreinoController {


    @GetMapping
    public List<Treino> listar(){
        return null;
    }
}
