package JuegoPuntuacion.entities;

public class Game {

    private int id;
    private int user;
    private int score;

    // Builders
    public Game() {
    }

    // Setter and Getter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

}
