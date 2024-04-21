package com.ceu.HospitalManagement.repositories;

import com.ceu.HospitalManagement.entities.Prescription;
import com.ceu.HospitalManagement.entities.RO.PrescriptionRO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PrescriptionRepository extends MongoRepository<Prescription, String> {
}
