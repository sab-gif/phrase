package com.example.phrase.repositories;


import com.example.phrase.model.Phrase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhrasesRepository extends JpaRepository<Phrase, Long> {
}

