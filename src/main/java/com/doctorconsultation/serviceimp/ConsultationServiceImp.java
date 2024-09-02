package com.doctorconsultation.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctorconsultation.model.Consultation;
import com.doctorconsultation.repository.ConsultationRepository;
import com.doctorconsultation.service.ConsultationService;

@Service
public class ConsultationServiceImp implements ConsultationService{

	@Autowired
	private ConsultationRepository consultationRepository;
	@Override
	public Consultation save(Consultation consultation) {

		return consultationRepository.save(consultation);
	}

	@Override
	public Consultation update(int id, Consultation consultation) {
		Consultation exitingCosultation=consultationRepository.findById(id).get();
		Consultation updatedConsultation=exitingCosultation;
		updatedConsultation.setDoctorname(consultation.getDoctorname());
		updatedConsultation.setObservation(consultation.getObservation());
		updatedConsultation.setPatientid(consultation.getPatientid());
		updatedConsultation.setMedications(consultation.getMedications());
		return consultationRepository.save(updatedConsultation);
	}

	@Override
	public void delete(int id) {
		Consultation exitingCosultation=consultationRepository.findById(id).get();
		consultationRepository.delete(exitingCosultation);
	}

	@Override
	public Consultation findConsultionById(int id) {

		return consultationRepository.findById(id).get();
	}

	@Override
	public List<Consultation> findAllConssultions() {
	
		return consultationRepository.findAll();
	}

}
