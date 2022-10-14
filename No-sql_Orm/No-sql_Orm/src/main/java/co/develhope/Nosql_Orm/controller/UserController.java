package co.develhope.Nosql_Orm.controller;

import co.develhope.Nosql_Orm.entities.User;
import co.develhope.Nosql_Orm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping("")
    public void createUser(@RequestBody User user) {
        user.setId(null);
        userRepository.save(user);
    }

    @PutMapping("/{id}")
    public User editUser(@PathVariable String id, @RequestBody User user) {
        user.setId(id);
        return userRepository.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) {
        userRepository.deleteById(id);
    }
}
