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
    public void testGetMembersByTournamentName(){
        Member john = new Member();
        john.setName("John");

        List<Member> memberList = new ArrayList<Member>();

        Tournament fallTour = new Tournament();
        fallTour.setTourName("Fall Tour");

        MemberManager memberManagerUnderTest = new MemberManager();

        memberManagerUnderTest.setDatabase(mockDatabase);

        Assertions.assertTrue(memberManagerUnderTest.getMembersByTournamentName("Fall Tour").size() > 0);
    }
}
