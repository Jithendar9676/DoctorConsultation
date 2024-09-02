package com.doctorconsultation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doctorconsultation.model.Consultation;
import com.doctorconsultation.serviceimp.ConsultationServiceImp;

@RestController
@RequestMapping("/consultation")
public class ConsultationController {

	@Autowired
	ConsultationServiceImp consultationServiceImp;
	
	@PostMapping("/save")
	public Consultation save(@RequestBody Consultation consultation) {
		return consultationServiceImp.save(consultation);
	}
	@PutMapping("/update/{id}")
	public Consultation update(@PathVariable int id,@RequestBody Consultation consultation) {
		return consultationServiceImp.update(id, consultation);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
	  consultationServiceImp.delete(id);
	}
	
	@GetMapping("/getConsultation/{id}")
	public Consultation findConsultationById(@PathVariable int id) {
		return consultationServiceImp.findConsultionById(id);
	}
	
	@GetMapping("/getAllConsultions")
	public List<Consultation> findAllConsultions(){
		return consultationServiceImp.findAllConssultions();
	}
}
