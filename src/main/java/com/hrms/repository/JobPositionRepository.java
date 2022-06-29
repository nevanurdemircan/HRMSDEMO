package com.hrms.repository;

import com.hrms.entities.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;


public interface JobPositionRepository extends JpaRepository<JobPosition,Long> {
}
