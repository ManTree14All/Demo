package com.tcs.wu.workFlowService.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tcs.wu.workFlowService.modelTables.Workflow_details;
import com.tcs.wu.workFlowService.repository.Workflow_details_Repo;

@Component
public class WorkFlow_DetailsCrudDAO {
	
	@Autowired
	private Workflow_details_Repo repo;

	public String addWorkFlow(Workflow_details workFlow) {
		String stat="WorkFlow Created";
		try {
			repo.save(workFlow);
		}catch(Exception ex) {
			stat="Can you retry for adding workflow,sorry for Inconvinience,retry adding workflow..";
		}
		return stat;
	}
	public List<Workflow_details> findAllWorkflowRecords() {
		List<Workflow_details> list=null;
		try{list=repo.findAll();}catch(NullPointerException ex){System.out.println("No record found");}
		return list;
	}
}
