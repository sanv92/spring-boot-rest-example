package com.example.demo.mapper;

import com.example.demo.dto.PersonDto;
import com.example.demo.model.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;


@Mapper
public interface PersonMapper {
    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mappings({
            @Mapping(source = "firstName", target = "personFirstName"),
            @Mapping(source = "lastName", target = "personLastName")
    })
    PersonDto personToPersonDTO(Person person);
}
