package JuegoPuntuacion.controller;

import JuegoPuntuacion.entities.Game;
import JuegoPuntuacion.Manager.GameManager;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class GameController {

    private GameManager gameManager = new GameManager();

    @PostMapping("/game/score")
    public void addScore(@RequestBody Game game) {
        this.gameManager.addGame(game);
    }

    @GetMapping("/game/score")
    public List<Game> getGameManager() {
        return this.gameManager.getListGames();
    }


    @DeleteMapping("/game/score/{id}")
    public void deleteScore(@PathVariable Integer id) {
        this.gameManager.deleteGame(id);
    }

    @PutMapping("/game/score")
    public void actualizar(@RequestBody Game game) {
        this.gameManager.updateGame(game);
    }


}

