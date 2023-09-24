package com.kaiburr.Ankit.repository;

import java.util.List;

import com.kaiburr.Ankit.model.Server;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServerRepository extends MongoRepository<Server, Long>{


	 public List<Server> findByName(String name);
}
