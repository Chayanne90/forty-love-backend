package com.forty_love.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id")
    private Integer player_id;

    @Column(name = "person_id", nullable = false)
    private Integer person_id;

    @Column(name = "level_id", nullable = false)
    private Integer level_id;

    @Column(name = "handed", length = 2)
    private String handed;

    public Player(Integer player_id, Integer person_id, Integer level_id, String handed) {
        this.player_id = player_id;
        this.person_id = person_id;
        this.level_id = level_id;
        this.handed = handed;
    }

    public Integer getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(Integer player_id) {
        this.player_id = player_id;
    }

    public Integer getPerson_id() {
        return person_id;
    }

    public void setPerson_id(Integer person_id) {
        this.person_id = person_id;
    }

    public Integer getLevel_id() {
        return level_id;
    }

    public void setLevel_id(Integer level_id) {
        this.level_id = level_id;
    }

    public String getHanded() {
        return handed;
    }

    public void setHanded(String handed) {
        this.handed = handed;
    }
}
