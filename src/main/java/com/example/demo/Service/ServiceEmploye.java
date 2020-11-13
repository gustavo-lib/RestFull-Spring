package com.example.demo.Service;

import java.util.List;


import com.example.demo.Entity.Employe;
import com.example.demo.Model.EmployeModel;

public interface ServiceEmploye {
	
	List<EmployeModel>  getAll();
	
	Employe getFindId(Long id);
	
	void save(Employe e);
	
	void update(Employe e);
	
	void delete(Long id);
	
	

}
