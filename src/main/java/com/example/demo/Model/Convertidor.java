package com.example.demo.Model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.Entity.Employe;
//los controladores solo trabajan con modelos, los repositorios con entity

@Component ("convertidor")
public class Convertidor {

	//convertira de una lista de entidades a una lista de objetos
	public List<EmployeModel> getListEntityToModel(List<Employe> listEntity){

		List<EmployeModel> listaEmpModel =new ArrayList<EmployeModel>();
		for (Employe empl : listEntity) {
			listaEmpModel.add(new EmployeModel(empl));
			
		}
		return listaEmpModel;
	}
	
	//modelo to entity
	
	public Employe modelToEntity(EmployeModel e) {
		Employe empEntity =new Employe();
		empEntity.setEmail_address(e.getEmail_address());
		empEntity.setFirst_name(e.getFirst_name());
		empEntity.setJob_title(e.getJob_title());
		empEntity.setLast_name(e.getLast_name());
		return empEntity;
	}
	
	//entity to model
	public EmployeModel entityToModel() {
		return null;
	}
	
}
