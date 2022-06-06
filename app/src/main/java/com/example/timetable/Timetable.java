package com.example.timetable;

public class Timetable {
    public String build;
    public String dayOfWeek;
    public String[] lessons;


    public Timetable(String build, String dayOfWeek, String[] lessons) {
        this.build = build;
        this.dayOfWeek = dayOfWeek;
        this.lessons = lessons;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String[] getLessons() {
        return lessons;
    }

    public void setLessons(String[] lessons) {
        this.lessons = lessons;
    }
}
