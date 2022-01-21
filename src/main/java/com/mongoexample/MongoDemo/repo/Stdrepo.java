package com.mongoexample.MongoDemo.repo;

import com.mongoexample.MongoDemo.mode.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Stdrepo extends MongoRepository<Student,Integer> {
}
