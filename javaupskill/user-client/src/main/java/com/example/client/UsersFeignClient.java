package com.example.client;

import com.example.data.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "user-service", url = "http://localhost:8081")
public interface UsersFeignClient {
    @GetMapping("/api/users")
    List<User> list();

    @GetMapping("/api/users/{id}")
    User get(@PathVariable("id") Long id);

    @PostMapping("/api/users")
    User create(@RequestBody User user);
}
