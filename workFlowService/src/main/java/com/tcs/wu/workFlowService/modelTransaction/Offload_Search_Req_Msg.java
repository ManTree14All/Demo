package com.tcs.wu.workFlowService.modelTransaction;

import java.sql.Date;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Offload_Search_Req_Msg {
	
	private int searchType;
	private int workflowId;//reference_Id
	private String crew_name;
	private int crew_id;
	private Date from_date;
	private Date to_date;
	private String reason;
	private String pm_name;
	private String pm_id;
	private String status;
	private String aims_code;
	
}
