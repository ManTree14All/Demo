package com.tcs.wu.workFlowService.modelTables;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Notification_Id {
	@Id
	private int notification_Id;
	
	private int workflow_id;
	private int crew_id;
	private String crew_name;
	//private String workflow_type;
	private String subject;
	private String body1;
	private String body2;
	private boolean is_Read;
	private String status;
	private int pm_id;
	//private String department_id;
	//private String notification_type;
	private String to;
	private String cc;
	private boolean is_active;
	private String created_by;
	private String created_date;
	//private String updated_by;
	//private String updated_date;
	

	
}	
