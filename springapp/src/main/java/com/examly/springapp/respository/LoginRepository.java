package com.examly.springapp.respository;

import com.examly.springapp.Models.LoginModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<LoginModel,Long> {

    public  LoginModel findByemail(String email);
}
