package com.tcs.wu.workFlowService.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.wu.workFlowService.dao.WorkFlow_DetailsCrudDAO;
import com.tcs.wu.workFlowService.modelTables.Workflow_details;

@Service
public class WorkFlow_DetailsCrudService {
	
	@Autowired
	private WorkFlow_DetailsCrudDAO dao;

	public String addWorkFlow(Workflow_details workFlow) {
		// TODO Auto-generated method stub
		return dao.addWorkFlow(workFlow);
	}

	public List<Workflow_details> findAllWorkflowRecords() {
		// TODO Auto-generated method stub
		return dao.findAllWorkflowRecords();
	}

}
