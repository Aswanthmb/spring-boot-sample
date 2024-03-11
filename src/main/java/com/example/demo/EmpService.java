package com.example.demo;

import java.util.List;
import java.util.Optional;

public interface EmpService {

	public Emp saveemp(Emp emp);

	public List<Emp> viewemp();

	public Optional <Emp> viewoneemp(int cid);

	public String  deleteemp(int cid);

	public boolean login(Emp emp);


}
