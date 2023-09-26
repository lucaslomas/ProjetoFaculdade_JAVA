package com.LucasDev.ShowsPrefeitura.UsersResource;

import com.LucasDev.ShowsPrefeitura.entities.Users;
import com.LucasDev.ShowsPrefeitura.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @Autowired
    public UserService userService;
    @GetMapping
    public ResponseEntity<List<Users>> findAll(){
        List<Users> users = userService.findAllUsers();
        return ResponseEntity.ok().body(users);

    }


}
