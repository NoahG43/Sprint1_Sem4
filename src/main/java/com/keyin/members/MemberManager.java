package com.keyin.members;

import com.keyin.data.Database;

import java.util.ArrayList;
import java.util.List;

// Fixed some errors on this page
public class MemberManager {
    private Database database;
    public List<Member> getMemberByTourName(String tourName){
        Tournament tournament = database.getTournamentByName(tourName);
        List<Member> members = database.getAllMembers();

        List<Member> membersToReturn = new ArrayList<Member>();

        for (Member m : members) {
            if (m.getTournament().getName().equals(tournament.getName())){
                membersToReturn.add(m);
            }
        }

        return membersToReturn;

        return database.getTournamentByMember(tourName);
    }

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }
}