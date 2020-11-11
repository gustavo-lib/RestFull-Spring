package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employe;
import com.example.demo.Service.ServiceEmploye;

@RestController
public class ControllerEmploye {

	@Autowired
	@Qualifier("ServEmploye")
	private ServiceEmploye serviceEmploye;
	
	@GetMapping("/getall")
	List<Employe> getEmployee(){
		
		return serviceEmploye.getAll();
	}
	
	@PostMapping("/save")
	void saveEmploye(@RequestBody Employe employee) {
		serviceEmploye.save(employee);
	}
	
	
}
