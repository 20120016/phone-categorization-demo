/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercise.demo.repositories;

import com.exercise.demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ahmed.gamal
 */
@Transactional(readOnly = true)
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
