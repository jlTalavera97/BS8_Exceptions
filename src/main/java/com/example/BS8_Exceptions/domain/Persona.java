package com.example.BS8_Exceptions.domain;

import lombok.NonNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


@Entity
@Table(name = "PERSON")
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PERSONA")
    private Integer id_persona;

    @NonNull()
    @Column(name = "USUARIO")
    private String usuario;

    @NonNull
    @Column(name = "PASSWORD")
    private String password;

    @NonNull
    @Column(name = "NAME")
    private String name;

    @Column(name = "SURNAME")
    private String surname;

    @NonNull
    @Column(name = "COMPANY_EMAIL")
    private String company_email;

    @NonNull
    @Column(name = "PERSONAL_EMAIL")
    private String personal_email;

    @NonNull
    @Column(name = "CITY")
    private String city;

    @NonNull
    @Column(name = "ACTIVE")
    private Boolean active;

    @NonNull
    @Column(name = "CREATED_DATE")
    private String created_date;

    @Column(name = "IMAGEN_URL")
    private String imagen_url;

    @Column(name = "TERMINATION_DATE")
    private String termination_date;

    public Persona(Integer id_persona, @NonNull String usuario, @NonNull String password, @NonNull String name, String surname, @NonNull String company_email, @NonNull String personal_email, @NonNull String city, @NonNull Boolean active, @NonNull String created_date, String imagen_url, String termination_date) {
        this.id_persona = id_persona;
        this.usuario = usuario;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.company_email = company_email;
        this.personal_email = personal_email;
        this.city = city;
        this.active = active;
        this.created_date = created_date;
        this.imagen_url = imagen_url;
        this.termination_date = termination_date;
    }

    public Persona() {
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

    public String getCompany_email() {
        return company_email;
    }

    public void setCompany_email(String company_email) {
        this.company_email = company_email;
    }

    public String getPersonal_email() {
        return personal_email;
    }

    public void setPersonal_email(String personal_email) {
        this.personal_email = personal_email;
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

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getImagen_url() {
        return imagen_url;
    }

    public void setImagen_url(String imagen_url) {
        this.imagen_url = imagen_url;
    }

    public String getTermination_date() {
        return termination_date;
    }

    public void setTermination_date(String termination_date) {
        this.termination_date = termination_date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(id_persona, persona.id_persona) && usuario.equals(persona.usuario) && password.equals(persona.password) && name.equals(persona.name) && Objects.equals(surname, persona.surname) && company_email.equals(persona.company_email) && personal_email.equals(persona.personal_email) && city.equals(persona.city) && active.equals(persona.active) && created_date.equals(persona.created_date) && Objects.equals(imagen_url, persona.imagen_url) && Objects.equals(termination_date, persona.termination_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_persona, usuario, password, name, surname, company_email, personal_email, city, active, created_date, imagen_url, termination_date);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id_persona=" + id_persona +
                ", usuario='" + usuario + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", company_email='" + company_email + '\'' +
                ", personal_email='" + personal_email + '\'' +
                ", city='" + city + '\'' +
                ", active=" + active +
                ", created_date='" + created_date + '\'' +
                ", imagen_url='" + imagen_url + '\'' +
                ", termination_date='" + termination_date + '\'' +
                '}';
    }
}