// Worked on by Noah Gosse and Tyler Engle

package com.keyin.members;

import com.keyin.data.Database;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class MemberManagerTest {
    @Mock
    private Database mockDatabase;

    @Test
    public void testGetTournamentByMember() {
        Member One = new Member();
        One.setName("John");


        Tournament Fall2022 = new Tournament();
        Fall2022.setTourName("Fall 2022 World Cup Championship Finale etc...");

        List<Member> memberList = new ArrayList<Member>();

        Member golfOne = new Member();
        golfOne.setName("Toby");
        golfOne.setAddress("123 easy street");
        golfOne.setEmail("tobysquire@gmail.com");

        memberList.add(golfOne);

        Mockito.when(mockDatabase.getTournamentByName("Fall 2022 World Cup Championship Finale etc...")).thenReturn(One);
        Mockito.when(mockDatabase.getMemberByName("John")).thenReturn(golfOne);
        Mockito.when(mockDatabase.getAllMembers()).thenReturn(memberList);

        MemberManager MemberManagerUnderTest = new MemberManager();

        MemberManagerUnderTest.setDatabase(mockDatabase);

        Assertions.assertEquals(1, MemberManagerUnderTest.getMemberByTourName("John").size());

        Assertions.assertEquals(0, MemberManagerUnderTest.getMemberByTourName("Toby").size());

        Member memberPhil = new Member();
        memberPhil.setName("Phil");
        memberPhil.setAddress("234 hard street");
        memberPhil.setEmail("philbuckley@gmail.com");

        memberList.add(memberPhil);

        Assertions.assertEquals(1, MemberManagerUnderTest.getMemberByTourName("Phil").size());
        Assertions.assertEquals(1, MemberManagerUnderTest.getMemberByTourName("Phil").size());
    }

}
