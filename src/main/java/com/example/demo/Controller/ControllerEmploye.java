package com.example.demo.Controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employe;
import com.example.demo.Model.EmployeModel;
import com.example.demo.Service.ServiceEmploye;


@RestController
public class ControllerEmploye {

	@Autowired
	@Qualifier("ServEmploye")
	private ServiceEmploye serviceEmploye;
	
	private static final Logger logger = LoggerFactory.getLogger(ControllerEmploye.class);
	
	@GetMapping("/getall")
	 //ResponseEntity<List<Employe>>  getEmployee(){
	ResponseEntity<List<EmployeModel>>  getEmployee(){
		return new ResponseEntity<>(serviceEmploye.getAll(),HttpStatus.OK);
	}
	
	@PostMapping("/save")
	void saveEmploye(@RequestBody Employe employee) {
		serviceEmploye.save(employee);
	}
	
	@GetMapping("/{id}")
	Employe findEmploye(@PathVariable("id") Long idempl) {
		return serviceEmploye.getFindId(idempl);
	}
	@PutMapping("/{id}")
	void updateEmployee(@PathVariable("id") Long idempl, @RequestBody Employe em ) {
		Employe employe= serviceEmploye.getFindId(idempl);
		logger.info("-----findEmploye-----"+employe);
		employe.setEmail_address(em.getEmail_address());
		employe.setFirst_name(em.getFirst_name());
		employe.setLast_name(em.getLast_name());
		employe.setJob_title(em.getJob_title());
		logger.info("-----update----"+employe.toString());
		serviceEmploye.save(employe);		
	}
	
	@DeleteMapping("/{id}")
	void update(@PathVariable ("id") Long idemp) {
		serviceEmploye.delete(idemp);
	}
	
}
