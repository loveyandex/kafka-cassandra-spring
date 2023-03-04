package com.kcs.kafkacassandraspring.services.user;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class Controller {

      @Autowired
      private UserRepo userRepo;

      @GetMapping("/")
      public List<User> GetUser() {
            List<User> findAll = userRepo.findAll();
            return findAll;
      }

      @GetMapping("/new")
      public List<User> GetNewUser() {
            userRepo.save(new User(UUID.randomUUID(), null, null, null));
            List<User> findAll = userRepo.findAll();
            return findAll;
      }

}
