package JuegoPuntuacion.Manager;

import JuegoPuntuacion.entities.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class GameManager {

    private Map<Integer, Game> listGame; // este sera el nombre que aparecera en el JSON
    private AtomicInteger nextId;

    // Builder
    public GameManager() {
        listGame = new ConcurrentHashMap<>(); // List Key: Object
        nextId =  new AtomicInteger(1); // initializing to 1
    }

    // Setter and Getter
    public Map<Integer, Game> getListGame() {
        return listGame;
    }


    public void setListGame(Map<Integer, Game> listGame) {
        this.listGame = listGame;
    }

    // Methods
    public void addGame(Game game){
        Integer id = nextId.getAndIncrement(); // Get id and increment the number
        game.setId(id); // se cambia el id de usuario para que sea igual al de la lista y solo se pase la puntuacion en el POST
        listGame.put(id, game); // Add one object to list with your id
    }

    public void deleteGame(Integer id){
        listGame.remove(id);
    }


    public void updateGame(Game game){
        Integer id = game.getId();
        listGame.replace(id, game);
    }

    // Este metodo devolvera las puntuaciones como un array y no mostrara el id de envio a la API
    public List<Game> getListGames() {
        return new ArrayList<>(listGame.values());
    }





}
