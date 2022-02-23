package com.example.BS8_Exceptions.application;

import com.example.BS8_Exceptions.controller.dto.output.PersonaOutputDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaService {

    public List<PersonaOutputDTO> getAll();
}
