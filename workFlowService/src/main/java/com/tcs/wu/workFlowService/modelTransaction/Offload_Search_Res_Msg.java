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
@Getter
@Setter
public class Offload_Search_Res_Msg {
	
	private int workflowId; 
	private String aimsCode;
	private int crewId;
	private int pmId;
	private Date incidentDate; 
	private String wfStatus;
	

}
