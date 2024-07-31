package org.Examen_Prog2;

import java.util.List;

public class Band extends Artist {
    private List<SoloArtist> members;

    public Band(String id, String stageName, int startYear, String nationality, List<SoloArtist> members) {
        super(id, stageName, startYear, nationality);
        this.members = members;
    }

    // Getters and setters

    public List<SoloArtist> getMembers() {
        return members;
    }

    public void setMembers(List<SoloArtist> members) {
        this.members = members;
    }
}

