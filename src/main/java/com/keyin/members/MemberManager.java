package com.keyin.members;

import com.keyin.data.Database;
import com.keyin.tournaments.Tournament;

import java.util.ArrayList;
import java.util.List;

public class MemberManager {
    private Database database;

    public List<Member> getMemberByTournamentName(String tournamentName){
//new tournament object
        Tournament freshTournament = database.getTournamentByName(tournamentName);
//new list of members where we grab all members from database
        List<Member> members = database.getAllMembers();
        List<Member> membersToReturn = new ArrayList<>();

//if name of current tour member is on = our new tournament name
//add 'm' to the return queue and return all members
        for (Member m : members) {
            if (m.currentTour().getName().equals(freshTournament.getName())){
                membersToReturn.add(m);
            }
        }
        return membersToReturn;
    }

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }
}
