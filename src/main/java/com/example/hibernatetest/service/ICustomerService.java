package com.example.hibernatetest.service;

import com.example.hibernatetest.entity.Customer;

public interface ICustomerService {
    public Customer findById(int id);

    public void save(Customer customer);
}