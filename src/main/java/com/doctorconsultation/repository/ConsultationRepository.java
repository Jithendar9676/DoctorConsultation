package com.doctorconsultation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctorconsultation.model.Consultation;

@Repository
public interface ConsultationRepository extends JpaRepository<Consultation, Integer>{

}
