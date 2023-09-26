package com.LucasDev.ShowsPrefeitura.service;

import com.LucasDev.ShowsPrefeitura.entities.Users;
import com.LucasDev.ShowsPrefeitura.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    public UserRepository userRepository;

    public List<Users> findAllUsers(){
        return userRepository.findAll();
    }




}
