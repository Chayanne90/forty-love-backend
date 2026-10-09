package com.forty_love.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Coach")
public class Coach {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coach_id")
    private Integer coach_id;

    @Column(name = "person_id", nullable = false)
    private Integer person_id;

    @Column(name = "specialization", length = 50)
    private String specialization;

    public Coach(Integer coach_id, Integer person_id, String specialization) {
        this.coach_id = coach_id;
        this.person_id = person_id;
        this.specialization = specialization;
    }

    public Integer getCoach_id() {
        return coach_id;
    }

    public void setCoach_id(Integer coach_id) {
        this.coach_id = coach_id;
    }

    public Integer getPerson_id() {
        return person_id;
    }

    public void setPerson_id(Integer person_id) {
        this.person_id = person_id;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
