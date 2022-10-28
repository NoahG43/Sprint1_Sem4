// Worked on by Noah Gosse

package com.keyin.members;

import com.keyin.data.Database;

import java.util.List;

// Errors Since Database file is empty
public class MemberManager {
    private Database database;
    public List<Member> getMemberByTourName(String tourName){
        Tournament tournament = database.getTournamentByName(tourName);
        List<Member> members = database.getAllMembers();

        List<Member> membersToReturn = new ArrayList<Members>();

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
