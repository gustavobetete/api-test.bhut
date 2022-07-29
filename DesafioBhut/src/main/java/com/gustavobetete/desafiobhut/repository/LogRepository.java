package com.gustavobetete.desafiobhut.repository;

import com.gustavobetete.desafiobhut.document.Log;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogRepository extends MongoRepository<Log, String> {
}
