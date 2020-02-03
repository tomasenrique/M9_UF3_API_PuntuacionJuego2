package JuegoPuntuacion.controller;

import JuegoPuntuacion.Manager.UserManager;
import JuegoPuntuacion.entities.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private UserManager userManager =  new UserManager();

    @GetMapping("/game/user")
    public List<User> getUserManager() {
        return this.userManager.getUsers();
    }

    @GetMapping("/game/user/{id}")
    public User getUser(@PathVariable Integer id) {
        return this.userManager.getUser(id);
    }


    @PostMapping("/game/user")
    public void addUser(@RequestBody User user) {
        // Agrega un usuario a la lista
        this.userManager.addUser(user);
    }

    @DeleteMapping("/game/user/{id}")
    public void deleteUser(@PathVariable Integer id){
        // Elimina un registro
        this.userManager.deleteUser(id);
    }


    @PutMapping("/game/user")
    public void UpdateUser(@RequestBody User user){
        this.userManager.updateUser(user);

    }



}
