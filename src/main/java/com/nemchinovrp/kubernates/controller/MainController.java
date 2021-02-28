package com.nemchinovrp.kubernates.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@RequestMapping("/api")
public class MainController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("test")
    public String test() {
        return "test - test";
    }

    @GetMapping("connect")
    public String connection() throws SQLException {
        return jdbcTemplate.toString() + " - "
                + jdbcTemplate.getDataSource().getConnection().getCatalog();
    }
}
