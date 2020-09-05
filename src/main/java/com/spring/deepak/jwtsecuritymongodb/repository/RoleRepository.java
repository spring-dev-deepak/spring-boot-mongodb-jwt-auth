package com.spring.deepak.jwtsecuritymongodb.repository;

import com.spring.deepak.jwtsecuritymongodb.models.ERole;
import com.spring.deepak.jwtsecuritymongodb.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {

    Optional<Role> findByName(ERole name);
}
