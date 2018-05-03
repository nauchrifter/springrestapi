package com.example.demo.repository;

import com.example.demo.models.Player;

import java.awt.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "players")
public interface PlayerRepository extends MongoRepository<Player, String> {
	@RestResource(path = "names")
    public List findByName(@Param("name") String name);
}
