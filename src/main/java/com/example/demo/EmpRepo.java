package com.example.demo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface EmpRepo extends JpaRepository<Emp, Integer> {

	  Optional <Emp> findByEname(String ename);

}
