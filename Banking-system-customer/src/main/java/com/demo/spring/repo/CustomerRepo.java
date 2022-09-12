package com.demo.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.spring.entity.Account;

public interface CustomerRepo extends JpaRepository<Account, Long>{

}
