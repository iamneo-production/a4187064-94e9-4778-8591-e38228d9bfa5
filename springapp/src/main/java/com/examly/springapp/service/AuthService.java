package com.examly.springapp.service;

import com.examly.springapp.Models.AdminModel;
import com.examly.springapp.Models.LoginModel;
import com.examly.springapp.Models.UserModel;

public interface AuthService {
    public Boolean isUserPresent(LoginModel data);

    Boolean isAdminPresent(LoginModel data);

    UserModel saveUser(UserModel userModel);

    AdminModel saveAdmin(AdminModel adminModel);
}
