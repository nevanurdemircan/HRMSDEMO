package com.hrms.repository;

import com.hrms.entities.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerRepository extends JpaRepository<JobSeeker,Long> {
}
