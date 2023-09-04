package com.javatechie.springbatchforbeginnersjavatechie.repository;

import com.javatechie.springbatchforbeginnersjavatechie.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer,Integer> {
}
