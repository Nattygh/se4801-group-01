package com.coursehub.controller;

import com.coursehub.dto.UserResponseDto;
import com.coursehub.model.User;
import com.coursehub.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@Valid @RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping
    public List<UserResponseDto> getAllUsers() {
        return userService.getAllUsers().stream()
                .map(user -> UserResponseDto.builder()
                        .id(user.getId())
                        .firstName(user.getFirstName())
                        .lastName(user.getLastName())
                        .email(user.getEmail())
                        .role(user.getRole())
                        .build())
                .collect(Collectors.toList());
    }
}