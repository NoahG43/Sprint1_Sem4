package com.keyin.members;

import com.keyin.data.Database;
import com.keyin.tournaments.Tournament;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class TournamentMembersTest {
    @Mock
    private Database mockDatabase;

    @Test
    public void testGetMembersByTournamentName1() {
        Tournament PGA = new Tournament();
        PGA.setName("Pro golf tour");
        PGA.setId(1);
//create new array list to store list of members
        List<Member> memberList = new ArrayList<>();

//new member obj
        Member albertEd = new Member();
        albertEd.setPhone("6835741");
        albertEd.setCurrentTour(PGA);


        memberList.add(albertEd);

        Mockito.when(mockDatabase
                        .getTournamentByName("Pro golf tour"))
                .thenReturn(PGA);
        //Mockito.when(mockDatabase.getMemberByTournament(PGA).thenReturn(memberList)
    }
        @Test
        public void testGetMembersByTournamentName2() {
            MemberManager memberManagerUnderTest = new MemberManager();
            memberManagerUnderTest.setDatabase(mockDatabase);

            Assertions.assertTrue(memberManagerUnderTest
                    .getMemberByTournamentName("Pro golf tour")
                    .size() > 0);


        }
    }





//    public static void main(String[] args){
//
//        // To be used for unit testing
//
//    }

