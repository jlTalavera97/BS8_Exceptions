package com.example.BS8_Exceptions.application.mappers;


import com.example.BS8_Exceptions.controller.dto.input.PersonaInputDTO;
import com.example.BS8_Exceptions.controller.dto.output.PersonaOutputDTO;
import com.example.BS8_Exceptions.domain.Persona;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

@Service
@Mapper(componentModel = "spring")
public interface PersonaMapper {

/* En caso de que el DTO y la entidad tengas campos con nombres y/o tipos diferentes, se debe usar el @Mapping para
    "castearlos".
    @Mappings({
            @Mapping(source = "x", target = "x");
    })*/


    //INPUT MAPPING
    Persona personaInputDTOToPersona(PersonaInputDTO personaInputDTO);
    PersonaInputDTO personaToPersonaInputDTO(Persona persona);

    //OUTPUT MAPPING
    Persona personaOutputDTOToPersona(PersonaOutputDTO personaOutputDTO);
    PersonaOutputDTO personaToPersonaOutputDTO(Persona persona);
}
