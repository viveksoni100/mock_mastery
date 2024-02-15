package com.mockmastery.controller;

import com.mockmastery.dto.UserSuccessResponse;
import com.mockmastery.entity.User;
import com.mockmastery.service.UserService;
import com.mockmastery.utility.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserSuccessResponse> registerUser(@RequestBody User user) {
        Optional<User> registeredUser = Optional.ofNullable(userService.registerUser(user));
        if (registeredUser.isPresent()) {
            var response = new UserSuccessResponse(Constant.USER_REG_SUCCESS_MSG, registeredUser.get().getId());
            return ResponseEntity.ok(response);
        }
        return ResponseEntity.notFound().build();
    }

}
