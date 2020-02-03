package JuegoPuntuacion.Manager;

import JuegoPuntuacion.entities.Game;
import JuegoPuntuacion.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class UserManager {

    private Map<Integer, User> listUsers; // este sera el nombre que aparecera en el JSON
    private AtomicInteger nextIdUser;

    // Builder
    public UserManager() {
        listUsers = new ConcurrentHashMap<>(); // List Key: Object
        nextIdUser = new AtomicInteger(1); // initializing to 1
    }

    // Setter and Getter
    public Map<Integer, User> getListUsers() {
        return listUsers;
    }

    public void setListUsers(Map<Integer, User> listUsers) {
        this.listUsers = listUsers;
    }


    // Methods
    public void addUser(User user) {
        Integer id = nextIdUser.getAndIncrement();
        user.setId(id);
        listUsers.put(id, user);
    }

    public void deleteUser(Integer id) {
        // Para borrar un registro
        listUsers.remove(id);
    }

    public void updateUser(User user) {
        Integer id = user.getId();
        listUsers.replace(id, user);
    }

    // Devuelve un registro de la lista
    public User getUser(Integer id) {
        // devolvera un usuario
        return listUsers.get(id);
    }

    // Devuelve una lista de registros
    public List<User> getUsers(){
        return new ArrayList<>(listUsers.values());
    }


}
