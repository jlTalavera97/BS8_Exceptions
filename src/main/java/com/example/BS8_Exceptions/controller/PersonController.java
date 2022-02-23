package com.example.BS8_Exceptions.controller;

import com.example.BS8_Exceptions.application.PersonaService;
import com.example.BS8_Exceptions.application.PersonaServiceImpl;
import com.example.BS8_Exceptions.controller.dto.input.PersonaInputDTO;
import com.example.BS8_Exceptions.controller.dto.output.PersonaOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping
public class PersonController implements PersonaService {

    @Autowired
    PersonaServiceImpl personaServiceImpl;

    @GetMapping("/getAll")
    public List<PersonaOutputDTO> getAll(){
        return personaServiceImpl.getAll();
    }

    @PostMapping("/addPerson")
    public String addPersona(@RequestBody PersonaInputDTO personaInputDTO){
        return personaServiceImpl.addPersona(personaInputDTO);
    }

    @DeleteMapping("/deletePerson/{id}")
    public String deletePersona(@PathVariable Integer id){
        return personaServiceImpl.deletePersona(id);
    }

    @PutMapping("/editPerson/{id}")
    public String editPersona(@PathVariable Integer id,@RequestBody PersonaInputDTO personaInputDto){
        return personaServiceImpl.editPersona(id,personaInputDto);
    }




}
