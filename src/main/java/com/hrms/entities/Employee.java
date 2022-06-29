package com.hrms.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.util.List;
@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee extends BaseEntity {
    @OneToOne()
    private User user;

    @OneToMany(mappedBy = "employee")
    private List<JobPosition>jobPositionList;


}
