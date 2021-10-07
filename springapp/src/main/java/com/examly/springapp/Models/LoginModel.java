package com.examly.springapp.Models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long loginId;

    private String email;
    private  String password;
}
