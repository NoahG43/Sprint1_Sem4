//Last edited Oct 30 7:30pm
//Created for
//Created on Oct 23
//Created by Noah Gosse


package com.keyin.members;

import com.keyin.data.Database;

import java.util.List;

public class MemberManager {
    private Database database;
    public List<Member> getMembersByTournamentName(String name){
        Member member = database.getMemberByName(name);
        return database.getMemberByTournamentName(member);
    }

    public List<Tournament> getTournamentByMemberName(String tourName){
        Tournament tournament = database.getTournamentByName(tourName);
        return database.getTournamentByMemberName(tournament);
    }

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }
}
