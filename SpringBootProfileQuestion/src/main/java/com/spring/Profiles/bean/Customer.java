package com.spring.Profiles.bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public interface Customer {
public void getCustomer(String name);
}
