package com.forty_love.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private Integer person_Id;

    @Column(name = "f_name", length = 70)
    private String first_name;

    @Column(name = "l_name", length = 70)
    private String last_name;

    @Column(name = "dob", length = 19)
    private String dob;

    @Column(name = "gender", length = 1)
    private String gender;

    @Column(name = "country_code", length = 3)
    private String country_code;

    public Person(Integer person_Id, String first_name, String last_name, String dob, String gender, String country_code) {
        this.person_Id = person_Id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.dob = dob;
        this.gender = gender;
        this.country_code = country_code;
    }

    public Integer getPerson_Id() { return person_Id; }

    public void setPerson_Id(Integer person_Id) { this.person_Id = person_Id; }


    public String getFirst_name() { return first_name; }

    public void setFirst_name(String first_name) { this.first_name = first_name; }

    public String getLast_name() { return last_name; }

    public void setLast_name(String last_name) { this.last_name = last_name; }

    public String getDob() { return dob; }

    public void setDob(String dob) { this.dob = dob; }

    public String getGender() { return gender; }

    public void setGender(String gender) { this.gender = gender; }

    public String getCountry_code() { return country_code; }

    public void setCountry_code(String country_code) { this.country_code = country_code; }
}
