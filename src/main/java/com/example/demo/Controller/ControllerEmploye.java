package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employe;

@RestController
public class ControllerEmploye {

	@GetMapping("/getEmployee")
	List<Employe> getEmployee(){
		return null;
	}
	
	@PostMapping("/save")
	void saveEmploye(@RequestBody Employe employee) {
		
	}
	
	
}
