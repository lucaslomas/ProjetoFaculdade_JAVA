package com.LucasDev.ShowsPrefeitura.repository;

import com.LucasDev.ShowsPrefeitura.entities.Events;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventsRepository extends MongoRepository<Events, String> {
}
