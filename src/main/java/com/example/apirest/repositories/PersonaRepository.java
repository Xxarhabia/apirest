package com.example.apirest.repositories;

import com.example.apirest.entities.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository  extends JpaRepository<PersonaEntity, Long> {
}
