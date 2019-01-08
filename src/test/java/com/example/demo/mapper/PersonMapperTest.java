package com.example.demo.mapper;

import com.example.demo.dto.PersonDto;
import com.example.demo.model.Person;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


class PersonMapperTest {
    @Test
    void shouldMapCarToDto() throws Exception {
        LocalDate date = LocalDate.now();

        //given
        Person person = new Person("Bruce", "Wayne", date, (short)1992);

        //when
        PersonDto personDto = PersonMapper.INSTANCE.personToPersonDTO(person);

        //then
        Assert.assertEquals(personDto.equals(new PersonDto("Bruce", "Wayne", date, (short)1992)), true);
    }
}