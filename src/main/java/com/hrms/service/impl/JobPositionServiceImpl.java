package com.hrms.service.impl;

import com.hrms.entities.JobPosition;
import com.hrms.repository.JobPositionRepository;
import com.hrms.service.JobPositionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class JobPositionServiceImpl implements JobPositionService {
    private final JobPositionRepository jobPositionRepository;

    @Override
    public JobPosition save(JobPosition entity) {
       JobPosition jobPosition= this.jobPositionRepository.save(entity);
        return jobPosition;
    }

    @Override
    public void delete(JobPosition entity) {
        this.jobPositionRepository.delete(entity);

    }

    @Override
    public JobPosition update(JobPosition entity) {
        return this.jobPositionRepository.save(entity);

    }

    @Override
    public JobPosition findOne(Long aLong) {
        return this.jobPositionRepository.findById(aLong).get();
    }

    @Override
    public List<JobPosition> findAll() {
        return this.jobPositionRepository.findAll();

    }
}
