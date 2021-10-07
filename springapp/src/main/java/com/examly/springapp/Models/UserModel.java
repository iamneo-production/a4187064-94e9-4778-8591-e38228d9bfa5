package com.examly.springapp.Models;


import lombok.*;
import org.aspectj.bridge.IMessage;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="user",uniqueConstraints = @UniqueConstraint(columnNames = "email"))
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long userId;

    @NotBlank(message = "Please Add Email")
    private String email;
    private String password;
    private String username;
    private String mobileNumber;
    private Long age;
    private String userRole;

}
