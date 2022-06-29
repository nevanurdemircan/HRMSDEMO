package com.hrms.service.impl;

import com.hrms.entities.SystemPersonnel;
import com.hrms.repository.SystemPersonnelRepository;
import com.hrms.service.SystemPersonnelService;
import com.sun.org.apache.xerces.internal.impl.dv.dtd.ENTITYDatatypeValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;
@RequiredArgsConstructor
@Service

public class SystemPersonnelServiceImpl implements SystemPersonnelService {
    private final SystemPersonnelRepository systemPersonnelRepository;
    @Override
    public SystemPersonnel save(SystemPersonnel entity) {
        SystemPersonnel systemPersonnel= this.systemPersonnelRepository.save(entity);
        return systemPersonnel;
    }

    @Override
    public void delete(SystemPersonnel entity) {
        this.systemPersonnelRepository.delete(entity);
    }

    @Override
    public SystemPersonnel update(SystemPersonnel entity) {
       return this.systemPersonnelRepository.save(entity);

    }

    @Override
    public SystemPersonnel findOne(Long aLong) {
        return this.systemPersonnelRepository.findById(aLong).get();
    }

    @Override
    public List<SystemPersonnel> findAll() {
        return this.systemPersonnelRepository.findAll();

    }
}