package maketeams;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.Collection;
import java.util.List;

import static org.hamcrest.Matchers.empty;
import static org.junit.Assert.*;

public class TeamTest {

    @Test
    public void shouldReturnEmptyListIfNoMembersAdded() throws Exception {
        // given
        Team team = new Team("TeamA");

        // when
        List<String> memberNames = team.getMemberNames();

        // then
        assertThat(memberNames, empty());
    }
}