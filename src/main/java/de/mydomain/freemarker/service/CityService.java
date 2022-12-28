package de.mydomain.freemarker.service;

import de.mydomain.freemarker.model.City;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements ICityService {

    private final JdbcTemplate jdbcTemplate;

    public CityService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<City> findAll() {

        var sql = "SELECT * FROM cities";

        // BeanPropertyRowMapper wandelt eine Zeile in eine neue Instanz
        // der angegebenen abgebildeten Zielklasse um.
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(City.class));
    }
}