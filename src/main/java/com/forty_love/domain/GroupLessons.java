package com.forty_love.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "group_lessons")
public class GroupLessons {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lesson_id")
    private Integer lesson_id;

    @Column(name = "lesson_name", length = 50)
    private String lesson_name;

    @Column(name = "lesson_date", length = 11)
    private String lesson_date;

    @Column(name = "start_time", length = 11)
    private String start_time;

    @Column(name = "end_time", length = 11)
    private String end_time;

    @Column(name = "max_capacity", length = 1)
    private String max_capacity;

    @Column(name = "level_id", nullable = false)
    private Integer level_id;

    @Column(name = "coach_id", nullable = false)
    private Integer coach_id;

    @Column(name = "court_id")
    private Integer court_id;

    public GroupLessons(Integer lesson_id, String lesson_name, String lesson_date, String start_time, String end_time,
                        String max_capacity, Integer level_id, Integer coach_id, Integer court_id) {
        this.lesson_id = lesson_id;
        this.lesson_name = lesson_name;
        this.lesson_date = lesson_date;
        this.start_time = start_time;
        this.end_time = end_time;
        this.max_capacity = max_capacity;
        this.level_id = level_id;
        this.coach_id = coach_id;
        this.court_id = court_id;
    }

    public Integer getLesson_id() {
        return lesson_id;
    }

    public void setLesson_id(Integer lesson_id) {
        this.lesson_id = lesson_id;
    }

    public String getLesson_name() {
        return lesson_name;
    }

    public void setLesson_name(String lesson_name) {
        this.lesson_name = lesson_name;
    }

    public String getLesson_date() {
        return lesson_date;
    }

    public void setLesson_date(String lesson_date) {
        this.lesson_date = lesson_date;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getMax_capacity() {
        return max_capacity;
    }

    public void setMax_capacity(String max_capacity) {
        this.max_capacity = max_capacity;
    }

    public Integer getLevel_id() {
        return level_id;
    }

    public void setLevel_id(Integer level_id) {
        this.level_id = level_id;
    }

    public Integer getCoach_id() {
        return coach_id;
    }

    public void setCoach_id(Integer coach_id) {
        this.coach_id = coach_id;
    }

    public Integer getCourt_id() {
        return court_id;
    }

    public void setCourt_id(Integer court_id) {
        this.court_id = court_id;
    }
}
