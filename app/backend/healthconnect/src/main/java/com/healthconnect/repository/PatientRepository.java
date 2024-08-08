package com.healthconnect.repository;

import com.healthconnect.model.MedicalHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import com.healthconnect.model.Patient;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Patient findByUserId(Long userId);
}

