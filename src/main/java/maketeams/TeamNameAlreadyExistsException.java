package maketeams;

public class TeamNameAlreadyExistsException extends Exception{

    public TeamNameAlreadyExistsException() {
        super("Team with same name already exists");
    }
}
