package com.forty_love.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Enrollment")
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "enrollment_id")
    private Integer enrollment_id;

    @Column(name = "player_id", nullable = false)
    private Integer player_id;

    @Column(name = "lesson_id", nullable = false)
    private Integer lesson_id;

    @Column(name = "enrollment_date", length = 11)
    private String enrollment_date;

    @Column(name = "status", length = 30)
    private String status;

    public Enrollment(Integer enrollment_id, Integer player_id, Integer lesson_id, String enrollment_date, String status) {
        this.enrollment_id = enrollment_id;
        this.player_id = player_id;
        this.lesson_id = lesson_id;
        this.enrollment_date = enrollment_date;
        this.status = status;
    }

    public Integer getEnrollment_id() {
        return enrollment_id;
    }

    public void setEnrollment_id(Integer enrollment_id) {
        this.enrollment_id = enrollment_id;
    }

    public Integer getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(Integer player_id) {
        this.player_id = player_id;
    }

    public Integer getLesson_id() {
        return lesson_id;
    }

    public void setLesson_id(Integer lesson_id) {
        this.lesson_id = lesson_id;
    }

    public String getEnrollment_date() {
        return enrollment_date;
    }

    public void setEnrollment_date(String enrollment_date) {
        this.enrollment_date = enrollment_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
