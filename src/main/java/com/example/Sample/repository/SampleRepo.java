package com.example.Sample.repository;

import com.example.Sample.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleRepo extends JpaRepository<Customer, Long> {

}
