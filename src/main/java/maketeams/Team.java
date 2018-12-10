package maketeams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Team {
    private List<Member> members = new ArrayList<>();
    private String name;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<String> getMemberNames() {
        return members.stream().map(Member::getName).collect(toList());
    }

    public void addMember(Member paul) {
        members.add(paul);
    }

    public void removeMember(Member paul) {
        members.remove(paul);
    }
}
