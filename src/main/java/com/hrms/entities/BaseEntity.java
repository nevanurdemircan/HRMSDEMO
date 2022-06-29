package com.hrms.entities;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;
@Data
@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    protected Long id;
    protected Instant createdTime = Instant.now();
}
