package com.tcs.wu.workFlowService.modelTables;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Workflow_details {
	
	@Id
	private int workflowId;
	
	private String workflowType;
	private String incident_date;//Date
	private int crew_id;
	private String wf_reason;
	private Date wf_start_date;//Date
	private String wf_status;
	private Date wf_closed_date;//Date
	private String root_cause_sub_cat;
//	private String root_cause_category1;
//	private String root_cause_sub_cat2;
//	private String root_cause_category2;
//	@Autowired	
	private /*Root_cause_remarks*/String root_cause_remarks;
//	private String crew_position_code;
	private int pm_id;
//	private String closure_reason;
	private String aims_code;
//	private String notification_type;
//	private String pm_notes;
	private boolean is_active;
	private boolean is_Read;
	private String created_by;
	private Timestamp created_date;//Timestamp
//	private String updated_by;
//	private Timestamp updated_date;
//	private String wf_update_reason;
	private String department_id;
//	private String wf_indicator;
}
