package com.tcs.wu.workFlowService.dao;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tcs.wu.workFlowService.modelTransaction.Offload_Search_Req_Msg;
import com.tcs.wu.workFlowService.modelTransaction.Offload_Search_Res_Msg;
import com.tcs.wu.workFlowService.repository.Workflow_details_Repo;

@Component
public class OffloadFormSearchDAO {
	
	@Autowired
	private Workflow_details_Repo repo;

	public List<Offload_Search_Res_Msg> searchOffloadFormRecords(Offload_Search_Req_Msg offload_Search_Req_Msg) {
		List<Offload_Search_Res_Msg> listOfRecords=new ArrayList();
		switch(offload_Search_Req_Msg.getSearchType()){
		//To find simply by Date 
			case 0:
				try {
					listOfRecords=repo.findByDateSimply(offload_Search_Req_Msg.getFrom_date(), offload_Search_Req_Msg.getTo_date());
					}catch ( Exception ex) {
						System.out.println("Between dates does not carry any records...");
					}
				break;
		//To find simply by Date and refId
			case 1:
				try {
					listOfRecords= repo.findByDateId(offload_Search_Req_Msg.getFrom_date(), offload_Search_Req_Msg.getTo_date(),offload_Search_Req_Msg.getWorkflowId());
				}catch ( Exception ex) {
					System.out.println("Between dates does not carry any records or Your reference id has an issue...");
				}
				break;
			case 2:
				try {
					listOfRecords= repo.findByDateCode(offload_Search_Req_Msg.getFrom_date(), offload_Search_Req_Msg.getTo_date(),offload_Search_Req_Msg.getAims_code());
				}catch ( Exception ex) {
					System.out.println("Between dates does not carry any records or Your reference AimsCode has an issue...");
				}
				break;
			default:
				System.out.println("Kindly provide any search parameters");
		}	
		
		return listOfRecords;
	}

}
