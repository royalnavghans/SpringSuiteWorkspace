package com.spring.Profiles.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.Profiles.beans.Country;

public interface CountryDao extends JpaRepository<Country, Integer> {

}
