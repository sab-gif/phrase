package com.example.phrase.controllers;

import com.example.phrase.model.Phrase;
import com.example.phrase.services.PhraseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/phrases")
public class PhraseController {
    private final PhraseService service;

    public PhraseController(PhraseService service) {
        this.service = service;
    }

    @GetMapping
    public List<Phrase> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Phrase getById(@PathVariable Long id) {
        return service.getById(id).orElse(null);
    }

    @PostMapping
    public Phrase create(@RequestBody Phrase phrase) {
        return service.save(phrase);
    }

    @PutMapping("/{id}")
    public Phrase update(@PathVariable Long id, @RequestBody Phrase phrase) {
        phrase.setId(id);
        return service.save(phrase);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}
