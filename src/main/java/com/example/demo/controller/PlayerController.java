package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Player;
import com.example.demo.repository.PlayerRepository;

@RestController
@RequestMapping("/api")
public class PlayerController {
    @Autowired
    PlayerRepository repository;
    
    @GetMapping("/players")
    public List<Player> getAllPlayers() {
    	return repository.findAll();
    }
    
    @PostMapping("/players")
    public Player createTodo(@Valid @RequestBody Player player) {
        return repository.save(player);
    }
}
