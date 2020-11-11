package com.example.demo.Service;

import java.util.List;


import com.example.demo.Entity.Employe;

public interface ServiceEmploye {
	
	List<Employe>  getAll();
	
	Employe getFindId(Long id);
	
	void save(Employe e);
	
	void update(Employe e);
	
	void delete(Long id);
	
	

}
