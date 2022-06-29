package com.hrms.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "system_personnel")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SystemPersonnel  extends BaseEntity{

   @OneToOne
   private User user;

}
