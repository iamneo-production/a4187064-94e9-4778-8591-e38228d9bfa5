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
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdminModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long adminId;

    private String email;
    private String password;
    private String mobileNumber;
    private String sellerName;
    private String userRole;
    private String companyName;
    private String companyImageURL;
    private String companyAddress;
    private Long earnings;

}
