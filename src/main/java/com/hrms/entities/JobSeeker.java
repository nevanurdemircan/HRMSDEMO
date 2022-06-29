package com.hrms.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "job_seeker")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker extends BaseEntity{
    @OneToOne
    private User user;
}
