package com.forty_love.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Court")
public class Court {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "court_id")
    private Integer court_id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "surface_type", length = 30)
    private String surface_type;

    @Column(name = "in_door", length = 3)
    private String in_door;

    public Court(Integer court_id, String name, String surface_type, String in_door) {
        this.court_id = court_id;
        this.name = name;
        this.surface_type = surface_type;
        this.in_door = in_door;
    }

    public Integer getCourt_id() {
        return court_id;
    }

    public void setCourt_id(Integer court_id) {
        this.court_id = court_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurface_type() {
        return surface_type;
    }

    public void setSurface_type(String surface_type) {
        this.surface_type = surface_type;
    }

    public String getIn_door() {
        return in_door;
    }

    public void setIn_door(String in_door) {
        this.in_door = in_door;
    }
}
