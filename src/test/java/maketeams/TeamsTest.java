package maketeams;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.Collection;

import static org.hamcrest.Matchers.empty;
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
}