package com.agile.birlasoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.agile.birlasoft.model.Specification;
import com.agile.birlasoft.repository.SpecificationRepository;

@Service
@Transactional
public class SpecificationService {

	@Autowired
	private SpecificationRepository repo;
	
	public List<Specification> listAll() {
		return repo.findAll();
	}
	
	public void save(Specification specification) {
		repo.save(specification);
	}
	
	public Specification get(long Specification_Id) {
		return repo.findById(Specification_Id).get();
	}
	
	public void delete(long Specification_Id) {
		repo.deleteById(Specification_Id);
	}
}
