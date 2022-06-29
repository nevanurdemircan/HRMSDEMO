package com.hrms.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="job_position")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JobPosition extends BaseEntity {
    @Column
    private String name;
    @ManyToOne
    @JoinColumn(name="employee_id")
    private Employee employee;



}
