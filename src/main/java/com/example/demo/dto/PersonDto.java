package com.example.demo.dto;

import java.time.LocalDate;
import java.util.Objects;


public class PersonDto {
    private String personFirstName;

    private String personLastName;

    private LocalDate birthDate;

    private Short years;

    public PersonDto() {
    }

    public PersonDto(String personFirstName, String personLastName, LocalDate birthDate, Short years) {
        this.personFirstName = personFirstName;
        this.personLastName = personLastName;
        this.birthDate = birthDate;
        this.years = years;
    }

    public String getPersonFirstName() {
        return personFirstName;
    }

    public void setPersonFirstName(String personFirstName) {
        this.personFirstName = personFirstName;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Short getYears() {
        return years;
    }

    public void setYears(Short years) {
        this.years = years;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonDto)) return false;
        PersonDto personDto = (PersonDto) o;
        return personFirstName.equals(personDto.personFirstName) &&
                personLastName.equals(personDto.personLastName) &&
                birthDate.equals(personDto.birthDate) &&
                years.equals(personDto.years);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personFirstName, personLastName, birthDate, years);
    }

    @Override
    public String toString() {
        return "PersonDto{" +
                "personFirstName='" + personFirstName + '\'' +
                ", personLastName='" + personLastName + '\'' +
                ", birthDate=" + birthDate +
                ", years=" + years +
                '}';
    }
}
