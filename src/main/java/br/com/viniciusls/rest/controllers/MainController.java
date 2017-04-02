package br.com.viniciusls.rest.controllers;

import br.com.viniciusls.rest.models.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vinicius Luiz on 02/04/2017.
 */
@RestController
@RequestMapping("/api")
public class MainController {
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<User> index() {
        User user1 = new User(1, "Vinícius Silva", "vinicius768@msn.com", "Teste de usuário 1");
        User user2 = new User(2, "Diana", "diana@hotmail.com", "Teste de usuário 2");
        User user3 = new User(3, "Lucas", "lucas@hotmail.com", "Teste de usuário 3");

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        return users;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public User view(@PathVariable("id") int id) {
        User user1 = new User(1, "Vinícius Silva", "vinicius768@msn.com", "Teste de usuário 1");
        User user2 = new User(2, "Diana", "diana@hotmail.com", "Teste de usuário 2");
        User user3 = new User(3, "Lucas", "lucas@hotmail.com", "Teste de usuário 3");

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        return users.get(id - 1);
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public User create(@RequestBody User user) {
        user.setCodigo(4);

        return user;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = "application/json")
    @ResponseBody
    public User edit(@PathVariable("id") int id, @RequestBody User user) {
        user.setCodigo(id);
        
        return user;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
    @ResponseBody
    public List<User> delete(@PathVariable("id") int id) {
        User user1 = new User(1, "Vinícius Silva", "vinicius768@msn.com", "Teste de usuário 1");
        User user2 = new User(2, "Diana", "diana@hotmail.com", "Teste de usuário 2");
        User user3 = new User(3, "Lucas", "lucas@hotmail.com", "Teste de usuário 3");

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        users.remove(id - 1);

        return users;
    }

    @RequestMapping(value = "/e400")
    public ResponseEntity<String> e400() {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    @RequestMapping(value = "/e401")
    public ResponseEntity<String> e401() {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
    }

    @RequestMapping(value = "/e403")
    public ResponseEntity<String> e403() {
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(null);
    }

    @RequestMapping(value = "/e404")
    public ResponseEntity<String> e404() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    @RequestMapping(value = "/e500")
    public ResponseEntity<String> e500() {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }

    @RequestMapping(value = "/e502")
    public ResponseEntity<String> e502() {
        return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(null);
    }
    @RequestMapping(value = "/e503")
    public ResponseEntity<String> e503() {
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(null);
    }

}
