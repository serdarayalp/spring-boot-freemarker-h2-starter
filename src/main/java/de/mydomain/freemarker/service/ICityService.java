package de.mydomain.freemarker.service;

import de.mydomain.freemarker.model.City;

import java.util.List;

public interface ICityService {
    List<City> findAll();
}