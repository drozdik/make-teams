package maketeams;

import java.util.Collections;
import java.util.List;

public class Team {
    private String name;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<String> getMemberNames() {
        return Collections.emptyList();
    }
}
