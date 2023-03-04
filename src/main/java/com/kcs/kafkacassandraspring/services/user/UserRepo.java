package com.kcs.kafkacassandraspring.services.user;

import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository; 

public interface UserRepo extends CassandraRepository<User, UUID> {
      User findByFirstName(String username);

}