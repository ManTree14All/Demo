package com.tcs.wu.workFlowService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.wu.workFlowService.modelTables.Workflow_details;
import com.tcs.wu.workFlowService.modelTransaction.Offload_Search_Req_Msg;
import com.tcs.wu.workFlowService.services.OffloadFormSearchService;
import com.tcs.wu.workFlowService.services.WorkFlow_DetailsCrudService;

@RestController
@RequestMapping("/Offload-Form-Search-Controller")
public class OffloadFormSearchController {
	
	@Autowired
	private OffloadFormSearchService service;
	
	@Autowired
	private WorkFlow_DetailsCrudService serviceCrudWF;
	
	@GetMapping("/check")
	public String check() {
		return "Working";
	}
	
	@PostMapping("/add-workflow-details")
	public ResponseEntity<String> addWorkFlow(@RequestBody Workflow_details workFlow){
		return new ResponseEntity<String>(serviceCrudWF.addWorkFlow(workFlow),HttpStatus.OK);
	}
	
	@GetMapping("/find-all-records")
	public ResponseEntity<List<Workflow_details>> findAllWorkflowRecords(){
		return new ResponseEntity<List<Workflow_details>>(serviceCrudWF.findAllWorkflowRecords(),HttpStatus.FOUND);
	}

	@PostMapping(value="search-offload-records")
	public ResponseEntity<List> searchOffloadFormRecords(@RequestBody Offload_Search_Req_Msg offload_Search_Req_Msg) {
		return new ResponseEntity<List>((List) service.searchOffloadFormRecords(offload_Search_Req_Msg),HttpStatus.OK);
		
	}
}
