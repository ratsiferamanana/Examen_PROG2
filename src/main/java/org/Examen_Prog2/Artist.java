package org.Examen_Prog2;

import java.util.List;

public abstract class Artist {
    private String id;
    private String stageName;
    private int startYear;
    private String nationality;

    public Artist(String id, String stageName, int startYear, String nationality) {
        this.id = id;
        this.stageName = stageName;
        this.startYear = startYear;
        this.nationality = nationality;
    }

    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}

