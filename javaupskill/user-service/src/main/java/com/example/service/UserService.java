package com.example.service;

import com.example.data.User;
import com.example.repository.UserRepository;
import com.example.repository.MongoUserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {
    private final UserRepository repo;
    private final MongoUserRepository mongoRepo;

    public UserService(UserRepository repo, MongoUserRepository mongoRepo) {
        this.repo = repo;
        this.mongoRepo = mongoRepo;
    }

    public List<User> findAll() {
        return repo.findAll();
    }

    public Optional<User> findById(Long id) {
        return repo.findById(id);
    }

    public User save(User user) {
        User saved = repo.save(user);
        // also replicate to Mongo
        try {
            mongoRepo.save(saved);
        } catch (Exception ex) {
            // ignore; mongodb optional
        }
        return saved;
    }

    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}
