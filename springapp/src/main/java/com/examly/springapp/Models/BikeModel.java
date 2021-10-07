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

public class BikeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String bikeId;

    private String bikeNo;
    private String adminId;
    private String status;
    private String price;
    private String type;

}
