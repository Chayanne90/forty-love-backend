package com.forty_love.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Criteria")
public class Criteria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "criteria_id")
    private Integer criteria_id;

    @Column(name = "level_id", nullable = false)
    private Integer level_id;

    @Column(name = "criteria", length = 200)
    private String criteria;

    public Criteria(Integer criteria_id, Integer level_id, String criteria) {
        this.criteria_id = criteria_id;
        this.level_id = level_id;
        this.criteria = criteria;
    }

    public Integer getCriteria_id() {
        return criteria_id;
    }

    public void setCriteria_id(Integer criteria_id) {
        this.criteria_id = criteria_id;
    }

    public Integer getLevel_id() {
        return level_id;
    }

    public void setLevel_id(Integer level_id) {
        this.level_id = level_id;
    }

    public String getCriteria() {
        return criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }
}
