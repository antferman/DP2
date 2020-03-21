package org.springframework.samples.petclinic.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.PetType;
import org.springframework.samples.petclinic.model.Treatment;
import org.springframework.samples.petclinic.model.Vaccine;
import org.springframework.samples.petclinic.repository.TreatmentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TreatmentService {
	
	@Autowired
	private TreatmentRepository treatmentRepo;
	
	@Transactional
	public Treatment findById(int id) {
		
		return treatmentRepo.findById(id);
	}
	
	@Transactional
	public List<Treatment> findAll(){
		return treatmentRepo.findAll().stream().collect(Collectors.toList());
	}

	@Transactional
	public void saveTreatment(@Valid Treatment treatment) {
		treatmentRepo.save(treatment);
		
	}
	
	
public List<PetType> findPetTypes() {
		
		return treatmentRepo.findPetTypes();
	}

}
