package com.rc.app.Repositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.rc.app.Models.*;

@Repository
public interface PreguntaRespuestaRepository extends MongoRepository<PreguntaRespuestaModel, String> {
    
}
