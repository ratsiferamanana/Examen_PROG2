package org.Examen_Prog2;

import java.util.Date;

public class SoloArtist extends Artist {
    private String firstName;
    private String lastName;
    private Date birthDate;

    public SoloArtist(String id, String stageName, int startYear, String nationality, String firstName, String lastName, Date birthDate) {
        super(id, stageName, startYear, nationality);
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    // Getters and setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
