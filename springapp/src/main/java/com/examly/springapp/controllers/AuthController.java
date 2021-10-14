package com.examly.springapp.controllers;

import com.examly.springapp.Models.AdminModel;
import com.examly.springapp.Models.LoginModel;
import com.examly.springapp.Models.UserModel;
import com.examly.springapp.service.AuthService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.StyledEditorKit;
import javax.validation.Valid;

@RestController
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/user/login")
    public Boolean isUserPresent(@Valid @RequestBody LoginModel data){
        return authService.isUserPresent(data);
    }
    @PostMapping("/admin/login")
    public Boolean isAdminPresent(@Valid @RequestBody LoginModel data){
        return authService.isAdminPresent(data);
    }
    @PostMapping("user/signup")
    public UserModel saveUser(@Valid @RequestBody UserModel userModel){
        return authService.saveUser(userModel);
    }
    @PostMapping("admin/signup")
    public AdminModel saveAdmin(@Valid @RequestBody AdminModel adminModel){
        return authService.saveAdmin(adminModel);
    }

}
