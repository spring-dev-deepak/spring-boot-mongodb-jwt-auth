package com.spring.deepak.jwtsecuritymongodb.repository;

import com.spring.deepak.jwtsecuritymongodb.models.Customers;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomersRepository extends MongoRepository<Customers, String> {
}
