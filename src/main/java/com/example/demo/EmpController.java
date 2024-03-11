package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class EmpController {
	@Autowired
  private EmpService empservice;
	@GetMapping("/")
	public String message() {
		return "welcome to spring boot";
	}
	@PostMapping("/customer")
	public Emp saveemp( @RequestBody Emp emp) {
		return empservice.saveemp(emp);
	}
	@GetMapping("/customers")
	public List< Emp> viewemp() {
		return empservice.viewemp();
	}
	@GetMapping("/customers/{id}")
	public Optional <Emp> viewoneemp(@PathVariable ("id") int cid) {
		return empservice.viewoneemp(cid);
	}
	@DeleteMapping("/customers/{id}")
	public String  deleteemp(@PathVariable ("id") int cid) {
		return empservice.deleteemp(cid);
}
	@PutMapping("/customer")
	public Emp editemp( @RequestBody Emp emp) {
		return empservice.saveemp(emp);
	}
	@PostMapping("/login")
	public boolean login(@RequestBody Emp emp) {
		return empservice.login(emp);
	}
}
