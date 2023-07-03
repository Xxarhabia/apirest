package com.example.apirest.services.impl;

import com.example.apirest.entities.PersonaEntity;
import com.example.apirest.repositories.PersonaRepository;
import com.example.apirest.services.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class PersonaServiceImpl implements BaseService<PersonaEntity> {

    private final PersonaRepository repository;

    @Override
    public List<PersonaEntity> findAll() throws Exception {
        try {
            return repository.findAll();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public PersonaEntity findById(Long id) throws Exception {
        try {
            return repository.findById(id).orElse(null);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public PersonaEntity save(PersonaEntity entity) throws Exception {
        try {
            return repository.save(entity);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public PersonaEntity update(Long id, PersonaEntity entity) throws Exception {
        try {
            PersonaEntity persona = repository.findById(id).orElse(null);
            return repository.save(persona);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Boolean delete(Long id) throws Exception {
        try {
            if(repository.existsById(id)){
                repository.deleteById(id);
                return true;
            } else {
                throw new Exception();
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
