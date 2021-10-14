package com.examly.springapp.service;

import com.examly.springapp.Models.AdminModel;
import com.examly.springapp.Models.LoginModel;
import com.examly.springapp.Models.UserModel;
import com.examly.springapp.respository.AdminRepository;
import com.examly.springapp.respository.LoginRepository;
import com.examly.springapp.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private LoginRepository loginRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AdminRepository adminRepository;
    @Override
    public Boolean isUserPresent(LoginModel data) {
        Optional<LoginModel> db= Optional.ofNullable(loginRepository.findByemail(data.getEmail()));

        if(db.isPresent()){
            if(db.get().getPassword().equals(data.getPassword()))
                return true;
        }
        return false;
    }

    @Override
    public Boolean isAdminPresent(LoginModel data) {
        Optional<LoginModel> db= Optional.ofNullable(loginRepository.findByemail(data.getEmail()));

        if(db.isPresent()){
            if(db.get().getPassword().equals(data.getPassword()))
                return true;
        }
        return false;
    }

    @Override
    public UserModel saveUser(UserModel userModel) {
        return userRepository.save(userModel);
    }

    @Override
    public AdminModel saveAdmin(AdminModel adminModel) {
        return adminRepository.save(adminModel);
    }
}
