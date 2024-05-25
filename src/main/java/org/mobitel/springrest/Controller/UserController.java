package org.mobitel.springrest.Controller;


import org.mobitel.springrest.User.User;
import org.mobitel.springrest.User.UserDaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {

    private UserDaoService userDaoService;

    public UserController(UserDaoService userDaoService){
        this.userDaoService= userDaoService;
    }

    @GetMapping()
    public List<User> retrieveAllUsers(){
       return  this.userDaoService.findAll();
    }

    @GetMapping("/{userid}")
    public User retrieveAllUsers(@PathVariable int userid){
        return  this.userDaoService.findOne(userid);

    }

 /*   @PostMapping("")
    public void saveUser(@RequestBody User user){
        this.userDaoService.save(user);
    }
*/
    // enhancing above POST method

  @PostMapping("")
  public ResponseEntity<Object> saveUser(@RequestBody User user){
      User savedUser= this.userDaoService.save(user);
      URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
      return ResponseEntity.created(location).build();
  }

}