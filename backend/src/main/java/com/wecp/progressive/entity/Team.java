package com.wecp.progressive.entity;

public class Team {
    private int teamId;
    private String team_name;
    private String teamName;
    private String location;
    private String ownerName;
    private int establishmentYear;
    public Team() {
    }
    public Team(int teamId, String team_name, String teamName, String location, String ownerName,
            int establishmentYear) {
        this.teamId = teamId;
        this.team_name = team_name;
        this.teamName = teamName;
        this.location = location;
        this.ownerName = ownerName;
        this.establishmentYear = establishmentYear;
    }

    

}