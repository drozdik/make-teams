package maketeams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Teams {

    private List<Team> teams = new ArrayList();

    public Collection<String> getAllTeamNames() {
        return teams.stream().map(team -> team.getName()).collect(toList());
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public void removeTeam(Team team) {
        teams.remove(team);
    }
}
