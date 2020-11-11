package com.example.demo.ServiceImpl;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employe;
import com.example.demo.Repository.RepositoryEmploye;
import com.example.demo.Service.ServiceEmploye;

@Service("ServEmploye")
public class ServiceEmployeImpl implements ServiceEmploye {

	@Autowired
	@Qualifier("RepoEmploye")
	private RepositoryEmploye repositoryEmploye;
	
	

	@Override
	public List<Employe> getAll() {
		// TODO Auto-generated method stub
		return repositoryEmploye.findAll();
	}

	@Override
	public void save(Employe e) {
		// TODO Auto-generated method stub
		repositoryEmploye.save(e);
	}

	@Override
	public void update(Employe e) {
		// TODO Auto-generated method stub
		repositoryEmploye.save(e);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repositoryEmploye.deleteById(id);
	}

	@Override
	public Employe getFindId(Long id) {
		// TODO Auto-generated method stub
		return repositoryEmploye.findById(id)
				.orElseThrow(() -> new NoSuchElementException("Employe does not exist !!!!! " + id));
	}

}
