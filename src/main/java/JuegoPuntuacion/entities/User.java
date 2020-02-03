package JuegoPuntuacion.entities;

public class User {

    private int id;
    private int user;
    private int score;

    // Builder
    public User() {
    }

    // Setter and Getter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
