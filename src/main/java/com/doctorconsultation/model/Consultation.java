package com.doctorconsultation.model;

import org.hibernate.type.descriptor.java.IntegerJavaType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="consultation")
public class Consultation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String doctorname;
	private Integer patientid;
	private String observation;
	private String medications;
	public Consultation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Consultation(Integer id, String doctorname, Integer patientid, String observation, String medications) {
		super();
		this.id = id;
		this.doctorname = doctorname;
		this.patientid = patientid;
		this.observation = observation;
		this.medications = medications;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	public Integer getPatientid() {
		return patientid;
	}
	public void setPatientid(Integer patientid) {
		this.patientid = patientid;
	}
	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}
	public String getMedications() {
		return medications;
	}
	public void setMedications(String medications) {
		this.medications = medications;
	}
	@Override
	public String toString() {
		return "Consultation [id=" + id + ", doctorname=" + doctorname + ", patientid=" + patientid + ", observation="
				+ observation + ", medications=" + medications + "]";
	}
	
	
	
}
