package com.hrms.service.impl;

import com.hrms.entities.JobSeeker;
import com.hrms.repository.JobSeekerRepository;
import com.hrms.service.JobSeekerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service


public class JobSeekerServiceImpl implements JobSeekerService {
private final JobSeekerRepository jobSeekerRepository;
    @Override
    public JobSeeker save(JobSeeker entity) {
      JobSeeker jobSeeker=  this.jobSeekerRepository.save(entity);
        return jobSeeker;
    }

    @Override
    public void delete(JobSeeker entity) {
        this.jobSeekerRepository.delete(entity);

    }

    @Override
    public JobSeeker update(JobSeeker entity) {
        return this.jobSeekerRepository.save(entity);

    }

    @Override
    public JobSeeker findOne(Long aLong) {
       return this.jobSeekerRepository.findById(aLong).get();

    }

    @Override
    public List<JobSeeker> findAll() {
        return this.jobSeekerRepository.findAll();

    }
}
