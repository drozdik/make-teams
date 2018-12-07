package maketeams;

import org.hamcrest.Matchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Collection;

import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.*;

public class TeamsTest {

    @Test
    public void shouldReturnEmptyListOfNamesIfNoTeamsAdded() throws Exception {
        // given
        Teams teams = new Teams();
        // when
        Collection<String> teamNames = teams.getAllTeamNames();
        // then
        assertThat(teamNames, empty());
    }

    @Test
    public void shouldReturnAddedTeamName() throws Exception {
        // given
        Teams teams = new Teams();
        Team teamA = new Team("teamA");
        // when
        teams.addTeam(teamA);
        Collection<String> teamNames = teams.getAllTeamNames();
        // then
        assertThat(teamNames, hasItem("teamA"));
    }

    @Test
    public void shouldNotReturnDeletedTeamName() throws Exception {
        // given
        Teams teams = new Teams();
        Team teamA = new Team("teamA");
        Team teamB = new Team("teamB");

        // when
        teams.addTeam(teamA);
        teams.addTeam(teamB);
        teams.removeTeam(teamA);
        Collection<String> teamNames = teams.getAllTeamNames();

        // then
        assertThat(teamNames, not(hasItem("teamA")));
        assertThat(teamNames, hasItem("teamB"));
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldThrowIfTeamWithSameNameExists() throws Exception {
        // given
        Teams teams = new Teams();
        teams.addTeam(new Team("teamA"));

        // expect
        expectedException.expect(TeamNameAlreadyExistsException.class);

        // when
        teams.addTeam(new Team("teamA"));
    }
}