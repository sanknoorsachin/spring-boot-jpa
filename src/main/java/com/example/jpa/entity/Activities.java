package com.example.jpa.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tbl_activities")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Activities {
	@Id
	@SequenceGenerator(name = "activity_sequence", sequenceName = "activity_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "activity_sequence")
	@Column(name="activity_id")
	private Long activityId;
	
	@Column(name="activity_name")
	private String activityName;
	
	@Column(name="activity_period")
	@Temporal(value = TemporalType.DATE)
	private Date period;
	

}
