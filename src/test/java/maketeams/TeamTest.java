package maketeams;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.Collection;
import java.util.List;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.hasItem;
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

    @Test
    public void shouldReturnAddedMemberName() throws Exception {
        // given
        Team team = new Team("TeamA");
        Member paul = new Member("Paul");
        team.addMember(paul);

        // when
        List<String> memberNames = team.getMemberNames();

        // then
        assertThat(memberNames, hasItem("Paul"));
    }

    @Test
    public void shouldNotReturnRemovedMemberName() throws Exception {
        // given
        Team team = new Team("TeamA");
        Member paul = new Member("Paul");
        team.addMember(paul);
        team.removeMember(paul);

        // when
        List<String> memberNames = team.getMemberNames();

        // then
        assertThat(memberNames, not(hasItem("Paul")));
    }


}