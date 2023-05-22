package com.example.Lab2;

import org.springframework.data.mongodb.repository.MongoRepository;
public interface BankRepository extends MongoRepository<Bank, String>{

}
