package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employe;
import com.example.demo.Service.ServiceEmploye;

@Service("ServEmploye")
public class ServiceEmployeImpl implements ServiceEmploye{


	
	
	@Override
	public List<Employe> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
