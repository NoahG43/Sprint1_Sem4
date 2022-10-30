//Last edited Oct 30 7:30pm
//Created for
//Created on Oct 23
//Created by Noah Gosse


package com.keyin.members;

import com.keyin.data.Database;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MemberManagerTest {


    @Mock
    private Database database;
    @InjectMocks
    private MemberManager underTest;

    @Test
    void getMembersByTournamentName() {
    }

    @Test
    void getTournamentByMemberName() {
    }

    @Test
    void getDatabase() {
    }

    @Test
    void setDatabase() {
    }

    @Nested
    class WhenGettingMembersByTournamentName {
        private final String NAME = "NAME";

        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingTournamentByMemberName {
        private final String TOUR_NAME = "TOUR_NAME";

        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingDatabase {
        @BeforeEach
        void setup() {
        }
    }
}
