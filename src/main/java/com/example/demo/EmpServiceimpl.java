package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceimpl implements EmpService{
	@Autowired
 private EmpRepo repo;
	@Override
	public Emp saveemp(Emp emp) {
		return repo.save(emp);
	}
	@Override
	public List<Emp> viewemp() {
		return repo.findAll();
	}
	@Override
	public Optional <Emp> viewoneemp(int cid) {
		return repo.findById(cid);
	}
	@Override
	public String deleteemp(int cid) {
		Emp emp= repo.findById(cid).get();
		repo.delete(emp); 
		return "DELETED SUCESSFULLY";
	}
	
	public boolean login(Emp emp) {
		String name=emp.getEname();
		String password =emp.getEcode();
		boolean status=false;
		Optional<Emp>newEmp=repo.findByEname(name);
		if(newEmp.isPresent()) {
			if(password.equals(newEmp.get().getEcode())) {
				status =true;
			}
		}
		return status;
	}
	

	
}
