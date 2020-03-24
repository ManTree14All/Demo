package com.tcs.wu.workFlowService.modelTables;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import com.tcs.wu.workFlowService.modelPojo.Document_upload;
import com.tcs.wu.workFlowService.modelPojo.Lateness;
import com.tcs.wu.workFlowService.modelPojo.Medical_osi_details;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Offload_details {
	
	@Id
	private int offload_seq;
	
	private int workflow_id;
	//private int investigation_id;
	private Date offload_date;
	private String offload_status;
	private String offload_reason;
	private int crew_id;
	private int pm_id;
	//private int crew_position_id;
	private String aims_code;
	//private String offload_sub_activity;
	//private String groom_details;
//	@Autowired
//	private /*Lateness*/String lateness;//
//	@Autowired
//	private /*Medical_osi_details*/String medical_osi_details;//
	//private String osa_safety_feedback;
	//private Date training_evaluation_date;
	//private String training_evaluation_venue;
	//private String training_contact_person;
//	private String evalation_result;
	//private String evaluation_summary;
//	@Autowired
	//private /*Document_upload*/String document_upload;//
	//private String missing_document_details;
	//private String qualification_feedback;
//	private String no_show_details;
//	private String other_details;
//	private String pm_notes;
	//private String new_aims_code;
	//private String earlier_aims_code;
	private String created_by;
	private Timestamp created_date;
	//private String updated_by;
	//private Timestamp updated_date;
	//private String wf_update_reason;
	
}
