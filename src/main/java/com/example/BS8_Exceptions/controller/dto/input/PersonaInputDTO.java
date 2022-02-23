package com.example.BS8_Exceptions.controller.dto.input;

import java.time.LocalDate;
import java.util.Objects;


public class PersonaInputDTO {

    private Integer id_persona;
    private String usuario;
    private String password;
    private String name;
    private String surname;
    private String personal_email;
    private String company_email;
    private String city;
    private Boolean active;
    private LocalDate createdDate;
    private String imagen_url;
    private LocalDate termiantionDate;

    public PersonaInputDTO(Integer id_persona, String usuario, String password, String name, String surname, String personal_email, String company_email, String city, Boolean active, LocalDate createdDate, String imagen_url, LocalDate termiantionDate) {
        this.id_persona = id_persona;
        this.usuario = usuario;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.personal_email = personal_email;
        this.company_email = company_email;
        this.city = city;
        this.active = active;
        this.createdDate = createdDate;
        this.imagen_url = imagen_url;
        this.termiantionDate = termiantionDate;
    }

    public PersonaInputDTO() {
    }

    public Integer getId_persona() {
        return id_persona;
    }

    public void setId_persona(Integer id_persona) {
        this.id_persona = id_persona;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPersonal_email() {
        return personal_email;
    }

    public void setPersonal_email(String personal_email) {
        this.personal_email = personal_email;
    }

    public String getCompany_email() {
        return company_email;
    }

    public void setCompany_email(String company_email) {
        this.company_email = company_email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public String getImagen_url() {
        return imagen_url;
    }

    public void setImagen_url(String imagen_url) {
        this.imagen_url = imagen_url;
    }

    public LocalDate getTermiantionDate() {
        return termiantionDate;
    }

    public void setTermiantionDate(LocalDate termiantionDate) {
        this.termiantionDate = termiantionDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonaInputDTO that = (PersonaInputDTO) o;
        return Objects.equals(id_persona, that.id_persona) && Objects.equals(usuario, that.usuario) && Objects.equals(password, that.password) && Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(personal_email, that.personal_email) && Objects.equals(company_email, that.company_email) && Objects.equals(city, that.city) && Objects.equals(active, that.active) && Objects.equals(createdDate, that.createdDate) && Objects.equals(imagen_url, that.imagen_url) && Objects.equals(termiantionDate, that.termiantionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_persona, usuario, password, name, surname, personal_email, company_email, city, active, createdDate, imagen_url, termiantionDate);
    }

    @Override
    public String toString() {
        return "PersonaInputDTO{" +
                "id_persona=" + id_persona +
                ", usuario='" + usuario + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", personal_email='" + personal_email + '\'' +
                ", company_email='" + company_email + '\'' +
                ", city='" + city + '\'' +
                ", active=" + active +
                ", createdDate=" + createdDate +
                ", imagen_url='" + imagen_url + '\'' +
                ", termiantionDate=" + termiantionDate +
                '}';
    }
}
