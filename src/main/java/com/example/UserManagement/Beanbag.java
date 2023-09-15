package com.example.UserManagement;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Beanbag {

    @Bean
    public  List<User> usermanager(){
       return new ArrayList<>();
    }

}
