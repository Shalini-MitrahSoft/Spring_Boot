package com.example.Sample.controller;

import com.example.Sample.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Sample.repository.SampleRepo;

import java.util.List;

@RestController
@RequestMapping("/users")
public class SampleController {

    @Autowired
    private SampleRepo sampleRepo;


    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer){
        return sampleRepo.save(customer);
    }


    @GetMapping
    public List<Customer> getAllUsers(){
        return sampleRepo.findAll();
    }
}
