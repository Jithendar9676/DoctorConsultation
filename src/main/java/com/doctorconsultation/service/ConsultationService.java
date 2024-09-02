package com.doctorconsultation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.doctorconsultation.model.Consultation;

@Service
public interface ConsultationService {

	public Consultation save(Consultation consultation);
	public Consultation update(int id,Consultation consultation);
	public void delete(int id);
	public Consultation findConsultionById(int id);
	public List<Consultation> findAllConssultions();
}
