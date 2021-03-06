package com.nemchinovrp.kubernates.controller;

import com.nemchinovrp.kubernates.dao.UserRepository;
import com.nemchinovrp.kubernates.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private UserRepository userRepository;

    @GetMapping("test")
    public String test() {
        return "test - test";
    }

    @GetMapping("connect")
    public String connection() throws SQLException {
        return jdbcTemplate.toString() + " - "
                + jdbcTemplate.getDataSource().getConnection().getCatalog();
    }

    @GetMapping("add_user")
    public User addUser() {
        return userRepository.save(new User());
    }

    @GetMapping("all_users")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
