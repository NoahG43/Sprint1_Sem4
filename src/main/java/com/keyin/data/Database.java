// Database file

package com.keyin.data;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import com.keyin.members.Member;
import com.keyin.members.Tournament;
public class Database {
    HashMap<String, Member> member = new HashMap<String, Member>();
    HashMap<String, Tournament> tournament = new HashMap<String, Tournament>();
    public Member getMemberByName(String name){
        return member.get(name);
    }

    public List<Member> getMemberByTournamentName(Member member){
        List<Member> members = getAllMembers();

        List<Member> membersToReturn = new ArrayList<Member>();

        for (Member m : members) {
            if (m.getMembers().getName().equals(member.getName())) {
            membersToReturn.add(m);
        }
    }

    return membersToReturn;
    }

    public Tournament getTournamentByName(String name){
        return tournament.get(name);
    }

    public List<Tournament> getTournamentByMemberName(Tournament tournament){
        List<Tournament> tournaments = getAllTournaments();

        List<Tournament> tournamentsToReturn = new ArrayList<Tournament>();

        for (Tournament t : tournaments) {
            if (t.getTourName().getMembers().equals(tournament.getMembers())) {
                tournamentsToReturn.add(t);
            }
        }

        return tournamentsToReturn;
    }
}
