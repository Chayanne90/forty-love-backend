package com.forty_love.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Sub_levels")
public class SubLevels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sub_level_id")
    private Integer sub_level_id;

    @Column(name = "level_id", nullable = false)
    private Integer level_id;

    @Column(name = "level", length = 200)
    private String level;

    @Column(name = "level_description", length = 400)
    private String level_description;

    public SubLevels(Integer sub_level_id, Integer level_id, String level, String level_description) {
        this.sub_level_id = sub_level_id;
        this.level_id = level_id;
        this.level = level;
        this.level_description = level_description;
    }

    public Integer getSub_level_id() {
        return sub_level_id;
    }

    public void setSub_level_id(Integer sub_level_id) {
        this.sub_level_id = sub_level_id;
    }

    public Integer getLevel_id() {
        return level_id;
    }

    public void setLevel_id(Integer level_id) {
        this.level_id = level_id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLevel_description() {
        return level_description;
    }

    public void setLevel_description(String level_description) {
        this.level_description = level_description;
    }
}
