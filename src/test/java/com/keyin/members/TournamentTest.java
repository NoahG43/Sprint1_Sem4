// Worked on by Jacob Pritchett
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import com.keyin.members.Member;
import com.keyin.members.Tournament;
import org.junit.jupiter.api.Test;

class TournamentTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Tournament}
     *   <li>{@link Tournament#setCashPrize(double)}
     *   <li>{@link Tournament#setEndDate(String)}
     *   <li>{@link Tournament#setEntryFee(double)}
     *   <li>{@link Tournament#setFinalStandings(String)}
     *   <li>{@link Tournament#setLocation(String)}
     *   <li>{@link Tournament#setMembers(Member)}
     *   <li>{@link Tournament#setStartDate(String)}
     *   <li>{@link Tournament#setTourName()}
     *   <li>{@link Tournament#getCashPrize()}
     *   <li>{@link Tournament#getEndDate()}
     *   <li>{@link Tournament#getEntryFee()}
     *   <li>{@link Tournament#getFinalStandings()}
     *   <li>{@link Tournament#getLocation()}
     *   <li>{@link Tournament#getMembers()}
     *   <li>{@link Tournament#getStartDate()}
     *   <li>{@link Tournament#getTourName()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Tournament actualTournament = new Tournament();
        actualTournament.setCashPrize(10.0d);
        actualTournament.setEndDate("2020-03-01");
        actualTournament.setEntryFee(10.0d);
        actualTournament.setFinalStandings("Final Standings");
        actualTournament.setLocation("Location");
        Member member = new Member();
        member.setAddress("42 Main St");
        member.setCurrentTour("Current Tour");
        member.setDuration("Duration");
        member.setEmail("jane.doe@example.org");
        member.setFutureTour("Future Tour");
        member.setMemberType("Member Type");
        member.setName("Name");
        member.setPastTour("Past Tour");
        member.setPhone("4105551212");
        member.setStartDate("2020-03-01");
        actualTournament.setMembers(member);
        actualTournament.setStartDate("2020-03-01");
        actualTournament.setTourName();
        assertEquals(10.0d, actualTournament.getCashPrize());
        assertEquals("2020-03-01", actualTournament.getEndDate());
        assertEquals(10.0d, actualTournament.getEntryFee());
        assertEquals("Final Standings", actualTournament.getFinalStandings());
        assertEquals("Location", actualTournament.getLocation());
        assertSame(member, actualTournament.getMembers());
        assertEquals("2020-03-01", actualTournament.getStartDate());
        assertNull(actualTournament.getTourName());
    }
}
