package tr.com.example.springcache.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tr.com.example.springcache.model.User;
import tr.com.example.springcache.service.UserService;

@RestController
public class UserController {

  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/users/{username}")
  public ResponseEntity<User> getUser(@PathVariable String username) {
    User user = userService.getUser(username);
    return ResponseEntity.ok(user);
  }

  @PutMapping("/users")
  public ResponseEntity<User> updateUser(@RequestBody User user) {
    userService.updateUser(user);
    return ResponseEntity.ok(user);
  }

  @GetMapping("/createUser/{username}")
  public ResponseEntity<User> createUser(@PathVariable String username) {
    User user =new User(username,username+"-firstName",username+"-lastName");
    userService.createUser(user);
    return ResponseEntity.ok(user);
  }

  @DeleteMapping("/users/{username}")
  public ResponseEntity<User> deleteUser(@PathVariable String username) {
    final User user = userService.deleteUser(username);
    return ResponseEntity.ok(user);
  }

}
