package com.learnspringboot.interviewbitclone.controllers;

import com.learnspringboot.interviewbitclone.dto.ResponseDto;
import com.learnspringboot.interviewbitclone.models.User;
import com.learnspringboot.interviewbitclone.services.UserService;
import com.learnspringboot.interviewbitclone.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

//@RestController => Takes output in JSON/XML format
//@Controller => Takes output as HTML Pages
//@RequestMapping ("/home")=>maps the request for </home> here

@RestController
@RequestMapping(Constants.USER_END_POINT)
public class UserController {
    private UserService userService ;

    @Autowired
    private UserController(UserService userService){
        this.userService = userService;
    }

//    POST, PUT, GET, UPDATE, DELETE

    @PostMapping
    public User createUser(@RequestBody User user){

        return userService.createUser(user);
    }
//    Get request from /users/id . So, We will get data from the Path
//    @PathVariable => get data from path
    @GetMapping("/{id}")
    public ResponseDto<User> getUserByID(@PathVariable(name="id") UUID id){

        User serviceResponse = userService.getUserByID(id);
        if(serviceResponse==null){
            return new ResponseDto(HttpStatus.NOT_FOUND, serviceResponse);
        }
        return new ResponseDto(HttpStatus.FOUND,userService.getUserByID(id));
    }
}
