package com.example.phrase.services;

import com.example.phrase.model.Phrase;
import com.example.phrase.repositories.PhrasesRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PhraseService {
    private final PhrasesRepository repo;

    public PhraseService(PhrasesRepository repo) {
        this.repo = repo;
    }

    public List<Phrase> getAll() {
        return repo.findAll();
    }

    public Optional<Phrase> getById(Long id) {
        return repo.findById(id);
    }

    public Phrase save(Phrase Phrase) {
        return repo.save(Phrase);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
