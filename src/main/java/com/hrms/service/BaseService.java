package com.hrms.service;

import com.hrms.entities.Employee;

import java.util.List;

public interface BaseService<T,ID> {
    T save(T entity);

    void delete(T entity);

    T update(T entity);

    T findOne(ID id);

    List<T> findAll();
}
